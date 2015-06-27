
object Main {
  def main(args: Array[String]) {
    val employees = List(Employee("Sean", 900), Employee("Chris", 2))

    //Do it twice to see how output changes
    employees.foreach(println)
    employees.foreach(println)

    println(forStringLengths(List("foo", "bar", "", "sean", " ", "crabshack", "", null, "hoekstra", null)))
  }

  def mapOverList(ints: List[Int], f: Int => Int): List[Int] = {
    @scala.annotation.tailrec
    def go(ints: List[Int], accum: List[Int]): List[Int] = ints match {
      case Nil => accum.reverse
      case head :: tail => go(tail, f(head) :: accum)
    }
    go(ints, List[Int]())
  }

  def add(x: Int)(y: Int) = x + y

  val increment = add(1)_
  val decrement = add(-1)_

  def forStringLengths(strings: List[String]) =
    for {
      string <- strings
    }  yield string match {
        case null => 0
        case "" => -1
        case _ => string.length
    }
}
