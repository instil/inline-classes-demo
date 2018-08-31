package co.instil.`typealias`

typealias FuelInLitres = Double
typealias FuelInUsGallons = Double
typealias FuelInUkGallons = Double

fun FuelInLitres.toUkGallons(): FuelInUkGallons = this / 4.54609
fun FuelInLitres.toUsGallons(): FuelInUsGallons = this / 3.785411784
//fun FuelInUkGallons.toLitres(): FuelInLitres = this * 4.54609 // Fails as `Float.toLitres` is already defined
//fun FuelInUsGallons.toLitres(): FuelInLitres = this * 3.785411784  // Fails as `Float.toLitres` is already defined

fun priceFromLitres(litres: FuelInLitres) = litres * 1.2

val fuelInLitres: FuelInLitres = 10.0
val priceInLitres = priceFromLitres(fuelInLitres)

val fuelInUsGallons: FuelInUsGallons = 10.0
val priceInUsGallons = priceFromLitres(fuelInUsGallons) // Compiles without any errors