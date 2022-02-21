import scala.annotation.tailrec

case class AddressBook(contacts: List[Contact])
case class Contact(
  name: String,
  email: String,
  phoneNumbers: List[String]
)


@main 
def hello: Unit = 
  println("------------Collections-------------")
  val bob = Contact("bob", "bob@gmail.com", List())
  val alice = Contact("alice", "alice@gmail.com", List("12345"))
  val addressBook = AddressBook(List(bob, alice))
  val numberOfContacts = addressBook.contacts.size
  println(s"Number of contacts: $numberOfContacts")
  val isAliceInContacts = addressBook.contacts.contains(alice)
  println(s"is alice in contacts: $isAliceInContacts")
  val contactsName = addressBook.contacts.map(contact => contact.name.toUpperCase)
  println(s"Contact name: $contactsName")
  val contactsWithPhone =
    addressBook.contacts.filter(contact => contact.phoneNumbers.nonEmpty)
  println(s"Contact with phone numbers: $contactsWithPhone")
  println("------------Functions-----------")
  val increment: Int => Int =
    x => x + 1
  val add =
    (x: Int, y: Int) => x + y
  println(add(10,increment(11)))
  val list1 = 1 :: 2 :: 3 :: Nil
  println(list1)
  val list2 = list1 ::: 5 ::  Nil
  println(list2)
  val factorial = 
    (x: Double) =>
      @tailrec
      def fact(x: Double, accum: Double): Double = 
        if x == 1 then
          accum 
        else
          fact(x - 1, accum * x)
      fact(x, 1) 
  println(factorial(10.0))
  val pair = ("alice", 42)
  println(pair(0))
  println(pair(1))
  val map_1 = Map("a" -> 1, "b" -> 2)
  println(map_1)
  println(map_1("a"))
  println(map_1.isEmpty)
  println(map_1.nonEmpty)
  val map_2 = map_1.map((key, value) => 
    println(key)
    if key == "a" then
      key -> value * 2
    else
      key -> value)
  println(map_2)
  val l1 = List(1,2,3)
  val l2 = List(4,5,6)
  val r = l1 ++ l2
  val r2 = l1 +: l2
  println(r)
  println(r2)