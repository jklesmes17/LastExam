package test

trait EncodeDecode {
  val base30 = "0123456789QRSTUVWXYZABCDEFGHIJ"
  val baseLength = base30.length
  def encode(decimal: Int): String = {
    var str = ""
    var num = decimal
    while(num > 0) {
      val rem = num % 30
      str = base30.charAt(rem) + str
      num = num / 30
    }
    str
  }
  def decode(str: String): Int = {
    val newStr = str.toUpperCase
    var num = 0
    for (i <- 0 until newStr.length) {
      val index = newStr.charAt(i)
      val findVal = base30.indexOf(index)
      num = num * baseLength + findVal
    }
    num
  }
}
