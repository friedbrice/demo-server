package io.enemyofthestate.demoserver

object Main extends App {

  import org.http4s._, org.http4s.dsl._

  val helloWorldService = HttpService {
    case GET -> Root / "hello" / name => Ok(s"Hello, $name.")
  }
}
