
package views.html.Home

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

object welcome extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(firstName: String, lastName: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*3.1*/("""<html>
<head>
    <meta charset="UTF-8">
    <title>My welcome page</title>
</head>
<body>
  <p>Welcome """),_display_(/*9.15*/firstName),format.raw/*9.24*/(""" """),_display_(/*9.26*/lastName),format.raw/*9.34*/(""" """),format.raw/*9.35*/("""to our website</p>
</body>
</html>"""))
      }
    }
  }

  def render(firstName:String,lastName:String): play.twirl.api.HtmlFormat.Appendable = apply(firstName,lastName)

  def f:((String,String) => play.twirl.api.HtmlFormat.Appendable) = (firstName,lastName) => apply(firstName,lastName)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/Home/welcome.scala.html
                  HASH: 906014f60cbe04823b328f2bc952f1e32f498c9b
                  MATRIX: 921->1|1052->39|1079->40|1210->145|1239->154|1267->156|1295->164|1323->165
                  LINES: 27->1|32->2|33->3|39->9|39->9|39->9|39->9|39->9
                  -- GENERATED --
              */
          