//Sum of odd elements in a list

def f(arr: List[Int]) : Int = arr.filter(_%2 !=0).reduce(_+_)

def f(arr: List[Int]) : Int = arr.filter(_%2 !=0).fold(0)((acc,i) => acc+i)

def f(arr: List[Int]) : Int = arr.filter(_%2 !=0).sum

def f(arr: List[Int]) : Int = arr.filterNot(_%2 ==0).sum


//Hello Wolrd n Times

object Solution extends App {
  def f(n: Int) = for (i <- 1 to n) println("Hello World") // println("Hello World \n" *n)

  var n = scala.io.StdIn.readInt
  f(n)
}


//Replicate list to n number of times

def f(num:Int, arr:List[Int]) : List[Int] = arr.flatMap(List.fill(num)(_))
