object MapFlatmapFilterFor extends App{

  val list = List(1,2,3)
  println(list)
  println(list.head)
  println(list.tail)

  println(list.map(_+1))
  println(list.map(_+ " is a number"))

  println(list.filter(_%2==0))

  //flatMap
  val toPair = (x:Int) => List(x,x+1)
  println(list.flatMap(toPair))

  val numbers = List(1,2,3)
  val chars = List('a','b','c','d')
  val colors = List("White","Black","Blue")

  val combinations = numbers.flatMap(n => chars.map(c => "" +c + n))
  println(combinations)
  val colorCombinations = numbers.flatMap(n => chars.flatMap(c => colors.map(color  => "" +c + n+ color)))
  println(colorCombinations)

  //for-each
  list.foreach(println)

  //for-comprehension
  val forCombinations = for {
    n <- numbers if n %2 == 0
    c <- chars
    color <- colors
  } yield "" + c + n + color

  println(forCombinations)

  for {
    n <- numbers
  }println(n)

}
