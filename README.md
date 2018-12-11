# Final Project - CSCI3055U - Scala

- Tran Tien Anh Ta
- trantienanh.ta@uoit.net

## About the language

**Description**: Scala is a general purpose programming language. It is also supports Functional programming, Object oriented programming, Imperative programming and Concurrent computing. Scala itself is a strong static system, designed to address Java's problems. 

**History**: Publicly released on January 20, 2004. Scala was first designed in 2001 by Martin Odersky, co-creator of javac and Java Generic, at the École Polytechnique Fédérale de Lausanne (EPFL) in Lausanne, Switzerland. Scala design decisions and conceptions was to be multi paradigm, focused on the JVM and to overcome the problems left by other languages. 


> - If I were to pick a language to use today other than Java, it would be Scala. – James Gosling, creator of Java
> - If someone had shown me the ‘Programming in Scala’ book back in 2003, I’d probably have never created Groovy – James Strachan, creator of Groovy
> - No other language on the JVM seems as capable of being ‘replacement of Java’ as Scala, and the momentum behind Scala is now unquestionable – Charles Nutter , co-creator of JRuby

**Snippets** (Interesting features about Scala):
1. Scala can import libraries anywhere in the code, unlike Java import statements only being at the top.
2. Type declarations are done after the value. 
3. Methods can have multiple parameter lists.
4. In Scala, it is possible to define methods in methods.

## About the syntax

*HelloWorld.scala*
```Scala
object HelloWorld extends App {
   println("Hello, World!")
 }
```

## About the tools
For beginners to Scala, there are two most widely known tools that are advertised on Scala main website. The easy to set up and use **IntelliJ** or **SBT**. IntelliJ is an IDE that handles compiling Scala files and downloads Scala SDK as a plugin. It the most beginner friendly option. The other is SBT, the open-source build tool for Scala projects. 

Though normally using the Simple Build Tool (SBT) to build Scala applications, more basic tools can be use to compile and run scala programs instead, like Scalac. **Scalac** is the Scala compiler and works like most comilers, t takes a source file as argument, maybe some options, and produces one or several object files. The object files it produces are standard Java class files. Once compiled, a Scala program can be run using the **scala** command, it is very similar to the java command used to run Java programs.

For example, if we were to comiple "HelloWorld.scala", we would do *> scalac HelloWorld.scala*. This will generate a few class files in the current directory. One of them will be called HelloWorld.class, and contains a class which can be directly executed using the scala command. To execute, we would type *> scala -classpath . HelloWorld*. This would output *Hello, world!*.

## About the standard library

Scala standard library includes core types like Int, Float, Array or Option. 

Notable packages also includes:

scala.collection and its sub-packages contain Scala's collections framework
- scala.collection.immutable - *Vector, List, Range, HashMap or HashSet*
- scala.collection.mutable - *ArrayBuffer, StringBuilder, HashMap or HashSet*
- scala.collection.concurrent - *TrieMap*
- scala.collection.parallel.immutable - *ParVector, ParRange, ParHashMap or ParHashSet*
- scala.collection.parallel.mutable - *ParArray, ParHashMap, ParTrieMap or ParHashSet*
- scala.concurrent - *Futures and Promises*

scala.io - *Input and output operations* <br>
scala.math - *Basic math functions and additional numeric types like BigInt and BigDecimal* <br>
scala.sys - *Interaction with other processes and the operating system* <br>
scala.util.matching - *Regular expressions* <br>

## About open source library

> _Describe at least one contribution by the open source
community written in the language._

# Analysis of the language

> _Organize your report according to the project description
document_.


