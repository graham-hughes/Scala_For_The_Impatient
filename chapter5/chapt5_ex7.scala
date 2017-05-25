/* 
Person with a primary constructor that accepts a string containing 
a first name, a space, and a last name, such as 
new Person("Fred Smith"). Supply read-only properties firstName and lastName
*/
object chapt5_ex7 extends App {	
	class Person(private val fullName: String) {
		private val nameArray = fullName.split(' ')
		val (firstName, lastName) = (nameArray(0), nameArray(1))
	}
	val graham = new Person("Graham Hughes")
	assert(graham.firstName == "Graham" && graham.lastName == "Hughes", "Failed Person construction")
}

