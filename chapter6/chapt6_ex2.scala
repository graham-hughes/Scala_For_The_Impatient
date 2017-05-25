/*
The preceding problem wasn’t very object-oriented.
Provide a general superclass UnitConversion and define objects 
InchesToCentimeter, GallonsToLiter, and MilesToKilometer that extend it.
*/
object chapt6_ex2 extends App {

	abstract class UnitConversion {
		def convert(input: Double): Double
	}

	object InchesToCentimeter extends UnitConversion {
		override def convert(input: Double) = {input * 2.54}
	}
	object GallonsToLiter extends UnitConversion {
		override def convert(input: Double) = {input * 2.378541}
	}
	object MilesToKilometer extends UnitConversion {
		override def convert(input: Double) = {input * 1.60934}
	}
	assert(InchesToCentimeter.convert(2.0) == 5.08)
}