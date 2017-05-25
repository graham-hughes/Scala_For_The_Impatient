import scala.collection.JavaConversions.propertiesAsScalaMap

// Returns a pair containing the smallest and largest values in the array.
object chapt4_ex8 extends App {
 	def minmax(values: Array[Int]) = (values.min, values.max)
 	assert(minmax(Array(-10, 0, 10)) == (-10, 10), "minmax failed")
}