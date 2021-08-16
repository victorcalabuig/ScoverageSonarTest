object Main extends App {

  def hello(): Unit = println("hello")

  def sum(a: Int*): Int = a.sum
  sum(Seq(1,2,3): _*)

}
