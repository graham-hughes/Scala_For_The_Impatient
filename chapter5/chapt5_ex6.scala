/* 
Person with primary constructor that turns negative ages to 0
*/
object chapt5_ex6 extends App {	
	class Person(var age: Int) {
		if (age < 0) age = 0
	}
	val graham = new Person(19)
	assert(graham.age == 19, "Failed regular construction")
	val fetus = new Person(-1)
	assert(fetus.age == 0, "Failed negative age -> 0 constructor requirement")
}

