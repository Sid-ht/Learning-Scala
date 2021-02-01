import scala.annotation.tailrec

object SortingDemo {

  def sortList(list: List[Int]): List[Int] = {
    //insertion sort

    def insert(number : Int, sortedList : List[Int]) :List[Int] =
      if (sortedList.isEmpty || number <= sortedList.head) number :: sortedList
      else sortedList.head :: insert(number, sortedList.tail)


    if (list.isEmpty || list.tail.isEmpty) list
    else insert(list.head,sortList(list.tail))

  }

  def sortBetter(list:List[Int]) : List[Int] = {
    @tailrec
    def insertTailRec(number:Int,sortedList : List[Int], accumulator : List[Int]) : List[Int] =
      if (sortedList.isEmpty || number <= sortedList.head) accumulator.reverse ++ (number:: sortedList)
      else insertTailRec(number,sortedList.tail,sortedList.head :: accumulator)
  @tailrec
  def sortTailrec(list:List[Int],accumulator : List[Int]) : List[Int] =
    if(list.isEmpty) accumulator
    else sortTailrec(list.tail, insertTailRec(list.head, accumulator, Nil))

  sortTailrec(list, Nil)
  }

  def main(args: Array[String]): Unit = {
    println(sortBetter((1 to 100000).reverse.toList)) // prints effectivey using tail rec
    // println(sortList((1 to 100000).reverse.toList)) --> causes Stack overflow since stacks crash in recursive calls

  }

}
