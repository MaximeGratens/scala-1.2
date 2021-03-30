package money

object App extends App {
  implicit def double2Locale(amount: Double): Account = {
    Account(amount, Account.local)
  }

  implicit class Factor(factor: Double) {
    def *(a: Account): Account = Account(factor * a.amount, a.currency)
  }

  val t: Account = 22.50
  val a1 = Account(10, Currency.Euro)

  val a2 = Account(10, Currency.Dollar) + a1
  val a3: Account = 0.1 * a1
}
