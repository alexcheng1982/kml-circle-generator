
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

object initjs extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""(function($) """),format.raw/*1.14*/("""{"""),format.raw/*1.15*/("""

"""),format.raw/*3.1*/("""var settings = """),format.raw/*3.16*/("""{"""),format.raw/*3.17*/("""

"""),format.raw/*5.1*/("""// Full screen header?
fullScreenHeader: true,

// Parallax background effect?
parallax: true,

// Parallax factor (lower = more intense, higher = less intense).
parallaxFactor: 10

"""),format.raw/*14.1*/("""}"""),format.raw/*14.2*/(""";

skel.init("""),format.raw/*16.11*/("""{"""),format.raw/*16.12*/("""
"""),format.raw/*17.1*/("""reset: 'full',
breakpoints: """),format.raw/*18.14*/("""{"""),format.raw/*18.15*/("""
"""),format.raw/*19.1*/("""'global':	"""),format.raw/*19.11*/("""{"""),format.raw/*19.12*/(""" """),format.raw/*19.13*/("""range: '*', href: '"""),_display_(/*19.33*/routes/*19.39*/.Assets.at("stylesheets/style.css")),format.raw/*19.74*/("""', containers: 1140, grid: """),format.raw/*19.101*/("""{"""),format.raw/*19.102*/(""" """),format.raw/*19.103*/("""gutters: 40 """),format.raw/*19.115*/("""}"""),format.raw/*19.116*/(""" """),format.raw/*19.117*/("""}"""),format.raw/*19.118*/(""",
'wide':		"""),format.raw/*20.10*/("""{"""),format.raw/*20.11*/(""" """),format.raw/*20.12*/("""range: '-1680', href: '"""),_display_(/*20.36*/routes/*20.42*/.Assets.at("stylesheets/style-wide.css")),format.raw/*20.82*/("""', containers: 960 """),format.raw/*20.101*/("""}"""),format.raw/*20.102*/(""",
'normal':	"""),format.raw/*21.11*/("""{"""),format.raw/*21.12*/(""" """),format.raw/*21.13*/("""range: '-1080', href: '"""),_display_(/*21.37*/routes/*21.43*/.Assets.at("stylesheets/style-normal.css")),format.raw/*21.85*/("""', containers: '95%', viewport: """),format.raw/*21.117*/("""{"""),format.raw/*21.118*/(""" """),format.raw/*21.119*/("""scalable: false """),format.raw/*21.135*/("""}"""),format.raw/*21.136*/(""" """),format.raw/*21.137*/("""}"""),format.raw/*21.138*/(""",
'narrow':	"""),format.raw/*22.11*/("""{"""),format.raw/*22.12*/(""" """),format.raw/*22.13*/("""range: '-840', href: '"""),_display_(/*22.36*/routes/*22.42*/.Assets.at("stylesheets/style-narrow.css")),format.raw/*22.84*/("""', grid: """),format.raw/*22.93*/("""{"""),format.raw/*22.94*/(""" """),format.raw/*22.95*/("""gutters: 30 """),format.raw/*22.107*/("""}"""),format.raw/*22.108*/(""" """),format.raw/*22.109*/("""}"""),format.raw/*22.110*/(""",
'mobile':	"""),format.raw/*23.11*/("""{"""),format.raw/*23.12*/(""" """),format.raw/*23.13*/("""range: '-736', href: '"""),_display_(/*23.36*/routes/*23.42*/.Assets.at("stylesheets/style-mobile.css")),format.raw/*23.84*/("""', containers: '95%!', grid: """),format.raw/*23.113*/("""{"""),format.raw/*23.114*/(""" """),format.raw/*23.115*/("""collapse: true, gutters: 20 """),format.raw/*23.143*/("""}"""),format.raw/*23.144*/(""" """),format.raw/*23.145*/("""}"""),format.raw/*23.146*/("""
"""),format.raw/*24.1*/("""}"""),format.raw/*24.2*/("""
"""),format.raw/*25.1*/("""}"""),format.raw/*25.2*/(""");

$(function() """),format.raw/*27.14*/("""{"""),format.raw/*27.15*/("""

"""),format.raw/*29.1*/("""var	$window = $(window),
$body = $('body');

if (skel.vars.isTouch) """),format.raw/*32.24*/("""{"""),format.raw/*32.25*/("""

"""),format.raw/*34.1*/("""settings.parallax = false;
$body.addClass('is-scroll');

"""),format.raw/*37.1*/("""}"""),format.raw/*37.2*/("""

"""),format.raw/*39.1*/("""// Disable animations/transitions until the page has loaded.
$body.addClass('is-loading');

$window.on('load', function() """),format.raw/*42.31*/("""{"""),format.raw/*42.32*/("""
"""),format.raw/*43.1*/("""$body.removeClass('is-loading');
"""),format.raw/*44.1*/("""}"""),format.raw/*44.2*/(""");

// CSS polyfills (IE<9).
if (skel.vars.IEVersion < 9)
$(':last-child').addClass('last-child');

// Forms (IE<10).
var $form = $('form');
if ($form.length > 0) """),format.raw/*52.23*/("""{"""),format.raw/*52.24*/("""

"""),format.raw/*54.1*/("""$form.find('.form-button-submit')
.on('click', function() """),format.raw/*55.25*/("""{"""),format.raw/*55.26*/("""
"""),format.raw/*56.1*/("""$(this).parents('form').submit();
return false;
"""),format.raw/*58.1*/("""}"""),format.raw/*58.2*/(""");

if (skel.vars.IEVersion < 10) """),format.raw/*60.31*/("""{"""),format.raw/*60.32*/("""
"""),format.raw/*61.1*/("""$.fn.n33_formerize=function()"""),format.raw/*61.30*/("""{"""),format.raw/*61.31*/("""var _fakes=new Array(),_form = $(this);_form.find('input[type=text],textarea').each(function() """),format.raw/*61.126*/("""{"""),format.raw/*61.127*/(""" """),format.raw/*61.128*/("""var e = $(this); if (e.val() == '' || e.val() == e.attr('placeholder')) """),format.raw/*61.200*/("""{"""),format.raw/*61.201*/(""" """),format.raw/*61.202*/("""e.addClass('formerize-placeholder'); e.val(e.attr('placeholder')); """),format.raw/*61.269*/("""}"""),format.raw/*61.270*/(""" """),format.raw/*61.271*/("""}"""),format.raw/*61.272*/(""").blur(function() """),format.raw/*61.290*/("""{"""),format.raw/*61.291*/(""" """),format.raw/*61.292*/("""var e = $(this); if (e.attr('name').match(/_fakeformerizefield$/)) return; if (e.val() == '') """),format.raw/*61.386*/("""{"""),format.raw/*61.387*/(""" """),format.raw/*61.388*/("""e.addClass('formerize-placeholder'); e.val(e.attr('placeholder')); """),format.raw/*61.455*/("""}"""),format.raw/*61.456*/(""" """),format.raw/*61.457*/("""}"""),format.raw/*61.458*/(""").focus(function() """),format.raw/*61.477*/("""{"""),format.raw/*61.478*/(""" """),format.raw/*61.479*/("""var e = $(this); if (e.attr('name').match(/_fakeformerizefield$/)) return; if (e.val() == e.attr('placeholder')) """),format.raw/*61.592*/("""{"""),format.raw/*61.593*/(""" """),format.raw/*61.594*/("""e.removeClass('formerize-placeholder'); e.val(''); """),format.raw/*61.645*/("""}"""),format.raw/*61.646*/(""" """),format.raw/*61.647*/("""}"""),format.raw/*61.648*/("""); _form.find('input[type=password]').each(function() """),format.raw/*61.702*/("""{"""),format.raw/*61.703*/(""" """),format.raw/*61.704*/("""var e = $(this); var x = $($('<div>').append(e.clone()).remove().html().replace(/type="password"/i, 'type="text"').replace(/type=password/i, 'type=text')); if (e.attr('id') != '') x.attr('id', e.attr('id') + '_fakeformerizefield'); if (e.attr('name') != '') x.attr('name', e.attr('name') + '_fakeformerizefield'); x.addClass('formerize-placeholder').val(x.attr('placeholder')).insertAfter(e); if (e.val() == '') e.hide(); else x.hide(); e.blur(function(event) """),format.raw/*61.1164*/("""{"""),format.raw/*61.1165*/(""" """),format.raw/*61.1166*/("""event.preventDefault(); var e = $(this); var x = e.parent().find('input[name=' + e.attr('name') + '_fakeformerizefield]'); if (e.val() == '') """),format.raw/*61.1308*/("""{"""),format.raw/*61.1309*/(""" """),format.raw/*61.1310*/("""e.hide(); x.show(); """),format.raw/*61.1330*/("""}"""),format.raw/*61.1331*/(""" """),format.raw/*61.1332*/("""}"""),format.raw/*61.1333*/("""); x.focus(function(event) """),format.raw/*61.1360*/("""{"""),format.raw/*61.1361*/(""" """),format.raw/*61.1362*/("""event.preventDefault(); var x = $(this); var e = x.parent().find('input[name=' + x.attr('name').replace('_fakeformerizefield', '') + ']'); x.hide(); e.show().focus(); """),format.raw/*61.1529*/("""}"""),format.raw/*61.1530*/("""); x.keypress(function(event) """),format.raw/*61.1560*/("""{"""),format.raw/*61.1561*/(""" """),format.raw/*61.1562*/("""event.preventDefault(); x.val(''); """),format.raw/*61.1597*/("""}"""),format.raw/*61.1598*/("""); """),format.raw/*61.1601*/("""}"""),format.raw/*61.1602*/(""");  _form.submit(function() """),format.raw/*61.1630*/("""{"""),format.raw/*61.1631*/(""" """),format.raw/*61.1632*/("""$(this).find('input[type=text],input[type=password],textarea').each(function(event) """),format.raw/*61.1716*/("""{"""),format.raw/*61.1717*/(""" """),format.raw/*61.1718*/("""var e = $(this); if (e.attr('name').match(/_fakeformerizefield$/)) e.attr('name', ''); if (e.val() == e.attr('placeholder')) """),format.raw/*61.1843*/("""{"""),format.raw/*61.1844*/(""" """),format.raw/*61.1845*/("""e.removeClass('formerize-placeholder'); e.val(''); """),format.raw/*61.1896*/("""}"""),format.raw/*61.1897*/(""" """),format.raw/*61.1898*/("""}"""),format.raw/*61.1899*/("""); """),format.raw/*61.1902*/("""}"""),format.raw/*61.1903*/(""").bind("reset", function(event) """),format.raw/*61.1935*/("""{"""),format.raw/*61.1936*/(""" """),format.raw/*61.1937*/("""event.preventDefault(); $(this).find('select').val($('option:first').val()); $(this).find('input,textarea').each(function() """),format.raw/*61.2061*/("""{"""),format.raw/*61.2062*/(""" """),format.raw/*61.2063*/("""var e = $(this); var x; e.removeClass('formerize-placeholder'); switch (this.type) """),format.raw/*61.2146*/("""{"""),format.raw/*61.2147*/(""" case 'submit': case 'reset': break; case 'password': e.val(e.attr('defaultValue')); x = e.parent().find('input[name=' + e.attr('name') + '_fakeformerizefield]'); if (e.val() == '') """),format.raw/*61.2329*/("""{"""),format.raw/*61.2330*/(""" """),format.raw/*61.2331*/("""e.hide(); x.show(); """),format.raw/*61.2351*/("""}"""),format.raw/*61.2352*/(""" """),format.raw/*61.2353*/("""else """),format.raw/*61.2358*/("""{"""),format.raw/*61.2359*/(""" """),format.raw/*61.2360*/("""e.show(); x.hide(); """),format.raw/*61.2380*/("""}"""),format.raw/*61.2381*/(""" """),format.raw/*61.2382*/("""break; case 'checkbox': case 'radio': e.attr('checked', e.attr('defaultValue')); break; case 'text': case 'textarea': e.val(e.attr('defaultValue')); if (e.val() == '') """),format.raw/*61.2550*/("""{"""),format.raw/*61.2551*/(""" """),format.raw/*61.2552*/("""e.addClass('formerize-placeholder'); e.val(e.attr('placeholder')); """),format.raw/*61.2619*/("""}"""),format.raw/*61.2620*/(""" """),format.raw/*61.2621*/("""break; default: e.val(e.attr('defaultValue')); break; """),format.raw/*61.2675*/("""}"""),format.raw/*61.2676*/(""" """),format.raw/*61.2677*/("""}"""),format.raw/*61.2678*/("""); window.setTimeout(function() """),format.raw/*61.2710*/("""{"""),format.raw/*61.2711*/(""" """),format.raw/*61.2712*/("""for (x in _fakes) _fakes[x].trigger('formerize_sync'); """),format.raw/*61.2767*/("""}"""),format.raw/*61.2768*/(""", 10); """),format.raw/*61.2775*/("""}"""),format.raw/*61.2776*/("""); return _form; """),format.raw/*61.2793*/("""}"""),format.raw/*61.2794*/(""";
    $form.n33_formerize();
    """),format.raw/*63.5*/("""}"""),format.raw/*63.6*/("""

    """),format.raw/*65.5*/("""}"""),format.raw/*65.6*/("""

    """),format.raw/*67.5*/("""// Scrolly links.
    $('.scrolly').scrolly(1000, function() """),format.raw/*68.44*/("""{"""),format.raw/*68.45*/(""" """),format.raw/*68.46*/("""return (skel.isActive('mobile') ? 70 : 190); """),format.raw/*68.91*/("""}"""),format.raw/*68.92*/(""");

    // Full screen header.
    if (settings.fullScreenHeader) """),format.raw/*71.36*/("""{"""),format.raw/*71.37*/("""

    """),format.raw/*73.5*/("""var $header = $('#header');

    if ($header.length > 0) """),format.raw/*75.29*/("""{"""),format.raw/*75.30*/("""

    """),format.raw/*77.5*/("""var $header_header = $header.find('header');

    $window
    .on('resize.overflow_fsh', function() """),format.raw/*80.43*/("""{"""),format.raw/*80.44*/("""

    """),format.raw/*82.5*/("""if (skel.isActive('mobile'))
    $header.css('padding', '');
    else """),format.raw/*84.10*/("""{"""),format.raw/*84.11*/("""

    """),format.raw/*86.5*/("""var p = Math.max(192, ($window.height() - $header_header.outerHeight()) / 2);
    $header.css('padding', p + 'px 0 ' + p + 'px 0');

    """),format.raw/*89.5*/("""}"""),format.raw/*89.6*/("""

    """),format.raw/*91.5*/("""}"""),format.raw/*91.6*/(""")
    .trigger('resize.overflow_fsh');

    $window.load(function() """),format.raw/*94.29*/("""{"""),format.raw/*94.30*/("""
    """),format.raw/*95.5*/("""$window.trigger('resize.overflow_fsh');
    """),format.raw/*96.5*/("""}"""),format.raw/*96.6*/(""");

    """),format.raw/*98.5*/("""}"""),format.raw/*98.6*/("""

    """),format.raw/*100.5*/("""}"""),format.raw/*100.6*/("""

    """),format.raw/*102.5*/("""// Parallax background.

    // Disable parallax on IE (smooth scrolling is jerky), and on mobile platforms (= better performance).
    if (skel.vars.browser == 'ie'
    ||	skel.vars.isMobile)
    settings.parallax = false;

    if (settings.parallax) """),format.raw/*109.28*/("""{"""),format.raw/*109.29*/("""

    """),format.raw/*111.5*/("""var $dummy = $(), $bg;

    $window
    .on('scroll.overflow_parallax', function() """),format.raw/*114.48*/("""{"""),format.raw/*114.49*/("""

    """),format.raw/*116.5*/("""// Adjust background position.
    $bg.css('background-position', 'center ' + (-1 * (parseInt($window.scrollTop()) / settings.parallaxFactor)) + 'px');

    """),format.raw/*119.5*/("""}"""),format.raw/*119.6*/(""")
    .on('resize.overflow_parallax', function() """),format.raw/*120.48*/("""{"""),format.raw/*120.49*/("""

    """),format.raw/*122.5*/("""// If we're in a situation where we need to temporarily disable parallax, do so.
    if (!skel.isActive('wide')
    ||	skel.isActive('narrow')) """),format.raw/*124.33*/("""{"""),format.raw/*124.34*/("""

    """),format.raw/*126.5*/("""$body.css('background-position', '');
    $bg = $dummy;

    """),format.raw/*129.5*/("""}"""),format.raw/*129.6*/("""

    """),format.raw/*131.5*/("""// Otherwise, continue as normal.
    else
    $bg = $body;

    // Trigger scroll handler.
    $window.triggerHandler('scroll.overflow_parallax');

    """),format.raw/*138.5*/("""}"""),format.raw/*138.6*/(""")
    .trigger('resize.overflow_parallax');

    """),format.raw/*141.5*/("""}"""),format.raw/*141.6*/("""

    """),format.raw/*143.5*/("""// Poptrox.
    $('.gallery').poptrox("""),format.raw/*144.27*/("""{"""),format.raw/*144.28*/("""
    """),format.raw/*145.5*/("""useBodyOverflow: false,
    usePopupEasyClose: false,
    overlayColor: '#0a1919',
    overlayOpacity: (skel.vars.IEVersion < 9 ? 0 : 0.75),
    usePopupDefaultStyling: false,
    usePopupCaption: true,
    popupLoaderText: '',
    windowMargin: 10,
    usePopupNav: true
    """),format.raw/*154.5*/("""}"""),format.raw/*154.6*/(""");

    """),format.raw/*156.5*/("""}"""),format.raw/*156.6*/(""");

    """),format.raw/*158.5*/("""}"""),format.raw/*158.6*/(""")(jQuery);"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/initjs.scala.html
                  HASH: 7f434b875dd7889133c7ba5588d9cdf3ce2fac19
                  MATRIX: 812->0|852->13|880->14|908->16|950->31|978->32|1006->34|1215->216|1243->217|1284->230|1313->231|1341->232|1397->260|1426->261|1454->262|1492->272|1521->273|1550->274|1597->294|1612->300|1668->335|1724->362|1754->363|1784->364|1825->376|1855->377|1885->378|1915->379|1954->390|1983->391|2012->392|2063->416|2078->422|2139->462|2187->481|2217->482|2257->494|2286->495|2315->496|2366->520|2381->526|2444->568|2505->600|2535->601|2565->602|2610->618|2640->619|2670->620|2700->621|2740->633|2769->634|2798->635|2848->658|2863->664|2926->706|2963->715|2992->716|3021->717|3062->729|3092->730|3122->731|3152->732|3192->744|3221->745|3250->746|3300->769|3315->775|3378->817|3436->846|3466->847|3496->848|3553->876|3583->877|3613->878|3643->879|3671->880|3699->881|3727->882|3755->883|3800->900|3829->901|3858->903|3954->971|3983->972|4012->974|4096->1031|4124->1032|4153->1034|4303->1156|4332->1157|4360->1158|4420->1191|4448->1192|4639->1355|4668->1356|4697->1358|4783->1416|4812->1417|4840->1418|4915->1466|4943->1467|5005->1501|5034->1502|5062->1503|5119->1532|5148->1533|5272->1628|5302->1629|5332->1630|5433->1702|5463->1703|5493->1704|5589->1771|5619->1772|5649->1773|5679->1774|5726->1792|5756->1793|5786->1794|5909->1888|5939->1889|5969->1890|6065->1957|6095->1958|6125->1959|6155->1960|6203->1979|6233->1980|6263->1981|6405->2094|6435->2095|6465->2096|6545->2147|6575->2148|6605->2149|6635->2150|6718->2204|6748->2205|6778->2206|7268->2666|7299->2667|7330->2668|7502->2810|7533->2811|7564->2812|7614->2832|7645->2833|7676->2834|7707->2835|7764->2862|7795->2863|7826->2864|8023->3031|8054->3032|8114->3062|8145->3063|8176->3064|8241->3099|8272->3100|8305->3103|8336->3104|8394->3132|8425->3133|8456->3134|8570->3218|8601->3219|8632->3220|8787->3345|8818->3346|8849->3347|8930->3398|8961->3399|8992->3400|9023->3401|9056->3404|9087->3405|9149->3437|9180->3438|9211->3439|9365->3563|9396->3564|9427->3565|9540->3648|9571->3649|9783->3831|9814->3832|9845->3833|9895->3853|9926->3854|9957->3855|9992->3860|10023->3861|10054->3862|10104->3882|10135->3883|10166->3884|10364->4052|10395->4053|10426->4054|10523->4121|10554->4122|10585->4123|10669->4177|10700->4178|10731->4179|10762->4180|10824->4212|10855->4213|10886->4214|10971->4269|11002->4270|11039->4277|11070->4278|11117->4295|11148->4296|11208->4329|11236->4330|11269->4336|11297->4337|11330->4343|11419->4404|11448->4405|11477->4406|11550->4451|11579->4452|11673->4518|11702->4519|11735->4525|11820->4582|11849->4583|11882->4589|12010->4689|12039->4690|12072->4696|12170->4766|12199->4767|12232->4773|12396->4910|12424->4911|12457->4917|12485->4918|12581->4986|12610->4987|12642->4992|12713->5036|12741->5037|12776->5045|12804->5046|12838->5052|12867->5053|12901->5059|13182->5311|13212->5312|13246->5318|13358->5401|13388->5402|13422->5408|13607->5565|13636->5566|13714->5615|13744->5616|13778->5622|13951->5766|13981->5767|14015->5773|14104->5834|14133->5835|14167->5841|14348->5994|14377->5995|14454->6044|14483->6045|14517->6051|14584->6089|14614->6090|14647->6095|14951->6371|14980->6372|15016->6380|15045->6381|15081->6389|15110->6390
                  LINES: 26->1|26->1|26->1|28->3|28->3|28->3|30->5|39->14|39->14|41->16|41->16|42->17|43->18|43->18|44->19|44->19|44->19|44->19|44->19|44->19|44->19|44->19|44->19|44->19|44->19|44->19|44->19|44->19|45->20|45->20|45->20|45->20|45->20|45->20|45->20|45->20|46->21|46->21|46->21|46->21|46->21|46->21|46->21|46->21|46->21|46->21|46->21|46->21|46->21|47->22|47->22|47->22|47->22|47->22|47->22|47->22|47->22|47->22|47->22|47->22|47->22|47->22|48->23|48->23|48->23|48->23|48->23|48->23|48->23|48->23|48->23|48->23|48->23|48->23|48->23|49->24|49->24|50->25|50->25|52->27|52->27|54->29|57->32|57->32|59->34|62->37|62->37|64->39|67->42|67->42|68->43|69->44|69->44|77->52|77->52|79->54|80->55|80->55|81->56|83->58|83->58|85->60|85->60|86->61|86->61|86->61|86->61|86->61|86->61|86->61|86->61|86->61|86->61|86->61|86->61|86->61|86->61|86->61|86->61|86->61|86->61|86->61|86->61|86->61|86->61|86->61|86->61|86->61|86->61|86->61|86->61|86->61|86->61|86->61|86->61|86->61|86->61|86->61|86->61|86->61|86->61|86->61|86->61|86->61|86->61|86->61|86->61|86->61|86->61|86->61|86->61|86->61|86->61|86->61|86->61|86->61|86->61|86->61|86->61|86->61|86->61|86->61|86->61|86->61|86->61|86->61|86->61|86->61|86->61|86->61|86->61|86->61|86->61|86->61|86->61|86->61|86->61|86->61|86->61|86->61|86->61|86->61|86->61|86->61|86->61|86->61|86->61|86->61|86->61|86->61|86->61|86->61|86->61|86->61|86->61|86->61|86->61|86->61|86->61|86->61|86->61|86->61|86->61|86->61|86->61|86->61|86->61|86->61|86->61|86->61|86->61|86->61|86->61|86->61|86->61|88->63|88->63|90->65|90->65|92->67|93->68|93->68|93->68|93->68|93->68|96->71|96->71|98->73|100->75|100->75|102->77|105->80|105->80|107->82|109->84|109->84|111->86|114->89|114->89|116->91|116->91|119->94|119->94|120->95|121->96|121->96|123->98|123->98|125->100|125->100|127->102|134->109|134->109|136->111|139->114|139->114|141->116|144->119|144->119|145->120|145->120|147->122|149->124|149->124|151->126|154->129|154->129|156->131|163->138|163->138|166->141|166->141|168->143|169->144|169->144|170->145|179->154|179->154|181->156|181->156|183->158|183->158
                  -- GENERATED --
              */
          