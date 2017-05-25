/* 
Make a class Car with read-only properties for manufacturer, model name, and model year,
and a read-write property for the license plate. Supply four constructors. 
All require the manufacturer and model name. Optionally, model year and license plate
can also be specified in the constructor. If not, the model year is set to -1 and the license plate 
to the empty string.
*/
object chapt5_ex8 extends App {	
	class Car(val manufacturer: String, val modelName: String, 
		val modelYear: Int, var licensePlate: String) {

		def this(manufacturer: String, modelName: String) {this(manufacturer, modelName, -1, "")}
		def this(manufacturer: String, modelName: String, modelYear: Int) {this(manufacturer, modelName, modelYear, "")}
		def this(manufacturer: String, modelName: String, licensePlate: String) {this(manufacturer, modelName, -1, licensePlate)}
	}
	
	val car1 = new Car("Toyota", "Corrolla")
	val car2 = new Car("Toyota", "Corrolla", 1998)
	val car3 = new Car("Toyota", "Corrolla", "ABC123")
	val car4 = new Car("Toyota", "Corrolla", 1998, "ABC123")
	assert(car1.modelYear == -1 && car3.modelYear == -1, "Failed default modelYear")
	assert(car1.licensePlate == "" && car2.licensePlate == "", "Failed default licensePlate")
	assert(car1.manufacturer == car2.manufacturer && car3.manufacturer == car4.manufacturer, "Failed constructor")
}

