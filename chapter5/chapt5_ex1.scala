// Improved counter doesn’t turn negative at Int.MaxValue.
object chapt5_ex1 extends App {
	class Counter {
		private var value: BigInt = 0 // You must initialize the field
		def increment() { value += 1 } // Methods are public by default 
		def current() = value 
	}

	val x = new Counter
 	for (_ <- 0 to Int.MaxValue) x.increment
 	assert(x.current > 0, "Turned negative at max value") 
}