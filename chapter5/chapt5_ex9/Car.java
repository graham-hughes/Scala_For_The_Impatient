/* 
Reimplement the class of the preceding exercise in Java

**Compiles, but not tested for correctness ** 
Scala ~ 5 lines of code for the actual class, Java ~ 25 (5x as long or so)
*/
public class Car {
	String manufacturer, modelName, licensePlate;
	int modelYear;
	public Car(String manufacturer, String modelName) {
		this.manufacturer = manufacturer;
		this.modelName = modelName;
		licensePlate = "";
		modelYear = -1;
	}
	public Car(String manufacturer, String modelName, int modelYear) {
		this.manufacturer = manufacturer;
		this.modelName = modelName;
		this.modelYear = modelYear;
		licensePlate = "";
	}
	public Car(String manufacturer, String modelName, String licensePlate) {
		this.manufacturer = manufacturer;
		this.modelName = modelName;
		this.licensePlate = licensePlate;
		modelYear = -1;
	}
	public Car(String manufacturer, String modelName, int modelYear, String licensePlate) {
		this.manufacturer = manufacturer;
		this.modelName = modelName;
		this.licensePlate = licensePlate;
	}
}