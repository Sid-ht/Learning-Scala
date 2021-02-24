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

//To print values which are present at even positions in a list

def f(arr:List[Int]):List[Int] =  List.range(1, arr.length, 2) map(arr(_))

//Reverse a list

def f(arr:List[Int]):List[Int] = arr.foldLeft(List[Int]()) ((acc,i) => i::acc)

//Sum of Odd Elements

def f (arr:List[Int]):Int = arr.filter(_%2!=0).fold(0)((acc,v) => acc+v)

//Length of list

def f(arr:List[Int]):Int = arr.foldLeft(0) ((acc,i) => acc + 1)

//Update List - negative number to positive number

def f(arr:List[Int]):List[Int] = arr.map((x:Int) => if (x < 0) -x else x)
