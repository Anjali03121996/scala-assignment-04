class FirstName(val firstName: String) extends AnyVal {
  def printFirstName = firstName
}
class LastName(val lastName: String) extends AnyVal {
  def printLastName = lastName
}
class Age(val age: Int) extends AnyVal {
  def printAge = age
}
object Details extends App {
  def displayDetails(firstName: FirstName, lastName: LastName, age: Age) = {
    println(firstName.printFirstName+ " " + lastName.printLastName + " is of " + age.printAge + " age.")
  }
  displayDetails(new FirstName("Anjali"), new LastName("Sharma"), new Age(22))
}