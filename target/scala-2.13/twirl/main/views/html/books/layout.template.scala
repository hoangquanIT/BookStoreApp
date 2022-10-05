
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

object layout extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(body: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*3.1*/("""<html>
<head>
  <meta charset="UTF-8">
  <title>"""),_display_(/*6.11*/title),format.raw/*6.16*/("""</title>
  <style type="text/css">
        table"""),format.raw/*8.14*/("""{"""),format.raw/*8.15*/("""
            """),format.raw/*9.13*/("""width: 500px;
            border-collapse: collapse;
        """),format.raw/*11.9*/("""}"""),format.raw/*11.10*/("""
        """),format.raw/*12.9*/("""table th,td """),format.raw/*12.21*/("""{"""),format.raw/*12.22*/("""
            """),format.raw/*13.13*/("""padding: 5px;
        """),format.raw/*14.9*/("""}"""),format.raw/*14.10*/("""
        """),format.raw/*15.9*/("""a"""),format.raw/*15.10*/("""{"""),format.raw/*15.11*/("""
            """),format.raw/*16.13*/("""text-decoration: none;
        """),format.raw/*17.9*/("""}"""),format.raw/*17.10*/("""
    """),format.raw/*18.5*/("""</style>
</head>
<body>
  """),_display_(/*21.4*/body),format.raw/*21.8*/("""
"""),format.raw/*22.1*/("""</body>
</html>"""))
      }
    }
  }

  def render(title:String,body:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(body)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (body) => apply(title)(body)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/books/layout.scala.html
                  HASH: e431d184e5e9a1fffe366dc761c87a0937b84a08
                  MATRIX: 919->1|1040->29|1067->30|1142->79|1167->84|1242->132|1270->133|1310->146|1398->207|1427->208|1463->217|1503->229|1532->230|1573->243|1622->265|1651->266|1687->275|1716->276|1745->277|1786->290|1844->321|1873->322|1905->327|1958->354|1982->358|2010->359
                  LINES: 27->1|32->2|33->3|36->6|36->6|38->8|38->8|39->9|41->11|41->11|42->12|42->12|42->12|43->13|44->14|44->14|45->15|45->15|45->15|46->16|47->17|47->17|48->18|51->21|51->21|52->22
                  -- GENERATED --
              */
          