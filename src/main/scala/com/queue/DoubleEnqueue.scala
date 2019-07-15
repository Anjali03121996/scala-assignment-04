package com.queue
import scala.collection.mutable.ListBuffer
class DoubleEnqueue extends com.queue.Queue {
  override def enqueue(x : Int,listBuffer: ListBuffer[Int]): ListBuffer[Int] = {
    listBuffer += (2*x)
  }
  override def dequeue(listBuffer: ListBuffer[Int]): ListBuffer[Int] = {
    listBuffer.remove(0)
    listBuffer
  }
}

