package com.rockthejvm

object Basics extends App {
  // extends App - can run as a standalon application

  // Primitive types  - Int, Boolean, Float, Char, Double, String

  // don't always need to specif type INT etc as compiler is smart enough to deduce
  val integervalue: Int = 42 // const int, cannot be reassigned, reassigning to val is illegal
  // see RHS and assign boolean to autoAssignedBoolean
  val autoAssignedBoolean = true

  // string and string operations
  val simpleString = "Abhiruchi Gupta"
  val composedString = "hello" + " " + "hey!" + " !1@! "
  val interpolatedString = s"hello $composedString"

  // expression - structures that can be reduced to a value
  val expression = 2 + 3

  // if expression
  val ifexpression = if (expression > 5) 4 else 3

  // not doing something in if else, rather assigning to expressions
  val chainedexpression =
    if (expression > 5) 4
    else if (expression < 0) 0
    else if (expression < 2) 2
    else 5

  // code blocks
  val codeblocks = {
    // definitions
    // local values
    // inner code blocks
    // functions
    // last value is value of codeblocks - assign type based on last returned value, if 42, int
    val a = 4
    a
  }

  // functions

  // single expression function
  def myfunc(a: Int, b: Boolean): String = a + " " + b

  // coee block functions
  def myfunc2(a: Int, b: Boolean): String = {
    "a"
  }

  // recursive functions
  def recfunction(n: Int): Int =
    if (n <= 1) 1
    else n * recfunction(n - 1)

  // in scala, we dont use loops or iterations, we use recursion

  // Unit type = no menainful value  ~ void
  // type of side affects
  println("HELLO")
  def unitfunction: Unit = {
    println("hello")
    // unit returns {}
    val unit = {}
  }

}
