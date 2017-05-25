import beans.BeanProperty
/* 
Make a class Student with read-write JavaBeans properties 
name (of type String) and id (of type Long)

@BeanProperty includes regular scala name annd name_=, along with
Java's getName() and setName() --> Same for id
*/
object chapt5_ex5 extends App {
	class Student(@BeanProperty var name: String, @BeanProperty var id: Long)
	val studentA = new Student("Graham", 1)
	val studentB = new Student("Hughes", 2)
	assert(studentA.name == studentA.getName() && studentB.id == studentB.getId(), 
		"Failed method generation")

	studentA.name = "Kanye"
	studentB.setName("Kanye")
	studentA.id = 42
	studentB.setId(42)

	assert(studentA.name == studentA.getName() && studentB.id == studentB.getId(), 
		"Failed method equivalency")
}