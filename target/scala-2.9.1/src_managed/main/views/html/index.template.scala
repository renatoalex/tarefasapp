
package views.html

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
object index extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.Html] {

    /**/
    def apply():play.api.templates.Html = {
        _display_ {

Seq[Any](_display_(Seq[Any](/*1.2*/main(Html("Form samples"), nav = "home")/*1.42*/ {_display_(Seq[Any](format.raw/*1.44*/("""

<div class="hero-unit">
  <h1>Controle de tarefas</h1>
  <p>Gerencie suas tarefas facilmente</p>
  <p>
    <a class="btn btn-primary btn-large" href="/tasks">
      Come�ar
    </a>
  </p>
</div>

""")))})),format.raw/*13.2*/("""
"""))}
    }
    
    def render() = apply()
    
    def f:(() => play.api.templates.Html) = () => apply()
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Oct 05 15:21:19 BRT 2012
                    SOURCE: /Users/diegoalmeida/Google Drive/workspaces/java/tarefasapp/app/views/index.scala.html
                    HASH: 35dc782810c54142a7f9d348b2ff919ab3fac73d
                    MATRIX: 828->1|876->41|915->43|1146->243
                    LINES: 30->1|30->1|30->1|42->13
                    -- GENERATED --
                */
            