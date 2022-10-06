
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

object edit extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[Form[Book],Http.Request,play.i18n.Messages,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(bookForm: Form[Book])(implicit request: Http.Request, messages: play.i18n.Messages, message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*3.1*/("""
"""),_display_(/*4.2*/layout("Edit book")/*4.21*/{_display_(Seq[Any](format.raw/*4.22*/("""
    """),_display_(/*5.6*/if(message != "")/*5.23*/{_display_(Seq[Any](format.raw/*5.24*/("""
        """),format.raw/*6.9*/("""<div class="alert alert-danger">
            """),_display_(/*7.14*/message),format.raw/*7.21*/("""
        """),format.raw/*8.9*/("""</div>
    """)))}),format.raw/*9.6*/("""
    """),format.raw/*10.5*/("""<h1>Edit book</h1>
    """),_display_(/*11.6*/helper/*11.12*/.form(action = helper.CSRF(routes.BooksController.update()))/*11.72*/{_display_(Seq[Any](format.raw/*11.73*/("""
        """),_display_(/*12.10*/helper/*12.16*/.inputText(bookForm("id"),'class -> "form-control")),format.raw/*12.67*/("""
        """),_display_(/*13.10*/helper/*13.16*/.inputText(bookForm("title"),'class -> "form-control")),format.raw/*13.70*/("""
        """),_display_(/*14.10*/helper/*14.16*/.inputText(bookForm("price"),'class -> "form-control")),format.raw/*14.70*/("""
        """),_display_(/*15.10*/helper/*15.16*/.inputText(bookForm("author"),'class -> "form-control")),format.raw/*15.71*/("""

        """),format.raw/*17.9*/("""<button type="submit" class="btn btn-warning">Edit book</button>
    """)))}),format.raw/*18.6*/("""
""")))}))
      }
    }
  }

  def render(bookForm:Form[Book],request:Http.Request,messages:play.i18n.Messages,message:String): play.twirl.api.HtmlFormat.Appendable = apply(bookForm)(request,messages,message)

  def f:((Form[Book]) => (Http.Request,play.i18n.Messages,String) => play.twirl.api.HtmlFormat.Appendable) = (bookForm) => (request,messages,message) => apply(bookForm)(request,messages,message)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/books/edit.scala.html
                  HASH: 4a11a829873d4536f5717f35c480c90ef221b947
                  MATRIX: 955->1|1129->104|1173->120|1200->122|1227->141|1265->142|1296->148|1321->165|1359->166|1394->175|1466->221|1493->228|1528->237|1569->249|1601->254|1651->278|1666->284|1735->344|1774->345|1811->355|1826->361|1898->412|1935->422|1950->428|2025->482|2062->492|2077->498|2152->552|2189->562|2204->568|2280->623|2317->633|2417->703
                  LINES: 27->1|30->2|33->3|34->4|34->4|34->4|35->5|35->5|35->5|36->6|37->7|37->7|38->8|39->9|40->10|41->11|41->11|41->11|41->11|42->12|42->12|42->12|43->13|43->13|43->13|44->14|44->14|44->14|45->15|45->15|45->15|47->17|48->18
                  -- GENERATED --
              */
          