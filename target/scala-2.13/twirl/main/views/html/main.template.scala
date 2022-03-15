
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html data-ng-app="kcg">
    <head>
        <title>"""),_display_(/*7.17*/title),format.raw/*7.22*/("""</title>
        <meta charset="UTF-8">
        <meta name="description" content="KML circle generator for Google Earth">
        <meta name="keywords" content="kml,circle,generator">
        <meta name="author" content="Fu Cheng">
        <link rel="stylesheet" href="https://unpkg.com/leaflet@1.7.1/dist/leaflet.css"
            integrity="sha512-xodZBNTC5n17Xt2atTPuE1HxjVMSvLVW9ocqUKLsCC5CXdbqCmblAshOMAS6/keqq/sMZMZ19scR4PsZChSR7A=="
            crossorigin=""/>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*15.54*/routes/*15.60*/.Assets.at("stylesheets/main.css")),format.raw/*15.94*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*16.54*/routes/*16.60*/.Assets.at("stylesheets/colorpicker.css")),format.raw/*16.101*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*17.59*/routes/*17.65*/.Assets.at("images/favicon.png")),format.raw/*17.97*/("""">
        <script src="https://unpkg.com/leaflet@1.7.1/dist/leaflet.js"
              integrity="sha512-XQoYMqMTK8LvdxXYG3nZ448hOEQiglfqkJs1NOQV44cWnUrBc8PkAOcXy20w0vlaXaVUearIOBhiXZ5V3ynxwA=="
              crossorigin=""></script>
        <!--[if lte IE 8]><script src=""""),_display_(/*21.41*/routes/*21.47*/.Assets.at("stylesheets/ie/html5shiv.js")),format.raw/*21.88*/(""""></script><![endif]-->
        <script src=""""),_display_(/*22.23*/routes/*22.29*/.Assets.at("javascripts/jquery.min.js")),format.raw/*22.68*/(""""></script>
        <script src=""""),_display_(/*23.23*/routes/*23.29*/.Assets.at("javascripts/jquery.scrolly.min.js")),format.raw/*23.76*/(""""></script>
        <script src=""""),_display_(/*24.23*/routes/*24.29*/.Assets.at("javascripts/jquery.poptrox.min.js")),format.raw/*24.76*/(""""></script>
        <script src=""""),_display_(/*25.23*/routes/*25.29*/.Assets.at("javascripts/skel.min.js")),format.raw/*25.66*/(""""></script>
        <script src=""""),_display_(/*26.23*/routes/*26.29*/.Application.initJs),format.raw/*26.48*/(""""></script>
        <noscript>
            <link rel="stylesheet" href=""""),_display_(/*28.43*/routes/*28.49*/.Assets.at("stylesheets/skel.css")),format.raw/*28.83*/("""" />
            <link rel="stylesheet" href=""""),_display_(/*29.43*/routes/*29.49*/.Assets.at("stylesheets/style.css")),format.raw/*29.84*/("""" />
        </noscript>
        <!--[if lte IE 8]><link rel="stylesheet" href=""""),_display_(/*31.57*/routes/*31.63*/.Assets.at("stylesheets/ie/v8.css")),format.raw/*31.98*/("""" /><![endif]-->
        <script src="//ajax.googleapis.com/ajax/libs/angularjs/1.3.5/angular.min.js"></script>
        <script src=""""),_display_(/*33.23*/routes/*33.29*/.Assets.at("javascripts/bootstrap-colorpicker-module.js")),format.raw/*33.86*/(""""></script>
        <script src=""""),_display_(/*34.23*/routes/*34.29*/.Assets.at("javascripts/extensions-0.2.1.pack.js")),format.raw/*34.79*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*35.23*/routes/*35.29*/.Assets.at("javascripts/app.js")),format.raw/*35.61*/("""" type="text/javascript"></script>
    </head>
    <body data-ng-controller="KcgCtrl">
        """),_display_(/*38.10*/content),format.raw/*38.17*/("""

        """),format.raw/*40.9*/("""<section id="footer">
			<ul class="icons">
				<li><a href="https://twitter.com/alexcheng1982" class="icon fa-twitter" target="_blank"><span class="label">Twitter</span></a></li>
				<li><a href="https://github.com/alexcheng1982" class="icon fa-github" target="_blank"><span class="label">GitHub</span></a></li>
        <li><a href="https://www.linkedin.com/in/chengfu" class="icon fa-linkedin" target="_blank"><span class="label">LinkedIn</span></a></li>
        <li><a href="https://vividcode.io" class="icon fa-globe" target="_blank"><span class="label">Website</span></a></li>
      </ul>
			<div class="copyright">
				<ul class="menu">
					<li>&copy; Fu Cheng</li><li>Powered by <a href="https://www.playframework.com/">Play</a></li><li>Design: <a href="http://html5up.net">HTML5 UP</a></li>
				</ul>
			</div>
		</section>

        <script>
          (function(i,s,o,g,r,a,m)"""),format.raw/*55.35*/("""{"""),format.raw/*55.36*/("""i['GoogleAnalyticsObject']=r;i[r]=i[r]||function()"""),format.raw/*55.86*/("""{"""),format.raw/*55.87*/("""
          """),format.raw/*56.11*/("""(i[r].q=i[r].q||[]).push(arguments)"""),format.raw/*56.46*/("""}"""),format.raw/*56.47*/(""",i[r].l=1*new Date();a=s.createElement(o),
          m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)
          """),format.raw/*58.11*/("""}"""),format.raw/*58.12*/(""")(window,document,'script','//www.google-analytics.com/analytics.js','ga');

          ga('create', 'UA-57741983-1', 'auto');
          ga('send', 'pageview');

        </script>
    </body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/main.scala.html
                  HASH: 7b89055275ef3c4335c4450f37b83c187c6d4718
                  MATRIX: 733->1|857->32|884->33|979->102|1004->107|1552->629|1567->635|1622->669|1705->725|1720->731|1783->772|1871->833|1886->839|1939->871|2240->1146|2255->1152|2317->1193|2390->1239|2405->1245|2465->1284|2526->1318|2541->1324|2609->1371|2670->1405|2685->1411|2753->1458|2814->1492|2829->1498|2887->1535|2948->1569|2963->1575|3003->1594|3103->1667|3118->1673|3173->1707|3247->1754|3262->1760|3318->1795|3426->1876|3441->1882|3497->1917|3658->2051|3673->2057|3751->2114|3812->2148|3827->2154|3898->2204|3982->2261|3997->2267|4050->2299|4173->2395|4201->2402|4238->2412|5151->3297|5180->3298|5258->3348|5287->3349|5326->3360|5389->3395|5418->3396|5589->3539|5618->3540
                  LINES: 21->1|26->2|27->3|31->7|31->7|39->15|39->15|39->15|40->16|40->16|40->16|41->17|41->17|41->17|45->21|45->21|45->21|46->22|46->22|46->22|47->23|47->23|47->23|48->24|48->24|48->24|49->25|49->25|49->25|50->26|50->26|50->26|52->28|52->28|52->28|53->29|53->29|53->29|55->31|55->31|55->31|57->33|57->33|57->33|58->34|58->34|58->34|59->35|59->35|59->35|62->38|62->38|64->40|79->55|79->55|79->55|79->55|80->56|80->56|80->56|82->58|82->58
                  -- GENERATED --
              */
          