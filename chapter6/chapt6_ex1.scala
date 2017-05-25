/* 
Write an object Conversions with methods 
inchesToCentimeter, gallonsToLiter, and milesToKilometer

Note: These are approximations
*/
object chapt6_ex1 extends App {
	object Conversions {
		def inchesToCentimeter(inches: Double) = {inches * 2.54}
		def gallonsToLiter(gallons: Double) = {gallons * 2.378541}
		def milesToKilometer(miles: Double) = {miles * 1.60934}
	}
	assert(Conversions.inchesToCentimeter(2.0) == 5.08)
}