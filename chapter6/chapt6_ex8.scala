/*
Write an enumeration describing the eight corners of the RGB color cube. 
As IDs, used the ANSI color codes (ordered for reduced verbosity)
*/
object chapt6_ex6 extends App{
	object ColorCubeCorners extends Enumeration {
		type ColorCubeCorners = Value
	    val black = Value(30)
	    val red, green, red_green, blue, red_blue, green_blue, white = Value
	}
	import ColorCubeCorners._
	for (corner <- values) println(27.toChar + "[" + corner.id + "m" + corner) // Prints names in respective colors
	println(27.toChar + "[30m") // Resets to black
}