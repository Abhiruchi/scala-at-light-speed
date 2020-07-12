package com.rockthejvm

object FunctionalProgramming extends App {

  // scala is OO
  class Person (name: String) {
    def apply(x: Int) = println(s"my age is $x years")
  }

  val p = new Person("abhiruchi")
  p.apply(25)
  p(25) // INVOKING bob as a function, which is allowed via apply method

  /*
  FUNCTIONAL PROGRAMMING -
  - compose functions
  - pass functions as arguements
  - return functions as results
  - behave as objects and variables

  JVM introduced FunctionX to support FP on its OOM
   */


  // function - int add
  val func1 = new Function1[Int, Int] {
    override def apply(x: Int): Int = x + 1
  }

  func1.apply(2)
  func1(2)

  // all scala functions are instances of functionx types, function1, function2, to fucntion22

  val func2 = new Function2[String, String, String] {
    override def apply(x: String, y: String): String = x + y
  }

  func2.apply("112dfvdds" , "wfaefa")
  func2("anckdjscn", "sdlkncdjks")

  // syntax sugars
  val doubler: Function1[Int, Int] = (x: Int) => 2 * x
  doubler(2) // return 4

  // map, flatmap, filter, for comprehensions

  // COLLECTIONS - list, sequences, vectors, sets, rnages, tuples, map






}
