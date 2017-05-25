// BankAccount with methods deposit and withdraw, and a read-only property balance
object chapt5_ex2 extends App {
	class BankAccount {
		private var total = 0
		def deposit(amount: Int) {total += amount}
		def withdraw(amount: Int) {total -= amount}
		def balance() = total
	}
	val newAccount = new BankAccount
 	assert(newAccount.balance == 0, "Initializes incorrectly") 
 	newAccount.deposit(500)
 	newAccount.withdraw(250)
 	assert(newAccount.balance == 250, "Withdrawal or deposit failed") 
}