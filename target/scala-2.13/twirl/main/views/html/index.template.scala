
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Http.Request,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(implicit request: Http.Request):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/layout("All Books")/*2.21*/{_display_(Seq[Any](format.raw/*2.22*/("""
    """),format.raw/*3.5*/("""<h1>Welcome to our book store</h1>
""")))}))
      }
    }
  }

  def render(request:Http.Request): play.twirl.api.HtmlFormat.Appendable = apply(request)

  def f:((Http.Request) => play.twirl.api.HtmlFormat.Appendable) = (request) => apply(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/index.scala.html
                  HASH: 6432834747bddb849360e77ce7e8ca1d19f10cc8
                  MATRIX: 913->1|1039->35|1066->54|1104->55|1135->60
                  LINES: 27->1|32->2|32->2|32->2|33->3
                  -- GENERATED --
              */
          