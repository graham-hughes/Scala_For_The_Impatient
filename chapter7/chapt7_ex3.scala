/*
Write a package random with functions nextInt(): Int, 
nextDouble(): Double, and setSeed(seed: Int): Unit. 

To generate random numbers, use the linear congruential generator
next = previous × a + b mod 2n,
where a = 1664525, b = 1013904223, and n = 32.
*/
package object Random {
	private val a = 1664525
	private val b = 1013904223
	private val n = 32
	private var previous = 0

	def nextInt() = {previous = previous * a + b % (2 * n); previous}
	def nextDouble() = {nextInt.toDouble}
	def setSeed(seed: Int) = {previous = seed}
}

object chapt7_ex3 extends App {
	val x: Int = if (args.isEmpty) 10 else args(0).toInt
	for (i <- 0 to x) {
		val x = Random.nextInt
		println("Random int: " + x + " "*(12 - x.toString.length) + "  |  Random Double: " + Random.nextDouble)
	}
}
