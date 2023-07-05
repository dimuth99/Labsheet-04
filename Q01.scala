package labsheet4

object Q01 {
    def main(args: Array[String]){
    print("Enter deposit amount : ")
    val depositAmount = scala.io.StdIn.readDouble()

    print(f"Actual amount of interest : ${calculateInterest(depositAmount)}%.2f")
  }

  def calculateInterest(depositAmount : Double) : Double = {
    depositAmount match{
      case amount if amount <= 20000 => amount*0.02
      case amount if amount <= 200000 => amount*0.04
      case amount if amount <= 2000000 => amount*0.035
      case amount => amount*0.065
    }
  }
}