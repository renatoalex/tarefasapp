
package views.html.tasks

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.api.templates.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import com.avaje.ebean._
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object form extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[List[Task],Form[Task],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(tasks: List[Task], taskForm: Form[Task]):play.api.templates.Html = {
        _display_ {import helper._ 

import helper.twitterBootstrap._ 


Seq[Any](format.raw/*1.43*/(""" 
"""),_display_(Seq[Any](/*4.2*/main(Html("Dashboard"), nav = "new")/*4.38*/ {_display_(Seq[Any](format.raw/*4.40*/("""

    <div class="span3 container well">
      <!--Sidebar content-->
      """),_display_(Seq[Any](/*8.8*/formulario(taskForm))),format.raw/*8.28*/("""     
    </div>
    <div class="span9 container well" id="listaTarefas">
      <!--Body content-->
       """),_display_(Seq[Any](/*12.9*/listagem(tasks))),format.raw/*12.24*/("""
    </div>

""")))})),format.raw/*15.2*/("""
"""))}
    }
    
    def render(tasks:List[Task],taskForm:Form[Task]) = apply(tasks,taskForm)
    
    def f:((List[Task],Form[Task]) => play.api.templates.Html) = (tasks,taskForm) => apply(tasks,taskForm)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Oct 05 16:30:43 BRT 2012
                    SOURCE: D:/AmbientePlay/workspace/tarefasapp/app/views/tasks/form.scala.html
                    HASH: 4ffdb87f7d244a37e73d59cbe3bf7b0362dfde81
                    MATRIX: 775->1|945->42|982->98|1026->134|1065->136|1176->213|1217->233|1360->341|1397->356|1442->370
                    LINES: 27->1|33->1|34->4|34->4|34->4|38->8|38->8|42->12|42->12|45->15
                    -- GENERATED --
                */
            