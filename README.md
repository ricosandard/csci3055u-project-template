# Final Project - CSCI3055U - Scala

- Tran Tien Anh Ta
- trantienanh.ta@uoit.net

## About the language

**Description**: Scala is a general purpose programming language that supports Functional programming, Object oriented programming, Imperative programming and Concurrent computing. Scala is even a strong static system and designed to address Java's problems. 

**History**: Publicly released on January 20, 2004. Scala was first designed in 2001 by Martin Odersky, the co-creator of javac and Java Generic, at the École Polytechnique Fédérale de Lausanne (EPFL) in Lausanne, Switzerland. Scala was designed to be multi paradigm, focused on the JVM and to overcome the problems left by other languages. 

*A few quotes on Scala:*
> - If I were to pick a language to use today other than Java, it would be Scala. – James Gosling, creator of Java
> - If someone had shown me the ‘Programming in Scala’ book back in 2003, I’d probably have never created Groovy – James Strachan, creator of Groovy
> - No other language on the JVM seems as capable of being ‘replacement of Java’ as Scala, and the momentum behind Scala is now unquestionable – Charles Nutter , co-creator of JRuby

**Snippets**:
Some interesting features of Scala would be:
1. Scala can import libraries anywhere in the code, unlike Java import statements where it was only at the top.
2. Type declarations are done after the value. As such, you have to trained yourself again to instead of typing *int num*, you are typing *num: int*.
3. Methods can have multiple parameter lists.
4. In Scala, it is possible to define methods in methods.

## About the syntax
Our very first Hello, World app in Scala!
*HelloWorld.scala*
```Scala
object HelloWorld extends App {
   println("Hello, World!")
 }
```

## About the tools
For beginners to Scala, two most widely known tools to compile and execute scala source files, even advertised on Scala main website, are **IntelliJ** and **SBT**. IntelliJ is an IDE that is perfect for beginners. It handles Scala compilation and execution through a Scala SDK plugin. SBT is the open-source build tool that is better for experienced programmers, SBT handles compilation and execution while much faster then IntelliJ, do not have the ease of use IntelliJ has.

**Scalac** is the Scala compiler and works like most comilers do, it takes a source file as argument, maybe some options, and produces one or several object files. The object files it produces are standard Java class files. Once compiled, a Scala program can be run using the **scala** command, it is very similar to the java command used to run Java programs.

For example, if we were to compile "HelloWorld.scala", we would do *> scalac HelloWorld.scala*. This will generate a few class files in the current directory. One of them will be called HelloWorld.class, and contains a class which can be directly executed using the scala command. To execute this, we would type *> scala HelloWorld. This would output *Hello, world!*.

## About the standard library

The Standard Library for Scala includes core types like Int, Float, Array or Option. 

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
Some examples of Specialized Libraries outside of the standard libraries are:

**Vegas**
Description: Vegas is the MatPlotLib of Scala, this means Vegas is specifically designed for plotting. Vegas excel at the visualization of big data and their analysis.

**ENSIME**
Description: ENSIME brings IDE-like features of Scala and Java to text editors. Those features include: 
1. Show inferred types
2. Contextual completion
3. Semantic highlighting with implicit expansions
4. Jump to source code or documentation
5. Refactorings (rename, organise imports)
6. Errors and warnings in your code (i.e. “red squigglies”).

**Cats**
Description: Cats is a library which provides abstractions for functional programming in the Scala programming language. The name is a playful shortening of the word category

# Analysis of the language

**Style**: Scala is a general programming language and as such you can find it implemented in varying kinds of open-sourced projects, proprietary applications and more . The syntax of Scala, broadly speaking, are familiar to that of Java where Scala is object-oriented and different in Scala supports for functional programming with more focused on being concise. Meaning a scala source file can be half the size of a java sources file that do the exact same thing.

**Macros**: Scala allows for meta-programming such as macros. The average users will most likely not use macros, they will definitely use one of Scala many specialized libraries that incorporate macros into their libraries. The reason for this is because specialized libraries such as spire, where macros are used to avoid expensive runtime allocations and method calls, and ScalaTest, to surface source context information like variable names, file names and line numbers, have powerful constructs which are fully type safe. The average may not be able to do this on their first try and as such are much more likely to use someone else much safer and much more useful macros.

**Symbol resolution**: Symbolic operators in Scala can be divided into four broad categories Keywords/reserved symbols, Automatically imported methods, Common methods and Syntactic sugars/composition. Examples of these categories would be: 
- <-    // Keyword
- ->    // Method provided by implicit conversion
- <=    // Common method
- ++=   // Can be a common method or syntactic sugar involving ++ method
- ::    // Common method or object
- _+_   // Not really a single operator; it's parsed as _ + _
The symbols exact meaning depends entirely on the class that is defining them. For example, *<=* on *Int* means "less than or equal to”, but it might mean something else in another class. On a side note, there are known problem with the IntelliJ IDE and symbol resolutions, the problem being IntelliJ not being able to resolved symbols while sbt could perfectly. 

**Closure**: If the closure you are thinking is a first class function which captures the lexical bindings of free variables in its defining environment. Once it has captured the lexical bindings the function becomes a closure because it "closes over" those variable. Then yes, Scala supports Closure, but there is a difference in Scala when you capture a *var* or a *val*. For val, the closure class contains only a copy of the val. For var though, the declaration of the var itself has to be changed at the call site location.

**Functional programming constructs**: Part of the language

**Scoping rules**: Scala suports lexcial scoping.

**Type system**: Scala is a strong statically typed language.

**Strengths**: Scala has simple and straightforward syntax, meaning a complex code in Java can be written for much less in Scala. It is also highly functional and fast as Scala was intended for resource-heavy back end development. In short, Scala is faster, simpler and as powerful as Java.

**Weaknesses**: Scala community are not as strong or developed like Java. The documentations are also limited and hard to understand. Not only that, since Java 8, the future of Scala as a language has come to question as many of the things Scala could do and Java can't has been implemented in Java 8. 
