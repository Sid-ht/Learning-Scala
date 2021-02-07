object CaseClasses extends App{

  case class Person(name : String, age : Int)

  // class parameters are fields
  val jim = new Person("Jim",34)
  println(jim.name)

  // sensible toString
  // println(instance) = println(instance.toString) //syntactic sugar
  println(jim)

  // equals and hashcode implements OOTB
  val jim2 = new Person("Jim", 34)
  println(jim == jim2)

  // case classes have handy copy method
  val jim3 = jim.copy(age=43)
  println(jim3)

  // case classes have companion objects
  val thePerson = Person
  val mary = Person("Mary", 23)

  // case classes are serializable -- used in Akka

  // ccs can be used in pattern matching

  case object UnitedKingdom{
    def name : String = "The UK of GB and NI"
  }


}
