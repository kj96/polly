package controllers

import javax.inject._
import play.api._
import play.api.mvc._
import org.webjars.play.WebJarsUtil

import com.sksamuel.elastic4s.RefreshPolicy
import com.sksamuel.elastic4s.http.{ElasticClient}
import com.sksamuel.elastic4s.http.Response
import com.sksamuel.elastic4s.http.search.SearchResponse

@Singleton
class ESController @Inject()(cc: ControllerComponents) (implicit assets: AssetsFinder, webJarsUtil: WebJarsUtil) extends AbstractController(cc) {

  def test() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.es_test("yello"))
  }
}