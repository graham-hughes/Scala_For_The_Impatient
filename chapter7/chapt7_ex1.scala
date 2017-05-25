/* 
Write an example program to demonstrate that
package com.horstmann.impatient
is not the same as
package com 
	package horstmann 
		package impatient

Compiles fine as is, but errors when specified lines are uncommented
*/
object chapt7_ex1 extends App{
	com.horstmann.impatient.example1

	// This errors if uncommented along with line 28,
	// unlike example1, which sees funObject in its parents scope
	// Uncomment Below:
	// com.horstmann.impatient.example2
}

package com {
	package horstmann {
		object funObject {
			def fun() = {println("This is fun!")}
		}
		package impatient {
			object example1 {funObject.fun()}
		}
	}
}

package com.horstmann.impatient {
	// Uncomment Below:
	// object example2 {funObject.fun()} 
}
