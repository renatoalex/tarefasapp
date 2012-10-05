
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
object listagem extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[List[Task],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(tasks: List[Task]):play.api.templates.Html = {
        _display_ {import helper._ 

import helper.twitterBootstrap._ 


Seq[Any](format.raw/*1.21*/(""" 
"""),format.raw/*4.1*/("""
			<div id="listagem">
				
				"""),_display_(Seq[Any](/*7.6*/if(tasks.isEmpty())/*7.25*/ {_display_(Seq[Any](format.raw/*7.27*/("""
				<h2>Você não possui nenhuma tarefa</h2>
				""")))}/*9.7*/else/*9.12*/{_display_(Seq[Any](format.raw/*9.13*/("""				
				
				<div class="alert alert-info">
		  		<button type="button" class="close" data-dismiss="alert">&times;</button>
				  Você possui """),_display_(Seq[Any](/*13.20*/tasks/*13.25*/.size())),format.raw/*13.32*/(""" tarefa(s) adicionada(s)
				</div>
				
				<div class="btn-toolbar">
					<div class="btn-group">
						<a href="/tasks/list/label" class="btn">
							<i class="icon-font"></i>
						</a>
						<a href="/tasks/list/timeCreation" class="btn">
							<i class="icon-font"></i>
						</a>
						<a href="/tasks/list/timeEnding" class="btn">
							<i class="icon-font"></i>
						</a>
					</div>
				</div>
				
				<table class="table table-condensed">				
					<tbody>
						"""),_display_(Seq[Any](/*32.8*/for(task <- tasks) yield /*32.26*/ {_display_(Seq[Any](format.raw/*32.28*/("""
						<div class="entrada">
							<tr class="linha-tabela-bem-escura">
								<td>
									<h3><strong class="draggable">"""),_display_(Seq[Any](/*36.41*/task/*36.45*/.label)),format.raw/*36.51*/("""</strong></h3>	
								</td>
								<td colspan="2">
								<ul class="nav">
									<li>
										"""),_display_(Seq[Any](/*41.12*/helper/*41.18*/.form(routes.TaskController.editTask(task.id),
										args = 'class -> "pull-left")/*42.40*/ {_display_(Seq[Any](format.raw/*42.42*/(""" 
											<button class="btn btn-primary btn-small fixedwidth"><i class="icon-white icon-pencil"></i><p>Editar</p></button>
										""")))})),format.raw/*44.12*/("""	
									</li>	
									<li>							
										"""),_display_(Seq[Any](/*47.12*/if(task.status.equals(TaskStatus.PENDING) || task.status.equals(TaskStatus.DELAYED))/*47.96*/{_display_(Seq[Any](format.raw/*47.97*/("""
											"""),_display_(Seq[Any](/*48.13*/helper/*48.19*/.form(routes.TaskController.completeTask(task.id),
											args = 'class -> "pull-left")/*49.41*/ {_display_(Seq[Any](format.raw/*49.43*/("""
												<button class="btn btn-success btn-small fixedwidth"><i class="icon-white icon-ok"></i><p>Completar</p></button>
											""")))})),format.raw/*51.13*/("""									
										""")))}/*52.13*/else/*52.18*/{_display_(Seq[Any](format.raw/*52.19*/("""
											<span class="pull-left">
												<button class="btn btn-success btn-small fixedwidth disabled" disabled><i class="icon-white icon-ok"></i><p>Completar</p></button>										
											</span>
										""")))})),format.raw/*56.12*/("""
									</li>	
									<li>
										"""),_display_(Seq[Any](/*59.12*/if(!task.status.equals(TaskStatus.CANCELED))/*59.56*/{_display_(Seq[Any](format.raw/*59.57*/("""
											"""),_display_(Seq[Any](/*60.13*/helper/*60.19*/.form(routes.TaskController.cancelTask(task.id),
											args = 'class -> "pull-left")/*61.41*/ {_display_(Seq[Any](format.raw/*61.43*/("""
												<button class="btn btn-warning btn-small fixedwidth"><i class="icon-white icon-arrow-down"></i><p>Cancelar</p></button>
											""")))})),format.raw/*63.13*/("""
										""")))}/*64.13*/else/*64.18*/{_display_(Seq[Any](format.raw/*64.19*/("""
											<span class="pull-left">
												<button class="btn btn-warning btn-small fixedwidth disabled" disabled><i class="icon-white icon-arrow-down"></i><p>Cancelar</p></button>
											</span>
										""")))})),format.raw/*68.12*/("""
									</li>	
									<li>
										"""),_display_(Seq[Any](/*71.12*/helper/*71.18*/.form(routes.TaskController.deleteTask(task.id),
										args = 'class -> "pull-left")/*72.40*/ {_display_(Seq[Any](format.raw/*72.42*/("""
											<button class="btn btn-danger btn-small fixedwidth"><i class="icon-white icon-trash"></i><p>Excluir</p></button>
										""")))})),format.raw/*74.12*/("""
									</li>
								</ul>										
								</td>
							</tr>	
							<tr class="droppable">
								<td colspan="3">
								"""),_display_(Seq[Any](/*81.10*/helper/*81.16*/.form(routes.TaskController.setAsImportant(task.id),
										args = 'class -> "pull-left")/*82.40*/ {_display_(Seq[Any](format.raw/*82.42*/("""
										"""),_display_(Seq[Any](/*83.12*/if(task.important!= null && task.important.equals(Boolean.TRUE))/*83.76*/{_display_(Seq[Any](format.raw/*83.77*/("""
											<button class="btn btn-danger btn-small fixedwidth"><i class="icon-white icon-warning-sign"></i> Importante</button>
										""")))}/*85.13*/else/*85.18*/{_display_(Seq[Any](format.raw/*85.19*/("""										
											<button class="btn btn-small fixedwidth"><i class="icon-white icon-warning-sign"></i> Marcar como importante</button>
										""")))})),format.raw/*87.12*/("""
								""")))})),format.raw/*88.10*/("""
								
								</td>
							</tr>			
							<tr valign="middle" class="linha-tabela-escura">
									<td><span>Prazo para conclusão</span></td>
									<td><span>Data de encerramento</span></td>
									<td><span>Status</span></td>
							</tr>
							<tr class="linha-tabela">
									<td><span class="text-info">"""),_display_(Seq[Any](/*98.39*/task/*98.43*/.timeLeftBeforeExpires())),format.raw/*98.67*/("""</span></td>
									<td><span class="text-info">"""),_display_(Seq[Any](/*99.39*/task/*99.43*/.dateEndingFormatted())),format.raw/*99.65*/("""</span></td>
									<td><span class="label" title="Status da atividade">"""),_display_(Seq[Any](/*100.63*/task/*100.67*/.statusFormatted())),format.raw/*100.85*/("""</span></td>
							</tr>
						</div>
						""")))})),format.raw/*103.8*/("""
					</tbody>
				</table>
					""")))})),format.raw/*106.7*/("""
				</div>
"""))}
    }
    
    def render(tasks:List[Task]) = apply(tasks)
    
    def f:((List[Task]) => play.api.templates.Html) = (tasks) => apply(tasks)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Oct 05 16:30:43 BRT 2012
                    SOURCE: D:/AmbientePlay/workspace/tarefasapp/app/views/tasks/listagem.scala.html
                    HASH: 228688cdc4a411aa6fb866450cd07965fe59d7ba
                    MATRIX: 768->1|916->20|944->75|1012->109|1039->128|1078->130|1145->181|1157->186|1195->187|1375->331|1389->336|1418->343|1932->822|1966->840|2006->842|2168->968|2181->972|2209->978|2350->1083|2365->1089|2460->1175|2500->1177|2670->1315|2756->1365|2849->1449|2888->1450|2937->1463|2952->1469|3052->1560|3092->1562|3262->1700|3302->1722|3315->1727|3354->1728|3606->1948|3684->1990|3737->2034|3776->2035|3825->2048|3840->2054|3938->2143|3978->2145|4155->2290|4186->2303|4199->2308|4238->2309|4487->2526|4565->2568|4580->2574|4677->2662|4717->2664|4885->2800|5053->2932|5068->2938|5169->3030|5209->3032|5257->3044|5330->3108|5369->3109|5528->3250|5541->3255|5580->3256|5763->3407|5805->3417|6163->3739|6176->3743|6222->3767|6309->3818|6322->3822|6366->3844|6478->3919|6492->3923|6533->3941|6611->3987|6677->4021
                    LINES: 27->1|33->1|34->4|37->7|37->7|37->7|39->9|39->9|39->9|43->13|43->13|43->13|62->32|62->32|62->32|66->36|66->36|66->36|71->41|71->41|72->42|72->42|74->44|77->47|77->47|77->47|78->48|78->48|79->49|79->49|81->51|82->52|82->52|82->52|86->56|89->59|89->59|89->59|90->60|90->60|91->61|91->61|93->63|94->64|94->64|94->64|98->68|101->71|101->71|102->72|102->72|104->74|111->81|111->81|112->82|112->82|113->83|113->83|113->83|115->85|115->85|115->85|117->87|118->88|128->98|128->98|128->98|129->99|129->99|129->99|130->100|130->100|130->100|133->103|136->106
                    -- GENERATED --
                */
            