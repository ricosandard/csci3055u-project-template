import scala.io.StdIn

object scanner {
  def main(args : Array[String]){

    println ("Hi! What's your name?")
    val str = StdIn.readLine()

    println ("My name is " + str)

  }
}
