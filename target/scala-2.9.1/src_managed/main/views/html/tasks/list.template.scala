
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
object list extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[List[Task],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(tasks: List[Task]):play.api.templates.Html = {
        _display_ {import helper._ 

import helper.twitterBootstrap._


Seq[Any](format.raw/*1.21*/(""" 
"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/main(Html("Lista de tarefas"), nav = "listing")/*5.49*/ {_display_(Seq[Any](format.raw/*5.51*/("""

<div class="container">
  <div class="row">
    <div class="span10">
      <!--Sidebar content-->
      """),_display_(Seq[Any](/*11.8*/listagem(tasks))),format.raw/*11.23*/("""
    </div>
  </div>  
  
</div>


""")))})),format.raw/*18.2*/("""
"""))}
    }
    
    def render(tasks:List[Task]) = apply(tasks)
    
    def f:((List[Task]) => play.api.templates.Html) = (tasks) => apply(tasks)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Oct 05 15:21:19 BRT 2012
                    SOURCE: /Users/diegoalmeida/Google Drive/workspaces/java/tarefasapp/app/views/tasks/list.scala.html
                    HASH: 25a3a455eb3ef02ce53475c17ac903294fd8c6e6
                    MATRIX: 764->1|911->20|939->74|975->76|1030->123|1069->125|1211->232|1248->247|1315->283
                    LINES: 27->1|33->1|34->4|35->5|35->5|35->5|41->11|41->11|48->18
                    -- GENERATED --
                */
            