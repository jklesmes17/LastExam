package test

object Hello extends EncodeDecode {
  def main(args: Array[String]): Unit = {
    println(encode(40))
    println(decode("1q"))
  }
}
