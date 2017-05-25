/*
Write a Scala application, using the App trait, that prints the command-line arguments 
in reverse order, separated by spaces. For example,
$ scalac chapt6_ex5.scala
$ scala Reverse Hello World 
should print World Hello
*/
object Reverse extends App {
	for (x <- args.reverse) print(x + " ")
	println()
}