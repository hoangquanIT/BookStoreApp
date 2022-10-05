
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

object create extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Form[Book],Http.Request,play.i18n.Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(bookForm: Form[Book])(implicit request: Http.Request, messages: play.i18n.Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*3.1*/("""
"""),_display_(/*4.2*/layout("Create a new book")/*4.29*/{_display_(Seq[Any](format.raw/*4.30*/("""
    """),format.raw/*5.5*/("""<h1>Create a new book</h1>
    """),_display_(/*6.6*/helper/*6.12*/.form(action = helper.CSRF(routes.BooksController.save()))/*6.70*/{_display_(Seq[Any](format.raw/*6.71*/("""
        """),_display_(/*7.10*/helper/*7.16*/.inputText(bookForm("id"))),format.raw/*7.42*/("""
        """),_display_(/*8.10*/helper/*8.16*/.inputText(bookForm("title"))),format.raw/*8.45*/("""
        """),_display_(/*9.10*/helper/*9.16*/.inputText(bookForm("price"))),format.raw/*9.45*/("""
        """),_display_(/*10.10*/helper/*10.16*/.inputText(bookForm("author"))),format.raw/*10.46*/("""

        """),format.raw/*12.9*/("""<input type="submit" value="Create book">
    """)))}),format.raw/*13.6*/("""
""")))}))
      }
    }
  }

  def render(bookForm:Form[Book],request:Http.Request,messages:play.i18n.Messages): play.twirl.api.HtmlFormat.Appendable = apply(bookForm)(request,messages)

  def f:((Form[Book]) => (Http.Request,play.i18n.Messages) => play.twirl.api.HtmlFormat.Appendable) = (bookForm) => (request,messages) => apply(bookForm)(request,messages)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/books/create.scala.html
                  HASH: 4088ac68587273bfd7ac18c1bf0f056a1e2b6bab
                  MATRIX: 950->1|1107->87|1151->103|1178->105|1213->132|1251->133|1282->138|1339->170|1353->176|1419->234|1457->235|1493->245|1507->251|1553->277|1589->287|1603->293|1652->322|1688->332|1702->338|1751->367|1788->377|1803->383|1854->413|1891->423|1968->470
                  LINES: 27->1|30->2|33->3|34->4|34->4|34->4|35->5|36->6|36->6|36->6|36->6|37->7|37->7|37->7|38->8|38->8|38->8|39->9|39->9|39->9|40->10|40->10|40->10|42->12|43->13
                  -- GENERATED --
              */
          