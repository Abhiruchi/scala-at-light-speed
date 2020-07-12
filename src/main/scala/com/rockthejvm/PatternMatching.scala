package com.rockthejvm

object PatternMatching extends App {
  val a = 55
  val b = a match {
    case 1 => "firs"
    case 2 => "sec"
    case _ => "done"
  }


  case class Person(name: String, age: Int)

  val abhiruchi = Person("abhiruchi", 25)
  val hellomessage = abhiruchi match {
    case Person(n, a) => s"person is $n and $a"
    case  _ => "i dont know"
  }

  println(hellomessage)
  // pattern matching only avlbl for case classes


  // deconstrcuting tuples
  val atuple = ("a", "b")
  val hellomessage2 = atuple match {
    case (n, a) => s"person is $n and $a"
    case  _ => "i dont know"
  }
  println(hellomessage2)

  // decomposing lists
  val alist = List("1", 2, "b")
  val hellomessage3 = alist match {
    case List(_, 2, _) => s"person is 2 in middle"
    case  _ => "i dont know"
  }
  println(hellomessage3)

  // if PM doesnt match anything, it will throw match error

  // will try all cases sequentially
  val hellomessage4 = alist match {
    case  _ => "i dont know"
    case List(_, 2, _) => s"person is 2 in middle"
  }
  println(hellomessage4)

}
