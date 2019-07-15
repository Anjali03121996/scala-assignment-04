package com.queue
import scala.collection.mutable.ListBuffer
trait Queue{
  def enqueue(x : Int,listBuffer: ListBuffer[Int]):ListBuffer[Int]
  def dequeue(listBuffer: ListBuffer[Int]):ListBuffer[Int] = {
    listBuffer.remove(0)
    listBuffer
  }
}
object Main extends App {
  val list = new  ListBuffer[Int]
  val obj = new DoubleEnqueue
  obj.enqueue(2,list)
  obj.enqueue(3,list)
  obj.enqueue(4,list)
  obj.dequeue(list)
  println(list)
  val obj2 = new SquareEnqueue
  obj2.enqueue(2,list)
  obj2.enqueue(3,list)
  obj2.dequeue(list)
  obj2.dequeue(list)
  println(list)
}
