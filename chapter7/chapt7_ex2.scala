/* 
Write a puzzler that baffles your Scala friends, using a package com that isn’t at the top level
*/
object chapt7_ex2 extends App{
	assert(com.com.com.com == "This is fun!")
}

package com {
	package com {
		object com {
			def com() = {"This is fun!"}
		}
	}
}