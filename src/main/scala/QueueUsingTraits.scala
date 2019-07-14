import scala.collection.mutable.ListBuffer
trait Queue{
  def enqueue(x : Int,listBuffer: ListBuffer[Int]):ListBuffer[Int]
  def dequeue(listBuffer: ListBuffer[Int]):ListBuffer[Int]
}
class DoubleQueue extends Queue {
  override def enqueue(x : Int,listBuffer: ListBuffer[Int]): ListBuffer[Int] = {
    listBuffer += (2*x)
  }
  override def dequeue(listBuffer: ListBuffer[Int]): ListBuffer[Int] = {
    listBuffer.remove(0)
    listBuffer
  }
}
class SquareQueue extends Queue {
  override def enqueue(x : Int,listBuffer: ListBuffer[Int]): ListBuffer[Int] = {
    listBuffer += (x*x)
  }
  override def dequeue(listBuffer: ListBuffer[Int]): ListBuffer[Int] = {
    listBuffer.remove(0)
    listBuffer
  }
}
object Main extends App {
  var list = new  ListBuffer[Int]
  var obj = new DoubleQueue
  obj.enqueue(2,list)
  obj.enqueue(3,list)
  obj.enqueue(4,list)
  obj.dequeue(list)
  println(list)
  var obj2 = new SquareQueue
  obj2.enqueue(2,list)
  obj2.enqueue(3,list)
  obj2.dequeue(list)
  obj2.dequeue(list)
  println(list)
}
