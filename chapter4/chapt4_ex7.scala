import scala.collection.JavaConversions.propertiesAsScalaMap

// "Prints a table of all java properties"
object chapt4_ex7 extends App {
 	val javProps: scala.collection.mutable.Map[String,String] = System.getProperties
 	val largestKeyLength = javProps.keys.max.length
 	for ((k,v) <- javProps) println(k + " "*(largestKeyLength - k.length) + " | " + v)
}