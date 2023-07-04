import scala.io.StdIn.readLine
object Q3 {

  def main(args: Array[String]): Unit = {
    var name: String = readLine("Enter the string : ")
    var startIndex: Int = readLine("Enter the starting index to be changed : ").toInt
    var endIndex: Int = readLine("Enter the end index to be changed : ").toInt

    def toUpper(name : String, startIndex : Int, endIndex : Int): String = {
      var modifyName = name
      for (i <- startIndex to endIndex) {
        val convertWord = modifyName.charAt(i).toUpper
        modifyName = modifyName.updated(i, convertWord)
      }
      modifyName
    }

    def toLower(name : String, startIndex : Int, endIndex : Int): String = {
      var modifyName = name
      for (i <- startIndex to endIndex) {
        val convertWord = modifyName.charAt(i).toLower
        modifyName = modifyName.updated(i, convertWord)
      }
      modifyName
    }

    def formatName(name : String, startIndex : Int, endIndex : Int, f:(String,Int,Int) => String) : String = {
      f(name, startIndex, endIndex)
    }

    val result = formatName(name,startIndex,endIndex,toUpper)
    println(result)
  }
}