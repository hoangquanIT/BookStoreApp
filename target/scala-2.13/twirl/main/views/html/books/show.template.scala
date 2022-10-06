
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

object show extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Book,Http.Request,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(book: Book)(implicit request: Http.Request):play.twirl.api.HtmlFormat.Appendable = {
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

  def render(book:Book,request:Http.Request): play.twirl.api.HtmlFormat.Appendable = apply(book)(request)

  def f:((Book) => (Http.Request) => play.twirl.api.HtmlFormat.Appendable) = (book) => (request) => apply(book)(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/books/show.scala.html
                  HASH: 133c228534a2a00642bbfa92b5f54ab3634ecf1e
                  MATRIX: 923->1|1061->46|1088->48|1114->66|1152->67|1183->72|1214->77|1226->81|1252->87|1299->108|1311->112|1337->118|1384->139|1396->143|1423->150
                  LINES: 27->1|32->2|33->3|33->3|33->3|34->4|34->4|34->4|34->4|35->5|35->5|35->5|36->6|36->6|36->6
                  -- GENERATED --
              */
          