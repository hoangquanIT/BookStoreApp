
package views.html.books

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

object show extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Book,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(book: Book):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/layout(book.title)/*3.20*/{_display_(Seq[Any](format.raw/*3.21*/("""
    """),format.raw/*4.5*/("""<h2>"""),_display_(/*4.10*/book/*4.14*/.title),format.raw/*4.20*/("""</h2>
    <p>Price: """),_display_(/*5.16*/book/*5.20*/.price),format.raw/*5.26*/("""</p>
    <p>Author: """),_display_(/*6.17*/book/*6.21*/.author),format.raw/*6.28*/("""</p>
""")))}))
      }
    }
  }

  def render(book:Book): play.twirl.api.HtmlFormat.Appendable = apply(book)

  def f:((Book) => play.twirl.api.HtmlFormat.Appendable) = (book) => apply(book)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/books/show.scala.html
                  HASH: 6c95c76f2ce57a9c21d9447b2b4ad99502cfeded
                  MATRIX: 910->1|1016->14|1043->16|1069->34|1107->35|1138->40|1169->45|1181->49|1207->55|1254->76|1266->80|1292->86|1339->107|1351->111|1378->118
                  LINES: 27->1|32->2|33->3|33->3|33->3|34->4|34->4|34->4|34->4|35->5|35->5|35->5|36->6|36->6|36->6
                  -- GENERATED --
              */
          