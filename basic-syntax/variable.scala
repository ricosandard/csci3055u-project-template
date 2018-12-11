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

    //list
    val fruits = List("apples", "oranges", "pears")
    println(fruits(0))

    //2 dimensions
    val dim = List(
      List(1, 0, 0),
      List(0, 1, 0),
      List(0, 0, 1)
    )

    println (dim)

    val dim2 = (1 :: (0 :: (0 :: Nil))) ::
      (0 :: (1 :: (0 :: Nil))) ::
      (0 :: (0 :: (1 :: Nil))) :: Nil

    println(dim2)
  }
}
