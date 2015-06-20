
object Main {
  def main(args: Array[String]) {
    val employees = List(Employee("Sean", 900), Employee("Chris", 2))

    //Do it twice to see how output changes
    employees.foreach(println)
    employees.foreach(println)

    println(forStringLengths(List("foo", "bar", "", "sean", " ", "crabshack", "", null, "hoekstra", null)))
  }

  def forStringLengths(strings: List[String]) =
    for {
      string <- strings
    }  yield string match {
        case null => 0
        case "" => -1
        case _ => string.length
    }
}
