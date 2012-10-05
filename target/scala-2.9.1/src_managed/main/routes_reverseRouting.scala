// @SOURCE:/Users/diegoalmeida/Google Drive/workspaces/java/tarefasapp/conf/routes
// @HASH:6f08a85a58e1b5d6fbc586c23535153f733eb285
// @DATE:Fri Oct 05 15:21:18 BRT 2012

import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:9
// @LINE:6
package controllers {

// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
class ReverseTaskController {
    


 
// @LINE:14
def listTasksOrdered(filter:String) = {
   Call("GET", "/tasks/list/" + implicitly[PathBindable[String]].unbind("filter", filter))
}
                                                        
 
// @LINE:17
def editTask(id:Long) = {
   Call("POST", "/tasks/" + implicitly[PathBindable[Long]].unbind("id", id) + "/edit")
}
                                                        
 
// @LINE:20
def setAsImportant(id:Long) = {
   Call("POST", "/tasks/" + implicitly[PathBindable[Long]].unbind("id", id) + "/important")
}
                                                        
 
// @LINE:15
def newTask() = {
   Call("POST", "/tasks")
}
                                                        
 
// @LINE:19
def cancelTask(id:Long) = {
   Call("POST", "/tasks/" + implicitly[PathBindable[Long]].unbind("id", id) + "/cancel")
}
                                                        
 
// @LINE:18
def completeTask(id:Long) = {
   Call("POST", "/tasks/" + implicitly[PathBindable[Long]].unbind("id", id) + "/complete")
}
                                                        
 
// @LINE:16
def deleteTask(id:Long) = {
   Call("POST", "/tasks/" + implicitly[PathBindable[Long]].unbind("id", id) + "/delete")
}
                                                        
 
// @LINE:13
def listTasks() = {
   Call("GET", "/tasks/list")
}
                                                        
 
// @LINE:12
def tasks() = {
   Call("GET", "/tasks")
}
                                                        

                      
    
}
                            

// @LINE:6
class ReverseApplication {
    


 
// @LINE:6
def index() = {
   Call("GET", "/")
}
                                                        

                      
    
}
                            

// @LINE:9
class ReverseAssets {
    


 
// @LINE:9
def at(file:String) = {
   Call("GET", "/assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                        

                      
    
}
                            
}
                    


// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:9
// @LINE:6
package controllers.javascript {

// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
class ReverseTaskController {
    


 
// @LINE:14
def listTasksOrdered = JavascriptReverseRoute(
   "controllers.TaskController.listTasksOrdered",
   """
      function(filter) {
      return _wA({method:"GET", url:"/tasks/list/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("filter", filter)})
      }
   """
)
                                                        
 
// @LINE:17
def editTask = JavascriptReverseRoute(
   "controllers.TaskController.editTask",
   """
      function(id) {
      return _wA({method:"POST", url:"/tasks/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/edit"})
      }
   """
)
                                                        
 
// @LINE:20
def setAsImportant = JavascriptReverseRoute(
   "controllers.TaskController.setAsImportant",
   """
      function(id) {
      return _wA({method:"POST", url:"/tasks/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/important"})
      }
   """
)
                                                        
 
// @LINE:15
def newTask = JavascriptReverseRoute(
   "controllers.TaskController.newTask",
   """
      function() {
      return _wA({method:"POST", url:"/tasks"})
      }
   """
)
                                                        
 
// @LINE:19
def cancelTask = JavascriptReverseRoute(
   "controllers.TaskController.cancelTask",
   """
      function(id) {
      return _wA({method:"POST", url:"/tasks/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/cancel"})
      }
   """
)
                                                        
 
// @LINE:18
def completeTask = JavascriptReverseRoute(
   "controllers.TaskController.completeTask",
   """
      function(id) {
      return _wA({method:"POST", url:"/tasks/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/complete"})
      }
   """
)
                                                        
 
// @LINE:16
def deleteTask = JavascriptReverseRoute(
   "controllers.TaskController.deleteTask",
   """
      function(id) {
      return _wA({method:"POST", url:"/tasks/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/delete"})
      }
   """
)
                                                        
 
// @LINE:13
def listTasks = JavascriptReverseRoute(
   "controllers.TaskController.listTasks",
   """
      function() {
      return _wA({method:"GET", url:"/tasks/list"})
      }
   """
)
                                                        
 
// @LINE:12
def tasks = JavascriptReverseRoute(
   "controllers.TaskController.tasks",
   """
      function() {
      return _wA({method:"GET", url:"/tasks"})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:6
class ReverseApplication {
    


 
// @LINE:6
def index = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"/"})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:9
class ReverseAssets {
    


 
// @LINE:9
def at = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"/assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                                                        

                      
    
}
                            
}
                    


// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:9
// @LINE:6
package controllers.ref {

// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:16
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
class ReverseTaskController {
    


 
// @LINE:14
def listTasksOrdered(filter:String) = new play.api.mvc.HandlerRef(
   controllers.TaskController.listTasksOrdered(filter), HandlerDef(this, "controllers.TaskController", "listTasksOrdered", Seq(classOf[String]))
)
                              
 
// @LINE:17
def editTask(id:Long) = new play.api.mvc.HandlerRef(
   controllers.TaskController.editTask(id), HandlerDef(this, "controllers.TaskController", "editTask", Seq(classOf[Long]))
)
                              
 
// @LINE:20
def setAsImportant(id:Long) = new play.api.mvc.HandlerRef(
   controllers.TaskController.setAsImportant(id), HandlerDef(this, "controllers.TaskController", "setAsImportant", Seq(classOf[Long]))
)
                              
 
// @LINE:15
def newTask() = new play.api.mvc.HandlerRef(
   controllers.TaskController.newTask(), HandlerDef(this, "controllers.TaskController", "newTask", Seq())
)
                              
 
// @LINE:19
def cancelTask(id:Long) = new play.api.mvc.HandlerRef(
   controllers.TaskController.cancelTask(id), HandlerDef(this, "controllers.TaskController", "cancelTask", Seq(classOf[Long]))
)
                              
 
// @LINE:18
def completeTask(id:Long) = new play.api.mvc.HandlerRef(
   controllers.TaskController.completeTask(id), HandlerDef(this, "controllers.TaskController", "completeTask", Seq(classOf[Long]))
)
                              
 
// @LINE:16
def deleteTask(id:Long) = new play.api.mvc.HandlerRef(
   controllers.TaskController.deleteTask(id), HandlerDef(this, "controllers.TaskController", "deleteTask", Seq(classOf[Long]))
)
                              
 
// @LINE:13
def listTasks() = new play.api.mvc.HandlerRef(
   controllers.TaskController.listTasks(), HandlerDef(this, "controllers.TaskController", "listTasks", Seq())
)
                              
 
// @LINE:12
def tasks() = new play.api.mvc.HandlerRef(
   controllers.TaskController.tasks(), HandlerDef(this, "controllers.TaskController", "tasks", Seq())
)
                              

                      
    
}
                            

// @LINE:6
class ReverseApplication {
    


 
// @LINE:6
def index() = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq())
)
                              

                      
    
}
                            

// @LINE:9
class ReverseAssets {
    


 
// @LINE:9
def at(path:String, file:String) = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]))
)
                              

                      
    
}
                            
}
                    
                