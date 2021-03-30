package money

import money.Currency.Currency

class Account(val amount: Double, val currency: Currency) {
  def +(that: Account) =
    new Account(this.amount + that.amount * Currency.exchangeRate(that.currency)(this.currency), this.currency)

  def toSymbol: String = {
    this.currency match {
      case Currency.Euro => "€"
      case Currency.Dollar => "$"
      case Currency.Euro => "YEN"
    }
  }

  override def toString: String = {
    this.amount + " " + this.toSymbol
  }
}

object Account {
  lazy val local: Currency = Currency.Euro

  def apply(amount: Double, currency: Currency): Account = new Account(amount, currency)
}