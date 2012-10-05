
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
object bootstrapTemplate extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[helper.FieldElements,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(elements: helper.FieldElements):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.34*/("""

"""),format.raw/*5.52*/("""
<div class="control-group """),_display_(Seq[Any](/*6.28*/if(elements.hasErrors)/*6.50*/ {_display_(Seq[Any](format.raw/*6.52*/("""error""")))})),format.raw/*6.58*/("""">
    <label for=""""),_display_(Seq[Any](/*7.18*/elements/*7.26*/.id)),format.raw/*7.29*/("""">"""),_display_(Seq[Any](/*7.32*/elements/*7.40*/.label)),format.raw/*7.46*/("""</label>"""),_display_(Seq[Any](/*7.55*/if(elements.hasErrors)/*7.77*/ {_display_(Seq[Any](format.raw/*7.79*/("""
        <span class="help-block">"""),_display_(Seq[Any](/*8.35*/elements/*8.43*/.errors.mkString(", "))),format.raw/*8.65*/("""</span>
        """)))})),format.raw/*9.10*/("""
    <div class="control">
      	"""),_display_(Seq[Any](/*11.9*/elements/*11.17*/.input)),format.raw/*11.23*/("""      	
    </div>
</div> """))}
    }
    
    def render(elements:helper.FieldElements) = apply(elements)
    
    def f:((helper.FieldElements) => play.api.templates.Html) = (elements) => apply(elements)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Oct 05 16:30:42 BRT 2012
                    SOURCE: D:/AmbientePlay/workspace/tarefasapp/app/views/bootstrapTemplate.scala.html
                    HASH: 1eb3e389d5933cff59904cc6217ee42e1cc17bf8
                    MATRIX: 781->1|890->33|921->194|985->223|1015->245|1054->247|1091->253|1147->274|1163->282|1187->285|1225->288|1241->296|1268->302|1312->311|1342->333|1381->335|1452->371|1468->379|1511->401|1560->419|1632->456|1649->464|1677->470
                    LINES: 27->1|30->1|32->5|33->6|33->6|33->6|33->6|34->7|34->7|34->7|34->7|34->7|34->7|34->7|34->7|34->7|35->8|35->8|35->8|36->9|38->11|38->11|38->11
                    -- GENERATED --
                */
            