package money

import money.Currency.double2Locale
import money.Account.Factor

object App extends App {
  val t: Account = 22.50
  val a1 = Account(10, Currency.Euro)

  val a2 = Account(10, Currency.Dollar) + a1
  val a3: Account = 0.1 * a1
}
