// Returns a triple containing the counts of values less than v, equal to v, and greater than v.
object chapt4_ex9 extends App {
 	def lteqgt(values: Array[Int], v: Int): (Int, Int, Int) = {
 		(values.count(_<v), values.count(_==v), values.count(_>v))}
 	assert(lteqgt(Array(1, 2, 3, 4, 5, 6), 4) == (3, 1, 2), "lteqgt failed")
}