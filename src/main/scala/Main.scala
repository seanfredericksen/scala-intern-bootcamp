
object Main {
  def main(args: Array[String]) {
    val employees = List(Employee("Sean", 900), Employee("Chris", 2))

    //Do it twice to see how output changes
    employees.foreach(println)
    employees.foreach(println)
  }
}
