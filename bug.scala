```scala
import scala.util.Try

case class Person(name: String, age: Int)

object Main extends App {
  val people = List(Person("Alice", 30), Person("Bob", 25), Person("Charlie", 35))

  val result = people.map { person =>
    Try(person.age / 0) //Simulate an error
    person.name
  }

  println(result) //Outputs: List(Alice, Bob, Charlie) 
}
```