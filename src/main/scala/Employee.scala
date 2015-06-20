import scala.util.Random

class Employee(var name: String, var timeEmployedInDays: Int) {
   def age = Employee.getRandomAge()

  def getAge(): Int = age
  override def toString = name + " " + getAge() + " " + timeEmployedInDays
}

object Employee {
  def apply(name: String, timeEmployedInDays: Int) = new Employee(name, timeEmployedInDays)
  def getRandomAge() = Random.nextInt(82) + 18
}
