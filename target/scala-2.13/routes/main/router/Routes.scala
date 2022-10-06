// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_0: controllers.HomeController,
  // @LINE:7
  BooksController_1: controllers.BooksController,
  // @LINE:21
  Assets_2: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_0: controllers.HomeController,
    // @LINE:7
    BooksController_1: controllers.BooksController,
    // @LINE:21
    Assets_2: controllers.Assets
  ) = this(errorHandler, HomeController_0, BooksController_1, Assets_2, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, BooksController_1, Assets_2, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """books""", """controllers.BooksController.index(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """books/create""", """controllers.BooksController.create(request:Request)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """books/create""", """controllers.BooksController.save(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """books/edit/""" + "$" + """id<[^/]+>""", """controllers.BooksController.edit(id:Integer, request:Request)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """books/edit/""", """controllers.BooksController.update(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """books/delete/""" + "$" + """id<[^/]+>""", """controllers.BooksController.delete(id:Integer, request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """books/""" + "$" + """id<[^/]+>""", """controllers.BooksController.detail(id:Integer, request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      HomeController_0.index(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val controllers_BooksController_index1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("books")))
  )
  private[this] lazy val controllers_BooksController_index1_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      BooksController_1.index(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BooksController",
      "index",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """books""",
      """""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_BooksController_create2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("books/create")))
  )
  private[this] lazy val controllers_BooksController_create2_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      BooksController_1.create(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BooksController",
      "create",
      Seq(classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """books/create""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_BooksController_save3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("books/create")))
  )
  private[this] lazy val controllers_BooksController_save3_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      BooksController_1.save(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BooksController",
      "save",
      Seq(classOf[play.mvc.Http.Request]),
      "POST",
      this.prefix + """books/create""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_BooksController_edit4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("books/edit/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_BooksController_edit4_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      BooksController_1.edit(fakeValue[Integer], fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BooksController",
      "edit",
      Seq(classOf[Integer], classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """books/edit/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_BooksController_update5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("books/edit/")))
  )
  private[this] lazy val controllers_BooksController_update5_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      BooksController_1.update(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BooksController",
      "update",
      Seq(classOf[play.mvc.Http.Request]),
      "POST",
      this.prefix + """books/edit/""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_BooksController_delete6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("books/delete/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_BooksController_delete6_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      BooksController_1.delete(fakeValue[Integer], fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BooksController",
      "delete",
      Seq(classOf[Integer], classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """books/delete/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_BooksController_detail7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("books/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_BooksController_detail7_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      BooksController_1.detail(fakeValue[Integer], fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BooksController",
      "detail",
      Seq(classOf[Integer], classOf[play.mvc.Http.Request]),
      "GET",
      this.prefix + """books/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:21
  private[this] lazy val controllers_Assets_versioned8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned8_invoker = createInvoker(
    Assets_2.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(
          req => HomeController_0.index(req))
      }
  
    // @LINE:7
    case controllers_BooksController_index1_route(params@_) =>
      call { 
        controllers_BooksController_index1_invoker.call(
          req => BooksController_1.index(req))
      }
  
    // @LINE:8
    case controllers_BooksController_create2_route(params@_) =>
      call { 
        controllers_BooksController_create2_invoker.call(
          req => BooksController_1.create(req))
      }
  
    // @LINE:9
    case controllers_BooksController_save3_route(params@_) =>
      call { 
        controllers_BooksController_save3_invoker.call(
          req => BooksController_1.save(req))
      }
  
    // @LINE:10
    case controllers_BooksController_edit4_route(params@_) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_BooksController_edit4_invoker.call(
          req => BooksController_1.edit(id, req))
      }
  
    // @LINE:11
    case controllers_BooksController_update5_route(params@_) =>
      call { 
        controllers_BooksController_update5_invoker.call(
          req => BooksController_1.update(req))
      }
  
    // @LINE:12
    case controllers_BooksController_delete6_route(params@_) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_BooksController_delete6_invoker.call(
          req => BooksController_1.delete(id, req))
      }
  
    // @LINE:13
    case controllers_BooksController_detail7_route(params@_) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_BooksController_detail7_invoker.call(
          req => BooksController_1.detail(id, req))
      }
  
    // @LINE:21
    case controllers_Assets_versioned8_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned8_invoker.call(Assets_2.versioned(path, file))
      }
  }
}
