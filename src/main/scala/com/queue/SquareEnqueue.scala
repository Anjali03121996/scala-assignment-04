package com.queue
import scala.collection.mutable.ListBuffer
class SquareEnqueue extends com.queue.Queue {
  override def enqueue(x : Int,listBuffer: ListBuffer[Int]): ListBuffer[Int] = {
    listBuffer += (x*x)
  }
}

