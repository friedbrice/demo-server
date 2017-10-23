package io.enemyofthestate

import io.enemyofthestate.demoprotocol.scalaapi._

package object demoserver {

  val fooBarHandler: FooBarService[Option] = new FooBarService[Option] {
    def greet(name: String, data: DemoRecord): Option[String] =
      Some(s"Hello, $name. I haven't seen you in ${data.bar} ${data.foo}s")
  }
}
