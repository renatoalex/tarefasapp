package controllers;

import java.util.Locale;

import models.Task;

import org.joda.time.LocalDateTime;
import org.joda.time.format.DateTimeFormat;

import play.data.Form;
import play.data.format.Formatters;
import play.mvc.Controller;
import play.mvc.Result;

public class TaskController extends Controller {

	static Form<Task> taskForm = form(Task.class);

	public static Result tasks() {
		return ok(views.html.tasks.form.render(Task.all(), taskForm));
	}

	public static Result listTasks() {
		return ok(views.html.tasks.list.render(Task.all()));
	}

	public static Result listTasksOrdered(String filter) {
		return ok(views.html.tasks.list.render(Task.allOrderedBy(filter)));
	}

	public static Result newTask() {
		Formatters.register(LocalDateTime.class,
				new Formatters.SimpleFormatter<LocalDateTime>() {

					@Override
					public LocalDateTime parse(String input, Locale l) {
						LocalDateTime formatada = LocalDateTime.parse(input,
								DateTimeFormat.forPattern("dd/MM/yyyy"));
						return formatada;
					}

					@Override
					public String print(LocalDateTime localTime, Locale l) {
						return localTime.toString("dd/MM/yyyy");
					}
				});

		Form<Task> filledForm = taskForm.bindFromRequest();

		if (filledForm.hasErrors()) {
			return badRequest(views.html.tasks.form.render(Task.all(),
					filledForm));
		} else {
			if (filledForm.get().id == null) {
				Task.create(filledForm.get());
			} else {
				Task.update(filledForm.get());
			}
			return redirect(routes.TaskController.tasks());
		}
	}

	public static Result editTask(Long id) {
		Task nova = Task.retrieve(id);
		nova.id = id;
		Form<Task> filledForm = taskForm.fill(nova);
		return ok(views.html.tasks.form.render(Task.all(), filledForm));
	}

	public static Result deleteTask(Long id) {
		Task.delete(id);
		return redirect(routes.TaskController.tasks());
	}

}
