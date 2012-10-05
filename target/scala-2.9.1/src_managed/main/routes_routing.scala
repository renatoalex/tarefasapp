// @SOURCE:/Users/diegoalmeida/Google Drive/workspaces/java/tarefasapp/conf/routes
// @HASH:6f08a85a58e1b5d6fbc586c23535153f733eb285
// @DATE:Fri Oct 05 15:21:18 BRT 2012

import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {


// @LINE:6
val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart("/"))))
                    

// @LINE:9
val controllers_Assets_at1 = Route("GET", PathPattern(List(StaticPart("/assets/"),DynamicPart("file", """.+"""))))
                    

// @LINE:12
val controllers_TaskController_tasks2 = Route("GET", PathPattern(List(StaticPart("/tasks"))))
                    

// @LINE:13
val controllers_TaskController_listTasks3 = Route("GET", PathPattern(List(StaticPart("/tasks/list"))))
                    

// @LINE:14
val controllers_TaskController_listTasksOrdered4 = Route("GET", PathPattern(List(StaticPart("/tasks/list/"),DynamicPart("filter", """[^/]+"""))))
                    

// @LINE:15
val controllers_TaskController_newTask5 = Route("POST", PathPattern(List(StaticPart("/tasks"))))
                    

// @LINE:16
val controllers_TaskController_deleteTask6 = Route("POST", PathPattern(List(StaticPart("/tasks/"),DynamicPart("id", """[^/]+"""),StaticPart("/delete"))))
                    

// @LINE:17
val controllers_TaskController_editTask7 = Route("POST", PathPattern(List(StaticPart("/tasks/"),DynamicPart("id", """[^/]+"""),StaticPart("/edit"))))
                    

// @LINE:18
val controllers_TaskController_completeTask8 = Route("POST", PathPattern(List(StaticPart("/tasks/"),DynamicPart("id", """[^/]+"""),StaticPart("/complete"))))
                    

// @LINE:19
val controllers_TaskController_cancelTask9 = Route("POST", PathPattern(List(StaticPart("/tasks/"),DynamicPart("id", """[^/]+"""),StaticPart("/cancel"))))
                    

// @LINE:20
val controllers_TaskController_setAsImportant10 = Route("POST", PathPattern(List(StaticPart("/tasks/"),DynamicPart("id", """[^/]+"""),StaticPart("/important"))))
                    
def documentation = List(("""GET""","""/""","""controllers.Application.index()"""),("""GET""","""/assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""GET""","""/tasks""","""controllers.TaskController.tasks()"""),("""GET""","""/tasks/list""","""controllers.TaskController.listTasks()"""),("""GET""","""/tasks/list/$filter<[^/]+>""","""controllers.TaskController.listTasksOrdered(filter:String)"""),("""POST""","""/tasks""","""controllers.TaskController.newTask()"""),("""POST""","""/tasks/$id<[^/]+>/delete""","""controllers.TaskController.deleteTask(id:Long)"""),("""POST""","""/tasks/$id<[^/]+>/edit""","""controllers.TaskController.editTask(id:Long)"""),("""POST""","""/tasks/$id<[^/]+>/complete""","""controllers.TaskController.completeTask(id:Long)"""),("""POST""","""/tasks/$id<[^/]+>/cancel""","""controllers.TaskController.cancelTask(id:Long)"""),("""POST""","""/tasks/$id<[^/]+>/important""","""controllers.TaskController.setAsImportant(id:Long)"""))
             
    
def routes:PartialFunction[RequestHeader,Handler] = {        

// @LINE:6
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Nil))
   }
}
                    

// @LINE:9
case controllers_Assets_at1(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(_root_.controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String])))
   }
}
                    

// @LINE:12
case controllers_TaskController_tasks2(params) => {
   call { 
        invokeHandler(_root_.controllers.TaskController.tasks(), HandlerDef(this, "controllers.TaskController", "tasks", Nil))
   }
}
                    

// @LINE:13
case controllers_TaskController_listTasks3(params) => {
   call { 
        invokeHandler(_root_.controllers.TaskController.listTasks(), HandlerDef(this, "controllers.TaskController", "listTasks", Nil))
   }
}
                    

// @LINE:14
case controllers_TaskController_listTasksOrdered4(params) => {
   call(params.fromPath[String]("filter", None)) { (filter) =>
        invokeHandler(_root_.controllers.TaskController.listTasksOrdered(filter), HandlerDef(this, "controllers.TaskController", "listTasksOrdered", Seq(classOf[String])))
   }
}
                    

// @LINE:15
case controllers_TaskController_newTask5(params) => {
   call { 
        invokeHandler(_root_.controllers.TaskController.newTask(), HandlerDef(this, "controllers.TaskController", "newTask", Nil))
   }
}
                    

// @LINE:16
case controllers_TaskController_deleteTask6(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.TaskController.deleteTask(id), HandlerDef(this, "controllers.TaskController", "deleteTask", Seq(classOf[Long])))
   }
}
                    

// @LINE:17
case controllers_TaskController_editTask7(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.TaskController.editTask(id), HandlerDef(this, "controllers.TaskController", "editTask", Seq(classOf[Long])))
   }
}
                    

// @LINE:18
case controllers_TaskController_completeTask8(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.TaskController.completeTask(id), HandlerDef(this, "controllers.TaskController", "completeTask", Seq(classOf[Long])))
   }
}
                    

// @LINE:19
case controllers_TaskController_cancelTask9(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.TaskController.cancelTask(id), HandlerDef(this, "controllers.TaskController", "cancelTask", Seq(classOf[Long])))
   }
}
                    

// @LINE:20
case controllers_TaskController_setAsImportant10(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.TaskController.setAsImportant(id), HandlerDef(this, "controllers.TaskController", "setAsImportant", Seq(classOf[Long])))
   }
}
                    
}
    
}
                