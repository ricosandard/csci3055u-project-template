import scala.collection.mutable.HashMap

object Collection {
  def main(args : Array[String]){
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

    //Hash Map
    val hashMap1: HashMap[String, String] = HashMap(("PD","Plain Donut"),("SD","Strawberry Donut"),("CD","Chocolate Donut"))
    println (hashMap1("PD"))

    //adding to the hash map
    hashMap1 += ("KD" -> "Krispy Kreme Donut")
    println (hashMap1("KD"))

  }
}
