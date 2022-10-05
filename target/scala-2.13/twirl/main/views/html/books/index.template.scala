
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Set[Book],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(books: Set[Book]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/layout("All books")/*3.21*/{_display_(Seq[Any](format.raw/*3.22*/("""
    """),format.raw/*4.5*/("""<button><a href=""""),_display_(/*4.23*/routes/*4.29*/.BooksController.create()),format.raw/*4.54*/("""">Create book</a></button>
    <table border="1">
        <caption><h1>All books</h1></caption>
        <tr>
            <th>Title</th>
            <th>Price</th>
            <th>Author</th>
            <th>Edit</th>
            <th>Delete</th>
        </tr>
        """),_display_(/*14.10*/for(b <- books) yield /*14.25*/ {_display_(Seq[Any](format.raw/*14.27*/("""
            """),format.raw/*15.13*/("""<tr>
                <td><a href=""""),_display_(/*16.31*/routes/*16.37*/.BooksController.detail(b.id)),format.raw/*16.66*/("""">"""),_display_(/*16.69*/b/*16.70*/.title),format.raw/*16.76*/("""</a></td>
                <td align="center">"""),_display_(/*17.37*/b/*17.38*/.price),format.raw/*17.44*/("""</td>
                <td>"""),_display_(/*18.22*/b/*18.23*/.author),format.raw/*18.30*/("""</td>
                <td><a href=""""),_display_(/*19.31*/routes/*19.37*/.BooksController.edit(b.id)),format.raw/*19.64*/("""">Edit</a></td>
                <td><a href=""""),_display_(/*20.31*/routes/*20.37*/.BooksController.delete(b.id)),format.raw/*20.66*/("""" onclick="return confirm('Do you really want to delete this book?')">Delete</a></td>
            </tr>
        """)))}),format.raw/*22.10*/("""
    """),format.raw/*23.5*/("""</table>
""")))}))
      }
    }
  }

  def render(books:Set[Book]): play.twirl.api.HtmlFormat.Appendable = apply(books)

  def f:((Set[Book]) => play.twirl.api.HtmlFormat.Appendable) = (books) => apply(books)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/books/index.scala.html
                  HASH: 6505aeaf15279c601d4d7516cabf1832ba46b9af
                  MATRIX: 916->1|1028->20|1055->22|1082->41|1120->42|1151->47|1195->65|1209->71|1254->96|1549->364|1580->379|1620->381|1661->394|1723->429|1738->435|1788->464|1818->467|1828->468|1855->474|1928->520|1938->521|1965->527|2019->554|2029->555|2057->562|2120->598|2135->604|2183->631|2256->677|2271->683|2321->712|2465->825|2497->830
                  LINES: 27->1|32->2|33->3|33->3|33->3|34->4|34->4|34->4|34->4|44->14|44->14|44->14|45->15|46->16|46->16|46->16|46->16|46->16|46->16|47->17|47->17|47->17|48->18|48->18|48->18|49->19|49->19|49->19|50->20|50->20|50->20|52->22|53->23
                  -- GENERATED --
              */
          