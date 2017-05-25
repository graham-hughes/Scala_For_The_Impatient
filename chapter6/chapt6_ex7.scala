/*
Implement a function that checks whether a card suit value from the preceding exercise is red.
*/
object chapt6_ex6 extends App{
	object Suits extends Enumeration {
		type Suits = Value
		val clubs = Value("♣")
		val diamonds = Value("♦")
		val hearts = Value("♥")
		val spades = Value("♠")

		def isRed(card: Suits) = {card == diamonds || card == hearts}
	}

	import Suits._
	assert(isRed(diamonds) && isRed(hearts) && !isRed(clubs) && !isRed(spades), "Function isRed failed")
}