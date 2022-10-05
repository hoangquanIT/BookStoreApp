
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

object edit extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Form[Book],Http.Request,play.i18n.Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(bookForm: Form[Book])(implicit request: Http.Request, messages: play.i18n.Messages):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*3.1*/("""
"""),_display_(/*4.2*/layout("Edit book")/*4.21*/{_display_(Seq[Any](format.raw/*4.22*/("""
    """),format.raw/*5.5*/("""<h1>Edit book</h1>
    """),_display_(/*6.6*/helper/*6.12*/.form(action = helper.CSRF(routes.BooksController.update()))/*6.72*/{_display_(Seq[Any](format.raw/*6.73*/("""
        """),_display_(/*7.10*/helper/*7.16*/.inputText(bookForm("id"))),format.raw/*7.42*/("""
        """),_display_(/*8.10*/helper/*8.16*/.inputText(bookForm("title"))),format.raw/*8.45*/("""
        """),_display_(/*9.10*/helper/*9.16*/.inputText(bookForm("price"))),format.raw/*9.45*/("""
        """),_display_(/*10.10*/helper/*10.16*/.inputText(bookForm("author"))),format.raw/*10.46*/("""

        """),format.raw/*12.9*/("""<input type="submit" value="Edit book">
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
                  SOURCE: app/views/books/edit.scala.html
                  HASH: 9ff7dc7d7126b8d608f6cd50556dee11ec9abc01
                  MATRIX: 948->1|1105->87|1149->103|1176->105|1203->124|1241->125|1272->130|1321->154|1335->160|1403->220|1441->221|1477->231|1491->237|1537->263|1573->273|1587->279|1636->308|1672->318|1686->324|1735->353|1772->363|1787->369|1838->399|1875->409|1950->454
                  LINES: 27->1|30->2|33->3|34->4|34->4|34->4|35->5|36->6|36->6|36->6|36->6|37->7|37->7|37->7|38->8|38->8|38->8|39->9|39->9|39->9|40->10|40->10|40->10|42->12|43->13
                  -- GENERATED --
              */
          