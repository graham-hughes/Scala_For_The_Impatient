/* 
Consider the class:
	class Employee(val name: String, var salary: Double) { 
		def this() {this("John Q. Public", 0.0)}
	}
Rewrite it to use explicit fields and a default primary constructor. Which form do you prefer? Why?
(Default primary constructor is nothing)

I prefer the book's form - it is significantly more concise. 
Also, when we use explicit fields, we are forced to have an extra private var to support read only
val equivalency while still having a default value -> this is unecessarily fragile (exposes name to
further modification within the class through n) and as mentioned, verbose
*/
object chapt5_ex10 extends App {	
	class Employee { 
		private var n = "John Q. Public"
		def name() = n
		var salary = 0.0
		def this(name: String, salary: Double) {
			this()
			n = name 
			this.salary = salary
		}
	}

	val employeeHughes = new Employee("Graham", 4.2)
	assert(employeeHughes.name == "Graham" && employeeHughes.salary == 4.2)
}

