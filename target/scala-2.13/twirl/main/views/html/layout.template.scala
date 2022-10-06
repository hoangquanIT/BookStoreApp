
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
import java.lang._
import java.util._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.data._
import play.core.j.PlayFormsMagicForJava._
import scala.jdk.CollectionConverters._

object layout extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,Html,Http.Request,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(body: Html)(implicit request: Http.Request):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*3.1*/("""<html>
<head>
    <meta charset="UTF-8">
    <title>"""),_display_(/*6.13*/title),format.raw/*6.18*/("""</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.9.1/font/bootstrap-icons.css">
</head>
<body>

<header>
    <nav class="navbar navbar-expand-lg bg-light">
        <div class="container">
            <a class="navbar-brand" href=""""),_display_(/*16.44*/routes/*16.50*/.HomeController.index()),format.raw/*16.73*/("""">BookStore</a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                    <li class="nav-item">
                        <a class="nav-link" href=""""),_display_(/*23.52*/routes/*23.58*/.BooksController.index()),format.raw/*23.82*/(""""><i class="bi bi-book"></i> All Books</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href=""""),_display_(/*26.52*/routes/*26.58*/.BooksController.create()),format.raw/*26.83*/(""""><i class="bi bi-journal-plus"></i> Create Book</a>
                    </li>
                </ul>
            </div>
        </div>
    </nav>
</header>
<br>
<content>
    <div class="container">
        """),_display_(/*36.10*/if(!request.flash().get("success").isEmpty())/*36.55*/{_display_(Seq[Any](format.raw/*36.56*/("""
            """),format.raw/*37.13*/("""<div class="alert alert-success">
                """),_display_(/*38.18*/request/*38.25*/.flash().get("success")),format.raw/*38.48*/("""
            """),format.raw/*39.13*/("""</div>
        """)))}),format.raw/*40.10*/("""
        """),_display_(/*41.10*/body),format.raw/*41.14*/("""
    """),format.raw/*42.5*/("""</div>
</content>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
</body>
</html>"""))
      }
    }
  }

  def render(title:String,body:Html,request:Http.Request): play.twirl.api.HtmlFormat.Appendable = apply(title)(body)(request)

  def f:((String) => (Html) => (Http.Request) => play.twirl.api.HtmlFormat.Appendable) = (title) => (body) => (request) => apply(title)(body)(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/layout.scala.html
                  HASH: 629f3307c35cfec6de59f7c11a397a40914b1d28
                  MATRIX: 926->1|1079->61|1106->62|1185->115|1210->120|1724->609|1739->615|1783->638|2356->1184|2371->1190|2416->1214|2605->1376|2620->1382|2666->1407|2901->1615|2955->1660|2994->1661|3035->1674|3113->1725|3129->1732|3173->1755|3214->1768|3261->1784|3298->1794|3323->1798|3355->1803
                  LINES: 27->1|32->2|33->3|36->6|36->6|46->16|46->16|46->16|53->23|53->23|53->23|56->26|56->26|56->26|66->36|66->36|66->36|67->37|68->38|68->38|68->38|69->39|70->40|71->41|71->41|72->42
                  -- GENERATED --
              */
          