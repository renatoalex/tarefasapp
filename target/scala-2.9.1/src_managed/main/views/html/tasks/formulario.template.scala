
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
object formulario extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[Task],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(taskForm: Form[Task]):play.api.templates.Html = {
        _display_ {import helper._ 

import helper.twitterBootstrap._ 

implicit def /*4.2*/implicitField/*4.15*/ = {{ FieldConstructor(bootstrapTemplate.f) }};
Seq[Any](format.raw/*1.24*/(""" 
"""),format.raw/*4.60*/("""

			<div class="cadastro">
				<div class="span6">					
					"""),_display_(Seq[Any](/*8.7*/helper/*8.13*/.form(routes.TaskController.newTask(), args = 'class -> "well", 'class -> "form-horizontal", 'id -> "formNewTask", 'autocomplete-> "off" )/*8.151*/ {_display_(Seq[Any](format.raw/*8.153*/("""
					<h3>Nova tarefa</h3>
					<fieldset>
							"""),_display_(Seq[Any](/*11.9*/inputText( taskForm("label"), 
							'_label -> "Descrição", 
							'placeholder -> "Detalhe a atividade",
							'class -> "input-xlarge" ))),format.raw/*14.34*/("""

							"""),_display_(Seq[Any](/*16.9*/inputText(taskForm("timeEnding"), 
							'_label -> "Data da	conclusão", 
							'class -> "datepicker input-medium" ))),format.raw/*18.45*/(""" 
						
							"""),_display_(Seq[Any](/*20.9*/inputText(taskForm("secondsEnding"),
							'_label -> "Duração (segundos)", 
							'type -> "number", 
							'class -> "input-mini" ))),format.raw/*23.32*/(""" 
							
							"""),_display_(Seq[Any](/*25.9*/select(taskForm("status"), 
							options = options(TaskStatus.allAsMap()), 
							'_default -> "Selecione uma	opção", 
							'_label -> "Status", 
							'class -> "input-large" ))),format.raw/*29.33*/("""
					</fieldset>
					<input type="hidden" value=""""),_display_(Seq[Any](/*31.35*/taskForm("id")/*31.49*/.value)),format.raw/*31.55*/("""" name="id" /> 
					<input type="submit" id="btnSubmit" class="btn btn-primary" value="Cadastrar">					
					<input type="reset" class="btn btn-warning" value="Limpar">
					 """)))})),format.raw/*34.8*/("""
				</div>
			</div>"""))}
    }
    
    def render(taskForm:Form[Task]) = apply(taskForm)
    
    def f:((Form[Task]) => play.api.templates.Html) = (taskForm) => apply(taskForm)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Oct 05 16:30:43 BRT 2012
                    SOURCE: D:/AmbientePlay/workspace/tarefasapp/app/views/tasks/formulario.scala.html
                    HASH: 9cad965092087f3289c4a8ce9f7cf1ae5d80308e
                    MATRIX: 770->1|913->79|934->92|1009->23|1038->137|1135->200|1149->206|1296->344|1336->346|1422->397|1586->539|1631->549|1772->668|1824->685|1982->821|2035->839|2240->1022|2328->1074|2351->1088|2379->1094|2587->1271
                    LINES: 27->1|32->4|32->4|33->1|34->4|38->8|38->8|38->8|38->8|41->11|44->14|46->16|48->18|50->20|53->23|55->25|59->29|61->31|61->31|61->31|64->34
                    -- GENERATED --
                */
            