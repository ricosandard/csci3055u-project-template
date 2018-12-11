object variable {
  def main(args: Array[String]) {
    //Declaration
    var a = 10
    val b = 10

    println(b + 1)
    println(a + 1)

    println()
    a += 1 //I can change a, but I can't b because val is immutable

    println (a)
    println (b)

    //Value Conversion
    println()
    a = b.toInt

    println (a)

    //Type Declaration
    var num : Int = 0
    val num1 : Float = 1
    val num2 : Double = 2.3
    var name : String = "Rico"
    var name1 : Char = 'H'

  }
}
