/* 
Time with read-only properties hours and minutes and a method 
before(other: Time): Boolean that checks whether this time comes before the other. 
A Time object should be constructed as new Time(hrs, min), where hrs is in military time format

Reimplemnted with internal representation in minutes since midnight
*/
object chapt5_ex4 extends App {
	class Time(private val h: Int, private val m: Int) {
		private val minutesSinceMidnight = (h * 60 + m) % (24 * 60)
		
		val hours = minutesSinceMidnight / 60
		val minutes = minutesSinceMidnight % 60

		def before(other: Time) = {minutesSinceMidnight < other.minutesSinceMidnight}
	}
	val timeA = new Time(50, 61)
	assert(timeA.hours == 3 && timeA.minutes == 1, "Failed construction to military time")
	val timeB = new Time(5, 30)
	assert(timeA.before(timeB), "Failed before")
}