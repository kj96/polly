package controllers

import javax.inject._
import play.api._
import play.api.mvc._
import org.webjars.play.WebJarsUtil

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class HomeController @Inject()(cc: ControllerComponents) (implicit assets: AssetsFinder, webJarsUtil: WebJarsUtil) extends AbstractController(cc) {

  /**
   * Create an Action to render an HTML page.
   *
   * The configuration in the `routes` file means that this method
   * will be called when the application receives a `GET` request with
   * a path of `/`.
   */
  def home() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.index())
  }
  def first() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.test_1())
  }
  def index() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.s_home("yello"))
  }


  def register() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.s_register("yello"))
  }

  def login() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.s_login("yello"))
  }

}
