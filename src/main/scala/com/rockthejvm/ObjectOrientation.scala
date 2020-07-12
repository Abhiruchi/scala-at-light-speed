package com.rockthejvm

object ObjectOrientation extends App {
  // scala - OO language - have classes and objects

  // class and instance
  class Animal {
    val age: Int = 0
    def func(): String = {
      ""
    }
  }
  val animal = new Animal

  class Dog extends Animal

  class Dog2(name: String) extends Animal

  val dog2 = new Dog2("123")

  // not good below as CTOR arguments are not fields
  //dog2.name

  class Dog3(val name: String) extends Animal

  val dog3 = new Dog3("123")

  // now ok as saved as val, which makes it a member of the class, thus put a val before the CTOR argument
  dog3.name


  val dog4: Animal = new Dog2("polymorphism")
  // will be called via the dog class, if overridden then that will be called
  val abb: String = dog4.func()

  abstract class Ab {
    // can define some
    val ab = true // by default public , can restrict by using private (only class has access), protected (class and its descendents have access)
    // left implementation for those who want to
    def Walk() : Unit
  }

  // interface - ultimate abstract type
  trait interfaceclass {
    def eat(animal : Animal): Unit
  }

  // scala suppor single class inheritence but multi class traits
  class A extends Animal with interfaceclass {
    override def eat(animal: Animal): Unit = {
      println("eat")
    }

    // method naming  good options
    def ?!(s: String): Unit = {

    }
  }
  // single class inheritence + multi trait === MIXING

  // infix notation - for single arguement functions -- object method arguement
  val abc = new A
  abc.eat(dog2)
  abc eat dog2

  // method in between
  abc ?! "what"

  // operators in scala are actually methods
  1 + 2

  // instantiating anonymous classes on the fly
  val dd = new A {
    override def ?!(s: String): Unit = super.?!(s)
  }

  // singleton objects
  object Mysingleton // defined as only instance of this type

  object Mysingleton2 {
    val a = 2
    def ab(): Unit = {

    }

    // called by default below, invoked as fucntions, functional programming
    def apply(X: Int): Int = X + 1

  }

  Mysingleton2(42)


  //can define class and object of sam ename, they will be called as companions
  object Animal {
    // companion object, can be trait as well
    // componions can access each other private field and methods
    val a = false
  }

  Animal.a

  // case classes - lightweight DS with boilerplate
  case class caseclass(name: String)
  // compiler automatically generates equals and hash code for inclusion in various collections. generates serialization, generates companion with apply.
  // thus case classes csn be constructed without new

  // may be constructed without using new
  val ca2 = caseclass("hi")

  // exceptions
  try {
    val a:String = null
    a.length
  } catch {
    case e: Exception => "null exception"
  } finally {
    println("done")
  }

  // generics / templating
  abstract class mylist[T] {
    def head: T
    def tail: mylist[T]
  }

  // same like using LIST of scala. using a generic with a concrete type
  val alist: List[Int] = List(1,2,3)
  val first = alist.head
  val last = alist.tail

  // in scala, we deal with immutable classes
  // any modification to object must return naother object
  val list_new = alist.reverse // return a new list
  // works miracles inmulti threading env
  // helps making code sense and reasoning about
  // scala closest to OO ideal, every peice is inside an instance, part of object or class, true OO

  // App has main method. static methid implementted in app. execute object's body and thats why runnable

}
