object Q2 {

  def main(args: Array[String]): Unit = {
    print("Enter the number : ")
    var num : Int = scala.io.StdIn.readLine().toInt

    def pattern(num : Int): String = {
      var output : String = ""

      if(num>0){
        if (num % 2 == 0) {
          output = "Even"
        }
        else {
          output = "Odd"
        }
      }
      else {
        output = "Negative/Zero"
      }

      output
    }

    val result = pattern(num)
    println(result)
  }
}