
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

object create extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[Form[Book],Http.Request,play.i18n.Messages,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(bookForm: Form[Book])(implicit request: Http.Request, messages: play.i18n.Messages, message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*3.1*/("""
"""),_display_(/*4.2*/layout("Create a new book")/*4.29*/{_display_(Seq[Any](format.raw/*4.30*/("""
    """),_display_(/*5.6*/if(message != "")/*5.23*/{_display_(Seq[Any](format.raw/*5.24*/("""
        """),format.raw/*6.9*/("""<div class="alert alert-danger">
            """),_display_(/*7.14*/message),format.raw/*7.21*/("""
        """),format.raw/*8.9*/("""</div>
    """)))}),format.raw/*9.6*/("""
    """),format.raw/*10.5*/("""<h1>Create a new book</h1>
    """),_display_(/*11.6*/helper/*11.12*/.form(action = helper.CSRF(routes.BooksController.save()))/*11.70*/{_display_(Seq[Any](format.raw/*11.71*/("""
        """),_display_(/*12.10*/helper/*12.16*/.inputText(bookForm("id"),'class -> "form-control")),format.raw/*12.67*/("""
        """),_display_(/*13.10*/helper/*13.16*/.inputText(bookForm("title"),'class -> "form-control")),format.raw/*13.70*/("""
        """),_display_(/*14.10*/helper/*14.16*/.inputText(bookForm("price"),'class -> "form-control")),format.raw/*14.70*/("""
        """),_display_(/*15.10*/helper/*15.16*/.inputText(bookForm("author"),'class -> "form-control")),format.raw/*15.71*/("""

        """),format.raw/*17.9*/("""<button type="submit" class="btn btn-primary">Create book</button>
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
                  SOURCE: app/views/books/create.scala.html
                  HASH: 5dc8bda2864a5c6b5acc5ec2b96679aa884eb3e4
                  MATRIX: 957->1|1131->104|1175->120|1202->122|1237->149|1275->150|1306->156|1331->173|1369->174|1404->183|1476->229|1503->236|1538->245|1579->257|1611->262|1669->294|1684->300|1751->358|1790->359|1827->369|1842->375|1914->426|1951->436|1966->442|2041->496|2078->506|2093->512|2168->566|2205->576|2220->582|2296->637|2333->647|2435->719
                  LINES: 27->1|30->2|33->3|34->4|34->4|34->4|35->5|35->5|35->5|36->6|37->7|37->7|38->8|39->9|40->10|41->11|41->11|41->11|41->11|42->12|42->12|42->12|43->13|43->13|43->13|44->14|44->14|44->14|45->15|45->15|45->15|47->17|48->18
                  -- GENERATED --
              */
          