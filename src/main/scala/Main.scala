
object Main {
  def main(args: Array[String]) {
    val employees = List(new Employee("Sean", 900), new Employee("Chris", 2))

    employees.foreach(employee => println(employee.name + " " + employee.timeEmployedInDays + " " + employee.getAge()))
  }
}
