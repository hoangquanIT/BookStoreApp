
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Set[Book],Http.Request,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(books: Set[Book])(implicit request: Http.Request):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/layout("All books")/*3.21*/{_display_(Seq[Any](format.raw/*3.22*/("""
    """),format.raw/*4.5*/("""<h2>All books</h2>
    <table class="table table-bordered table-striped">
        <thead>
            <tr>
                <th>Title</th>
                <th>Price</th>
                <th>Author</th>
                <th>Edit</th>
                <th>Delete</th>
            </tr>
        </thead>
        <br>
        <tbody>
            """),_display_(/*17.14*/for(b <- books) yield /*17.29*/ {_display_(Seq[Any](format.raw/*17.31*/("""
            """),format.raw/*18.13*/("""<tr>
                <td style="width: 30%"><a href=""""),_display_(/*19.50*/routes/*19.56*/.BooksController.detail(b.id)),format.raw/*19.85*/("""">"""),_display_(/*19.88*/b/*19.89*/.title),format.raw/*19.95*/("""</a></td>
                <td style="width: 20%">$"""),_display_(/*20.42*/b/*20.43*/.price),format.raw/*20.49*/("""</td>
                <td style="width: 30%">"""),_display_(/*21.41*/b/*21.42*/.author),format.raw/*21.49*/("""</td>
                <td style="width: 10%"><a href=""""),_display_(/*22.50*/routes/*22.56*/.BooksController.edit(b.id)),format.raw/*22.83*/("""" class="btn btn-warning">Edit</a></td>
                <td style="width: 10%"><a href=""""),_display_(/*23.50*/routes/*23.56*/.BooksController.delete(b.id)),format.raw/*23.85*/("""" onclick="return confirm('Do you really want to delete this book?')" class="btn btn-danger">Delete</a></td>
            </tr>
            """)))}),format.raw/*25.14*/("""
        """),format.raw/*26.9*/("""</tbody>
    </table>
""")))}))
      }
    }
  }

  def render(books:Set[Book],request:Http.Request): play.twirl.api.HtmlFormat.Appendable = apply(books)(request)

  def f:((Set[Book]) => (Http.Request) => play.twirl.api.HtmlFormat.Appendable) = (books) => (request) => apply(books)(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/books/index.scala.html
                  HASH: 63bd89bc278ae82aef2d71d0b3fc34dd37f4067c
                  MATRIX: 929->1|1073->52|1100->54|1127->73|1165->74|1196->79|1563->419|1594->434|1634->436|1675->449|1756->503|1771->509|1821->538|1851->541|1861->542|1888->548|1966->599|1976->600|2003->606|2076->652|2086->653|2114->660|2196->715|2211->721|2259->748|2375->837|2390->843|2440->872|2611->1012|2647->1021
                  LINES: 27->1|32->2|33->3|33->3|33->3|34->4|47->17|47->17|47->17|48->18|49->19|49->19|49->19|49->19|49->19|49->19|50->20|50->20|50->20|51->21|51->21|51->21|52->22|52->22|52->22|53->23|53->23|53->23|55->25|56->26
                  -- GENERATED --
              */
          