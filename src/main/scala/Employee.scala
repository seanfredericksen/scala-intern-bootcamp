import scala.util.Random

class Employee(var name: String, var timeEmployedInDays: Int) {
  private val age = Random.nextInt(82) + 18

  def getAge(): Int = age


}
