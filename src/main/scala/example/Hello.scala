package example
import scala.concurrent.{ExecutionContext, Future}
import sys.process._

object Hello extends Greeting with App {
  val p = "sleep 10".run()
  Future(p.exitValue())(ExecutionContext.global)
  println("wei")
}

trait Greeting {
  lazy val greeting: String = "hello"
}
