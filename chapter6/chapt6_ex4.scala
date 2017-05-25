/*
Define a Point class with a companion object 
so that you can construct Point instances as Point(3, 4), without using new.
*/
object chapt6_ex4 extends App {
	class Point (val x: Int, val y: Int){}
	object Point {
		def apply(x: Int, y: Int) = {new Point(x, y)}
	}

	val origin = Point(0,0)
	assert(origin.x == origin.y && origin.x == 0, "Failed point construction")
}