package money

object Currency extends Enumeration {
  type Currency = Value
  val Euro: Currency = Value("EUR")
  val Dollar: Currency = Value("USD")
  val Yen: Currency = Value("JPY")

  val exchangeRate = Map(
    Dollar -> Map(Euro -> 0.863187, Dollar -> 1.0, Yen -> 113.648),
    Euro -> Map(Euro -> 1.0, Dollar -> 1.15850, Yen -> 131.676),
    Yen -> Map(Euro -> 0.00759441, Dollar -> 0.00879910, Yen -> 1.0)
  )
}
