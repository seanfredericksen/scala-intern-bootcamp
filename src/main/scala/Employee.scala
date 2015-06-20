import scala.util.Random

class Employee(var name: String, var timeEmployedInDays: Int, employeeAge : Int) {
  private val age = employeeAge

  def getAge(): Int = age
  override def toString = name + " " + getAge() + " " + timeEmployedInDays
}

object Employee {
  def apply(name: String, timeEmployedInDays: Int) = new Employee(name, timeEmployedInDays, Random.nextInt(82) + 18)
}
