package com.rockthejvm

import scala.util.Try
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future

object Advanced extends App {
  // lazy val
  // not assigned until used

  lazy val a = 2
  lazy val b = {
    println("b")
    42
  }

  val c = {
    println("a")
    42
  }

  val d = b + 1

  // useful in infinite collections

  // pseudo collections: Options, try

  // bad way to handle null
  def unsafemethodnull: String = "hey"
  if (unsafemethodnull == null)
    println("it was null")


  // use option
  val option1 = Option(unsafemethodnull) // Some("hello") , None

  val bb = option1 match {
    case Some(string) => println("string")
    case None => println("null case")
  }

  // Try guards against methods that can throw exceptions

  def exceptionmessage: Unit = {
    throw new RuntimeException
  }

  try {
    exceptionmessage
  } catch {
    case e: RuntimeException => println("runtime")
  }

  val try2 = Try(exceptionmessage)
  // either a value if ok else exception


  // evaluate something on another thread, async
  val afuture = Future({
    println("start")
    Thread.sleep(4000)
    println("end")
    67
  })

  val afuture2 = Future{
    println("start2")
    //Thread.sleep(4000)
    println("end2")
    67
  }
  // future is a collection which contains a value until it is evaluated

  // monads - TRY, OPTIONS, FUTURE


  // IMPLICITS
  // impicit arguemtns
  def implicitarg(implicit  a: Int) = a + 1
  implicit val abc = 46
  println(implicitarg) // finds implict defined recently

  // implicit conversions
  implicit class check(n: Int) {
    def iseven() = n%2 == 0
  }

  println(42.iseven()) // complier try to find any implicit wrapper, use implicits with very much care



}
