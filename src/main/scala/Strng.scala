package test

class Strng(param: String)

object Strng {
  def apply(param: String): Strng = {
    new Strng(param)
  }
}
