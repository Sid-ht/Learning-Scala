import scala.util.Random

object PatternMatching extends App{


  val random = new Random()
  val x = random.nextInt(10)

  val description = x match {
    case 1 => "the One"
    case 2 => "double or nothing"
    case 3 => "third time i the charm"
    case _ => "something else"
  }

    println(x)
    println(description)

    // decompose values
    case class Person(name : String, age : Int)
    val bob = Person("Bob",20)

    val greeting = bob match {
      case Person(n,a) if a < 21 => s"Hi, My name is $n and I can't drink in US"
      case Person(n,a)  => s"Hi, My name is $n and I am $a years old"
      case _ => "I don't know who I am"
    }

     println(greeting)
  /*
  cases are matched in orders
  Match Error occurs when there is no match found
  Type of PM expression => unified lowest common ancestor
  PM works well with case classes
   */

  // PM on sealed hierarchies

  sealed class Animal // helps in covering PM cases
  case class Dog(breed:String) extends Animal
  case class Parrot(greeting : String) extends Animal

  val animal : Animal = Dog("Terra Nova")
  animal match{
    case Dog(someBreed) => println(s"Matched a dog of $someBreed breed")
  }
}
