object AnonymousFunctions extends App{


  val doubler = new Function1[Int,Int] {
    override def apply(x:Int) = x*2
  }
  println(doubler(3))

  val doubler_new = (x:Int) => x*2
  println(doubler_new) // function itself
  println(doubler_new(4)) //function call

  val adder : (Int,Int) => Int = (x:Int,y:Int) => x+y
  println(adder(9,8))

  //curly braces with lambdas
  val stringToInt = {(str: String) =>
    str.toInt
  }

  val niceIncrementer: Int => Int = _ + 1 // equivalent to x => x+1
  val niceAdder: (Int,Int) => Int = _ + _ // equivalent to a + b
}
