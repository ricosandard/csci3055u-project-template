object loops {
  def main(args : Array[String]){
    //for loop
    for (i <- 1 to 10){
      print (i + " ")
    }

    println()

    for (i <- 1 until 10) {
      print (i + " ")
    }

    println ()

    for (x <- 1 to 2; y <- 1 until 5){
      println (x + "+" + y  + "=" + (x + y))
    }

    println()

    //while loop
    val num = 10
    var i = 0
    while (i < num){
      print(i + " ")
      i += 1
    }

    println()

    do {
      print (i + " ")
      i += 1
    } while (i <  20)
  }
}
