object conditionals {

  def main(args: Array[String]) {
    //if-else
    var x = 1
    if( x < 5 ){
      println("x is smaller then 5")
    } else if ( x == 5) {
      println("x is 5")
    } else {
      println("Not much going on here")
    }

    println()

    //case
    println(switch(3))

    println()

    //ternary operator
    val a = if (x == 1) 5 else 10
    println (a)

    println()

    //case - for loop
    for (name <- List("Rico", "Connor", "Jack")){
      name match{
        case "Rico" => println ("Welcome back, " + name)
        case _ => println ("I don't recognize you.")
      }
    }

    println()

    //if else - for loop
    for( num <- 1 to 10
         if num > 5 & num < 10 ){
      println( "Value of a: " + num )
    }

  }

  //case
  def switch(num: Int): String = num match {
    case 1 => "one"
    case 2 => "two"
    case 3 => "three"
    case _ => "many"
  }

}
