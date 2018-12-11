//Best I could do while learning a new language in one day

import scala.io.Source  //File Reader
import breeze.plot._    //Data Visualization

object realapp {
  def main(args : Array[String]) = {

    //Reading and Parsing the excel sheet
    //Inputting the elmenents into a 2 dimensional array
    val filename = "37100045.csv"
    var src = Source.fromFile(filename)
      .getLines()
      .map(_.split("\",\"").map(_.trim))
      .toArray

    //Input the province you wish to see, input "Canada" to see the mean of all provinces
    println ("Type in a province in Canada: (or Canada)")
    println ("Provinces: Newfoundland and Labrador, Prince Edward Island, Nova Scotia, New Brunswick, Quebec, Ontario, Manitoba, Saskatchewan, Alberta and British Columbia")
    val GEO = scala.io.StdIn.readLine()

    //Storing the tuition by:
    var INT_Grad : List[Int] = List()   //International Graduate
    var INT_Under : List[Int] = List()  //International Undergraduate
    var CAD_Grad : List[Int] = List()   //Canadian Graduate
    var CAD_Under : List[Int] = List()  //Canadian Undergraduate


    for (i <- src
           if i contains GEO) {
      if (i contains "Canadian undergraduate"){
        CAD_Under = CAD_Under :+ i(10).toInt
      }

      if (i contains "Canadian graduate"){
        CAD_Grad = CAD_Grad :+ i(10).toInt
      }

      if (i contains "International undergraduate"){
        INT_Under = INT_Under :+ i(10).toInt
      }

      if (i contains "International graduate"){
        INT_Grad = INT_Grad :+ i(10).toInt
      }
    }


    //Plotting each array by line plot
    val f = Figure()
    val p = f.subplot(0)
    val x = List(1,2,3,4,5,6,7,8,9,10,11,12,13) //X - Axis

    p += plot(x, CAD_Under) //Canadian Undergraduate
    p += plot(x, CAD_Grad)  //Canadian Graduate
    p += plot(x, INT_Under) //International Undergraduate
    p += plot(x, INT_Grad)  //International Graduate

    //Implement legends (Breeze API has not implemented a way to set legends other then the default 0, 1, 2, 3,...)
    p.legend = true

    //Labels and title
    p.xlabel = "School Years (2006/2007 to 2018/2019)"
    p.ylabel = "Tuition (CAD)"
    p.title = "Tuitions for 0. CAN Under 1. CAD Grad 2. INT Under 3. INT Grad"

    //Output the plot and save it as a .png image file in the folder
    f.saveas("lines.png")
  }
}
