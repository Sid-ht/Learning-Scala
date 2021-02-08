object Sequences extends App{

  //Seq
  val aSequence = Seq(1,3,2)
  println(aSequence)
  println(aSequence.reverse)
  println(aSequence(2))
  println(aSequence ++ Seq(4,5,6))
  println(aSequence.sorted)

  //Ranges
  val aRange : Seq[Int] = 1 to 10
  aRange.foreach(println)

  //Lists
  val aList = List(1,2,3)
  val prepended = 42 :: aList
  val aLotMore = 42 +: aList :+ 45
  println(prepended)
  println(aLotMore)

  val apples5 = List.fill(5)("apple")
  println(apples5)
  println(aList.mkString("-!-"))

  //Arrays
  val numbers = Array(1,2,3)
  val threeElements = Array.ofDim[String](3)
  threeElements.foreach(println)

  numbers(2) = 0 // syntax sugar for numbers.update(2,0)
  println(numbers.mkString(" "))

}
