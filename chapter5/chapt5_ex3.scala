/* 
Time with read-only properties hours and minutes and a method 
before(other: Time): Boolean that checks whether this time comes before the other. 
A Time object should be constructed as new Time(hrs, min), where hrs is in military time format
*/
object chapt5_ex3 extends App {
	class Time(private val h: Int, private val m: Int) {
		val hours = (h + m/60)%24
		val minutes = m % 60
		def before(other: Time): Boolean = {
			if(hours < other.hours) true 
			else if(hours == other.hours) {minutes < other.minutes}
			else false
		}
	}
	val timeA = new Time(50, 61)
	assert(timeA.hours == 3 && timeA.minutes == 1, "Failed construction to military time")
	val timeB = new Time(5, 30)
	assert(timeA.before(timeB), "Failed before")
}