/*
Define an Origin object that extends java.awt.Point. 
Why is this not actually a good idea? 
(Have a close look at the methods of the Point class.)

Bad idea because Point easily constructs the origin using Point()
*/
object chapt6_ex3 extends App {
	object Origin extends java.awt.Point {
	}

	assert(Origin.getX() == 0 && Origin.getY() == 0) // Passes
	Origin.translate(1,2)
	println("Origin is now: (" + Origin.getX() + ", " + Origin.getY() +")")
	// Results in "Origin" havign coordinates at (1, 2) - an obvious problem
}