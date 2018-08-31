package co.instil.inline.classes

inline class FuelInLitres(val amount: Double) {
    fun toUkGallons() = FuelInUkGallons(this.amount / 4.54609)
    fun toUsGallons() = FuelInUsGallons(this.amount / 3.785411784)
}

inline class FuelInUsGallons(val amount: Double) {
    fun toLitres() = FuelInLitres(this.amount * 4.54609)
}

inline class FuelInUkGallons(val amount: Double) {
    fun toLitres() = FuelInLitres(this.amount * 3.785411784)
}

fun priceFromLitres(litres: FuelInLitres) = litres.amount * 1.2

val litrePrice = priceFromLitres(FuelInLitres(10.0))
//val gallonPrice = priceFromLitres(FuelInUsGallons(10.0)) // Compiler error as types are not the same