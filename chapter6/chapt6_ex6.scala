/*
Write an enumeration describing the four playing card suits 
so that the toString method returns ♣, ♦, ♥, or ♠
*/
object chapt6_ex6 extends App{
	object Suits extends Enumeration {
		val clubs = Value("♣")
		val diamonds = Value("♦")
		val hearts = Value("♥")
		val spades = Value("♠")
	}
	assert (Suits.clubs.toString == "♣")
}