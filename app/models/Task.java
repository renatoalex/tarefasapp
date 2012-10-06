package models;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

import org.hibernate.annotations.Type;
import org.joda.time.LocalDateTime;
import org.joda.time.Period;
import org.joda.time.Seconds;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.PeriodFormatter;
import org.joda.time.format.PeriodFormatterBuilder;

import play.data.validation.Constraints.Required;
import play.db.ebean.Model;
import scala.actors.threadpool.Arrays;

@Entity
public class Task extends Model {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4781377571624040428L;

	@Id
	public Long id;

	@Required
	public String label;

	@Type(type = "org.jadira.usertype.dateandtime.joda.PersistentLocalTime")
	public LocalDateTime timeCreation;

	@Type(type = "org.jadira.usertype.dateandtime.joda.PersistentLocalTime")
	public LocalDateTime timeEnding;

	@Required
	public int secondsEnding;

	@Required
	@Enumerated(EnumType.STRING)
	public TaskStatus status = TaskStatus.PENDING;

	public Boolean important = Boolean.FALSE;

	static boolean asc = true;

	public static List<Task> all() {
		List<Task> allTasks = find.findList();

		for (Task task : allTasks) {
			if (task.status.equals(TaskStatus.PENDING)) {
				if (task.isExpired())
					task.status = TaskStatus.DELAYED;
			}
		}

		return allTasks;
	}

	public static List<Task> allOrderedBy(String filter) {

		Set<String> valids = new HashSet<String>();

		valids.addAll(Arrays.asList(new String[] { "label", "timeCreation",
				"timeEnding" }));

		List<Task> allTasks;
		if (valids.contains(filter)) {
			allTasks = find.orderBy(filter + " " + (asc ? "asc" : "desc"))
					.findList();
			asc = !asc;
		} else {
			allTasks = find.findList();
		}

		for (Task task : allTasks) {
			if (task.status.equals(TaskStatus.PENDING)) {
				if (task.isExpired())
					task.status = TaskStatus.DELAYED;
			}
		}

		return allTasks;
	}

	public static void create(Task task) {
		task.timeCreation = LocalDateTime.now();
		task.save();
	}

	public static void delete(Long id) {
		find.ref(id).delete();
	}

	public static void update(Task task) {
		task.update();
	}

	public static Task retrieve(Long id) {
		return find.ref(id);
	}

	public static Finder<Long, Task> find = new Finder<Long, Task>(Long.class,
			Task.class);

	public String timeSinceCreation() {
		if (timeCreation != null) {
			int diff = Seconds
					.secondsBetween(timeCreation, LocalDateTime.now())
					.getSeconds();
			PeriodFormatter daysHoursMinutes = new PeriodFormatterBuilder()
					.appendDays().appendSuffix(" dia", " dias")
					.appendSeparator(" e ").appendMinutes()
					.appendSuffix(" minuto", " minutos").appendSeparator(" e ")
					.appendSeconds().appendSuffix(" segundo", " segundos")
					.toFormatter();
			return daysHoursMinutes.print(new Period(Seconds.seconds(diff))
					.normalizedStandard());
		} else
			return "";
	}

	public String dateEndingFormatted() {
		return DateTimeFormat.forPattern("dd/MM/yyyy").print(
				timeEnding.toDateTime());
	}

	public String statusFormatted() {
		return status != null ? status.getLabel() : "";
	}

	public String timeLeftBeforeExpires() {
		if (timeCreation != null
				&& (status.equals(TaskStatus.DELAYED) || status
						.equals(TaskStatus.PENDING))) {
			int diff = Seconds
					.secondsBetween(timeCreation, LocalDateTime.now())
					.getSeconds();

			int left = secondsEnding - diff;

			PeriodFormatter daysHoursMinutes = new PeriodFormatterBuilder()
					.appendDays().appendSuffix(" dia", " dias")
					.appendSeparator(" e ").appendMinutes()
					.appendSuffix(" minuto", " minutos").appendSeparator(" e ")
					.appendSeconds().appendSuffix(" segundo", " segundos")
					.toFormatter();
			return ((left < 0) ? "Atrasado em " : "")
					+ daysHoursMinutes.print(new Period(Seconds.seconds(Math
							.abs(left))).normalizedStandard());
		} else
			return "";
	}

	public boolean isExpired() {
		if (timeCreation != null) {
			int diff = Seconds
					.secondsBetween(timeCreation, LocalDateTime.now())
					.getSeconds();
			int left = secondsEnding - diff;

			return (left <= 0);
		}
		return false;
	}

}
