```scala
import scala.util.{Try, Success, Failure}

case class Person(name: String, age: Int)

object Main extends App {
  val people = List(Person("Alice", 30), Person("Bob", 25), Person("Charlie", 35))

  val result = for {
    person <- people
    ageResult <- Try(person.age / 0) //Simulate an error
  } yield person.name

  result match {
      case Success(names) => println(s"Successful processing: $names")
      case Failure(exception) => println(s"Error encountered: ${exception.getMessage}")
  }
}
```