
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/main("KML Circle Generator")/*1.30*/ {_display_(Seq[Any](format.raw/*1.32*/("""
"""),format.raw/*2.1*/("""<section id="header">
    <header>
        <h1>KML Circle Generator</h1>
        <p>Generate KML Circles For Google Earth</p>
        <p>Preview with Google Earth web plugin</p>
        <p>By <a href="https://vividcode.io" target="_blank">Fu Cheng</a></p>
    </header>
    <footer>
        <a href="#center" class="button style2 scrolly scrolly-centered">Start</a>
    </footer>
</section>

<section id="center" class="container box style3">
    <header>
        <h2>Circle Center & Radius</h2>
        <p>Geo-location of circle's center and radius of the circle</p>
    </header>
    <form action="#">
        <div class="row 50%">
            <div id="map">

            </div>
        </div>
        <div class="row 50%">
            <div>Drag the marker to change location.</div>
            <div>Current location is """),format.raw/*27.38*/("""{"""),format.raw/*27.39*/("""{"""),format.raw/*27.40*/(""" """),format.raw/*27.41*/("""centerLocation[0] """),format.raw/*27.59*/("""}"""),format.raw/*27.60*/("""}"""),format.raw/*27.61*/(""", """),format.raw/*27.63*/("""{"""),format.raw/*27.64*/("""{"""),format.raw/*27.65*/(""" """),format.raw/*27.66*/("""centerLocation[1] """),format.raw/*27.84*/("""}"""),format.raw/*27.85*/("""}"""),format.raw/*27.86*/("""</div>
        </div>
        <div class="row 50%">
            <div class="6u">
                <label for="radius">Radius</label>
                <input id="radius" type="text" placeholder="Radius" data-ng-model="radius">
            </div>
            <div class="6u">
                <label for="radius-unit">Unit</label>
                <select id="radius-unit" data-ng-model="radiusUnit">
                    <option value="km">km</option>
                    <option value="mile">mile</option>
                    <option value="meter">meter</option>
                </select>
            </div>
        </div>
    </form>
    <footer>
        <form action="#">
            <div class="row">
                <div class="12u">
                    <ul class="actions">
                        <li>
                            <a href="#style" class="button">Customize Circle Style</a>
                        </li>
                    </ul>
                </div>
            </div>
        </form>
    </footer>
</section>

<article id="style" class="container box style3">
    <header>
        <h2>Circle Style</h2>
        <p>Choose circle fill color and line weight/color</p>
    </header>
    <form action="#">
       <div class="row 50%">
           <div class="6u">
               <input type="checkbox" data-ng-model="useFillColor"/> Fill circle
           </div>
           <div class="6u">
               <label for="fill-color">Fill color</label>
               <input id="fill-color" data-ng-disabled="!useFillColor" colorpicker type="text" ng-model="fillColor" />
           </div>
       </div>
       <div class="row 50%">
            <div class="6u">
               <label for="line-weight">Line weight</label>
               <select id="line-weight" data-ng-model="lineWeight" data-ng-options="w for w in lineWeights"></select>
            </div>
            <div class="6u">
                <label for="line-color">Line color</label>
                <input id="line-color" colorpicker type="text" data-ng-model="lineColor" />
            </div>
        </div>
    </form>
    <footer>
        <form action="#">
            <div class="row">
                <div class="12u">
                    <ul class="actions">
                        <li>
                            <a href="#result" class="button">Generate</a>
                        </li>
                    </ul>
                </div>
            </div>
        </form>
    </footer>
</article>

<article id="result" class="container box style3">
    <header>
        <h2>Your KML circle is ready</h2>
        <p>Download the KML file or copy the link to use as <a href="https://developers.google.com/kml/documentation/kml_tut#network-links" target="_blank">Network Link</a> in <a href="https://earth.google.com/web/" target="_blank">Google Earth</a></p>
    </header>
    <form action="#">
        <div class="row">
            <div class="12u">
                <ul class="actions">
                    <li><a href="#" data-ng-href=""""),format.raw/*109.51*/("""{"""),format.raw/*109.52*/("""{"""),format.raw/*109.53*/("""getKmlUrl()"""),format.raw/*109.64*/("""}"""),format.raw/*109.65*/("""}"""),format.raw/*109.66*/("""" class="button">Download or Copy Link</a></li>
                    <li><a href="#center" class="button style3">Re-generate</a></li>
                </ul>
            </div>
        </div>
    </form>
</article>
""")))}),format.raw/*116.2*/("""
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/index.scala.html
                  HASH: cd05b5c11e494f2dbab854a1815cd0cb0b0c70b9
                  MATRIX: 811->1|847->29|886->31|913->32|1763->854|1792->855|1821->856|1850->857|1896->875|1925->876|1954->877|1984->879|2013->880|2042->881|2071->882|2117->900|2146->901|2175->902|5224->3922|5254->3923|5284->3924|5324->3935|5354->3936|5384->3937|5628->4150
                  LINES: 26->1|26->1|26->1|27->2|52->27|52->27|52->27|52->27|52->27|52->27|52->27|52->27|52->27|52->27|52->27|52->27|52->27|52->27|134->109|134->109|134->109|134->109|134->109|134->109|141->116
                  -- GENERATED --
              */
          