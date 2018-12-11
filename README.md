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

# Analysis of the language

> _Organize your report according to the project description
document_.
**Style**: Scala is a general programming language and as such you can find it being implemented in different kinds of open-sourced projects. Of those projects, the syntax are familiar to Java in that Scala is object-oriented, but different in that Scala supports functional programming. 

**Macros**: Scala allows for meta-programming such as macros, though the average users will most likely use one of Scala many libraries that incorporate macros instead of implementing their own macros. This is because libraries that uses macros such as spire, to avoid expensive runtime allocations and method calls, or ScalaTest, to surface source context information like variable names, file names and line numbers, have powerful constructs which are fully type safe.

**Symbol resolution**: Symbolic operators in Scala can be divided in to four categories Keywords/reserved symbols, Automatically imported methods, Common methods and Syntactic sugars/composition. The exact meaning of different symbols depend on the class that is defining them. For example, *<=* on *Int* means "less than or equal to". There are known problem with IntelliJ IDE of it not being able to resolved symbols that sbt could. 

**Closure**: Scala completely supports Closure, but there is a difference when you capture a var or a val. For val, the closure class contains a copy of the val. For var, the declaration of the var itself has to be changed at the call site location.

**Scoping rules**: Scala suports lexcial scoping.

**Type system**: Scala has a stong Static system.

**Strengths**: Scala has simple and straightforward syntax, meaning a complex code in Java can be written for much less in Scala. It is also highly functional and fast as Scala was intended for resource-heavy back end development. In short, Scala is faster, simpler and as powerful as Java.

**Weaknesses**: Scala community are not as strong or developed like Java. The documentations are also limited and hard to understand. Not only that, since Java 8, the future of Scala as a language has come to question as many of the things Scala could do and Java can't has been implemented in Java 8. 
