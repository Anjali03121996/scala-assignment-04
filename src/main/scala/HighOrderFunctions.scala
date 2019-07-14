object HighOrderFunctions extends App {
  def sum(f :(Int,Int)=> Int,a: Int,b:Int): Int = f(a,b)
  val sumSquares = (a: Int,b: Int) => {
    print(s"($a*$a + $b*$b) ")
    a*a + b*b
  }
  val sumCubes = (a: Int,b: Int) => {
    print(s"($a*$a*$a + $b*$b*$b) ")
    (a*a*a + b*b*b)
  }
  val sumIntegers = (a: Int,b: Int) => {
    print(s"($a + $b) ")
    (a+b)
  }
  println(sum(sumSquares,5,4))
  println(sum(sumCubes,5,4))
  println(sum(sumIntegers,5,4))
}