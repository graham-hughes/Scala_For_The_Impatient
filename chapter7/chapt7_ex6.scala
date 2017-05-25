import collection.JavaConversions._
import collection.mutable.{HashMap => ScalaMap}
import java.util.{HashMap => JavaMap}

object chapt7_ex3 extends App {
	def convertJavatoScalaMap(javaMap: JavaMap[String, String]): ScalaMap[String, String] = {
		val x: ScalaMap[String, String] = javaMap
		x
	}

	val x = new JavaMap[String, String]()
	x.put("firstName", "Graham")
	x.put("lastName", "Hughes")

	val y = convertJavatoScalaMap(x)
}