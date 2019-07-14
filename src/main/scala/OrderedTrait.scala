class Person(val name : String, val age : Int) extends Ordered[Person]{
  override def compare(that: Person): Int = {
    if(this.name==that.name){
      this.age - that.age
    }
    else {
      this.name.length - that.name.length
    }
  }
}

object Person extends App{
  val personOne = new Person("Anjali",22)
  val personTwo = new Person("Amitabh",26)
  println(personOne<personTwo)
}
