
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
object main extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template3[Html,String,Html,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(title: Html, nav: String = "")(content: Html):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.48*/("""
<!DOCTYPE html>

<html>
<head>
<title>"""),_display_(Seq[Any](/*6.9*/title)),format.raw/*6.14*/("""</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*8.46*/routes/*8.52*/.Assets.at("stylesheets/bootstrap-celulean.min.css"))),format.raw/*8.104*/("""">
<link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*9.46*/routes/*9.52*/.Assets.at("stylesheets/datepicker.css"))),format.raw/*9.92*/("""">
<link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*10.46*/routes/*10.52*/.Assets.at("stylesheets/application.css"))),format.raw/*10.93*/("""">
<link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*11.51*/routes/*11.57*/.Assets.at("img/favicon.png"))),format.raw/*11.86*/("""">
<script src=""""),_display_(Seq[Any](/*12.15*/routes/*12.21*/.Assets.at("javascripts/jquery-1.8.2.min.js"))),format.raw/*12.66*/("""" type="text/javascript"></script>
<script src=""""),_display_(Seq[Any](/*13.15*/routes/*13.21*/.Assets.at("javascripts/jquery-ui-1.8.24.custom.min.js"))),format.raw/*13.77*/("""" type="text/javascript"></script>
<script src=""""),_display_(Seq[Any](/*14.15*/routes/*14.21*/.Assets.at("javascripts/bootstrap.min.js"))),format.raw/*14.63*/("""" type="text/javascript"></script>
<script src=""""),_display_(Seq[Any](/*15.15*/routes/*15.21*/.Assets.at("javascripts/bootstrap-datepicker.js"))),format.raw/*15.70*/("""" type="text/javascript"></script>
<script src=""""),_display_(Seq[Any](/*16.15*/routes/*16.21*/.Assets.at("javascripts/jquery.maskedinput-1.3.min.js"))),format.raw/*16.76*/("""" type="text/javascript"></script>

<!-- <script src=""""),_display_(Seq[Any](/*18.20*/routes/*18.26*/.Assets.at("javascripts/jquery-ui-timepicker-addon.js"))),format.raw/*18.81*/("""" type="text/javascript"></script> -->
<!-- <script src=""""),_display_(Seq[Any](/*19.20*/routes/*19.26*/.Assets.at("javascripts/jquery.form.js"))),format.raw/*19.66*/("""" type="text/javascript"></script> -->

<script>
var yesterday = new Date;
yesterday.setDate(yesterday.getDate() - 1);

        $(document).ready(
                
                function()"""),format.raw("""{"""),format.raw/*27.28*/("""

	                $('.datepicker').datepicker(
	                """),format.raw("""{"""),format.raw/*30.19*/("""
	                    format: 'dd/mm/yyyy',
	             		autoclose: 'true',
	             		todayHighlight: 'true',
	             		todayBtn: "linked",
	             		language: 'br',
	             		startDate: yesterday,
	             		endDate: '30/12/2099'             		
	                """),format.raw("""}"""),format.raw/*38.19*/(""");        
	         	                
					$('*[title]').tooltip();
	
					$('#listagem').show("blind", "slow");		
	
					$('.datepicker').mask("99/99/9999","""),format.raw("""{"""),format.raw/*44.42*/("""placeholder:" """"),format.raw("""}"""),format.raw/*44.58*/(""");

					$('.draggable').draggable("""),format.raw("""{"""),format.raw/*46.33*/("""
						revert: "invalid",
						distance: 30,
						cursor: "move",
						cursorAt: """),format.raw("""{"""),format.raw/*50.18*/(""" top: 32, left: 32 """),format.raw("""}"""),format.raw/*50.38*/(""",
						helper: function( event ) """),format.raw("""{"""),format.raw/*51.34*/("""
							return $( "<div class='dragging'>"+$(this).text()+"</div>" );
						"""),format.raw("""}"""),format.raw/*53.8*/(""" 
						"""),format.raw("""}"""),format.raw/*54.8*/(""");

					$('.droppable').droppable("""),format.raw("""{"""),format.raw/*56.33*/("""
						greedy: true,
						accept: ".draggable",
						hoverClass: "visiblesobre",
						activeClass: "visivel",
						drop: function( event, ui ) """),format.raw("""{"""),format.raw/*61.36*/("""
							$( this )
							.addClass( "oculta" )
							alert('Excluido')
						"""),format.raw("""}"""),format.raw/*65.8*/(""",
						activate: function(event, ui) """),format.raw("""{"""),format.raw/*66.38*/("""
							$( this ).toggleClass("visivel")
						"""),format.raw("""}"""),format.raw/*68.8*/("""
					"""),format.raw("""}"""),format.raw/*69.7*/(""");
                    
                """),format.raw("""}"""),format.raw/*71.18*/(""");
        </script>
</head>
<body>


	<div class="navbar">
		<div class="navbar-inner">
			<a class="brand" href="#">Task Manager</a>
			<ul class="nav">
				<li class=""""),_display_(Seq[Any](/*81.17*/("active".when(nav=="home")))),format.raw/*81.45*/(""""><a
					href=""""),_display_(Seq[Any](/*82.13*/routes/*82.19*/.Application.index())),format.raw/*82.39*/(""""><i
						class="icon-home icon-white"></i> Principal</a></li>
				<li class=""""),_display_(Seq[Any](/*84.17*/("active".when(nav=="new")))),format.raw/*84.44*/(""""><a href=""""),_display_(Seq[Any](/*84.56*/routes/*84.62*/.TaskController.tasks())),format.raw/*84.85*/(""""><i
						class="icon-file icon-white"></i> Nova tarefa</a></li>
				<li class=""""),_display_(Seq[Any](/*86.17*/("active".when(nav=="listing")))),format.raw/*86.48*/(""""><a
					href=""""),_display_(Seq[Any](/*87.13*/routes/*87.19*/.TaskController.listTasks())),format.raw/*87.46*/(""""><i class="icon-th icon-white"></i> Lista</a></li>
			</ul>
		</div>
	</div>

	<div class="container-fluid">

		<div class="content">

			<div class="page-header">
				<h1>"""),_display_(Seq[Any](/*97.10*/title)),format.raw/*97.15*/("""</h1>
			</div>

			<div class="row-fluid">
				<div class="span12">"""),_display_(Seq[Any](/*101.26*/content)),format.raw/*101.33*/("""</div>
			</div>

		</div>

		<footer>
			<p>
				<a href="http://www.playframework.org">www.playframework.org</a>
			</p>
		</footer>

	</div>
</body>
</html>"""))}
    }
    
    def render(title:Html,nav:String,content:Html) = apply(title,nav)(content)
    
    def f:((Html,String) => (Html) => play.api.templates.Html) = (title,nav) => (content) => apply(title,nav)(content)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Oct 05 16:30:43 BRT 2012
                    SOURCE: D:/AmbientePlay/workspace/tarefasapp/app/views/main.scala.html
                    HASH: df5a6ad79c4b94f59ef6b8af1f8432bcbc993a54
                    MATRIX: 764->1|887->47|961->87|987->92|1146->216|1160->222|1234->274|1317->322|1331->328|1392->368|1476->416|1491->422|1554->463|1643->516|1658->522|1709->551|1762->568|1777->574|1844->619|1929->668|1944->674|2022->730|2107->779|2122->785|2186->827|2271->876|2286->882|2357->931|2442->980|2457->986|2534->1041|2625->1096|2640->1102|2717->1157|2811->1215|2826->1221|2888->1261|3126->1452|3239->1518|3582->1814|3788->1973|3851->1989|3934->2025|4066->2110|4133->2130|4215->2165|4338->2242|4393->2251|4476->2287|4671->2435|4796->2514|4882->2553|4976->2601|5029->2608|5117->2649|5324->2820|5374->2848|5427->2865|5442->2871|5484->2891|5600->2971|5649->2998|5697->3010|5712->3016|5757->3039|5875->3121|5928->3152|5981->3169|5996->3175|6045->3202|6255->3376|6282->3381|6388->3450|6418->3457
                    LINES: 27->1|30->1|35->6|35->6|37->8|37->8|37->8|38->9|38->9|38->9|39->10|39->10|39->10|40->11|40->11|40->11|41->12|41->12|41->12|42->13|42->13|42->13|43->14|43->14|43->14|44->15|44->15|44->15|45->16|45->16|45->16|47->18|47->18|47->18|48->19|48->19|48->19|56->27|59->30|67->38|73->44|73->44|75->46|79->50|79->50|80->51|82->53|83->54|85->56|90->61|94->65|95->66|97->68|98->69|100->71|110->81|110->81|111->82|111->82|111->82|113->84|113->84|113->84|113->84|113->84|115->86|115->86|116->87|116->87|116->87|126->97|126->97|130->101|130->101
                    -- GENERATED --
                */
            