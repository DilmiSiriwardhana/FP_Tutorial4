object Q1 {

  def main(args: Array[String]): Unit = {
    print("Enter the deposit amount : ")
    var amount : Double = scala.io.StdIn.readLine().toDouble

    def interest(amount: Double): Double = {
      var flat: Double = 0.0

      if (amount <= 20000) {
        flat = 0.02
      }
      else if (20000 < amount && amount<= 200000){
        flat = 0.04
      }
      else if (200000 < amount && amount <= 2000000) {
        flat = 0.035
      }
      else if (amount > 2000000) {
        flat = 0.065
      }
      else {
        flat = 0
      }

       amount+amount*flat
    }

    val result = interest(amount)
    println("Deposit amount : " + amount)
    println("Actual amount : " + result)

  }
}