
sealed trait Shape

case class Rectangle(x: Int, y: Int) extends Shape

case class Circle(radius: Int) extends Shape

@main def hello: Unit = 
  println("Case classes")
  val r1: Shape = Rectangle(1,2)
  val r2: Shape = Circle(4)
  val area1 = 
    r1 match 
      case Rectangle(width, height) => width * height
      case Circle(radius) => radius * radius * 3.14
  val area2 = 
    r2 match 
      case Rectangle(width, height) => width * height
      case Circle(radius) => radius * radius * 3.14
  println(area1)
  println(area2)
val r2 = Rectangle(1,2)
val msg = "I was compiled by Scala 3. :)"