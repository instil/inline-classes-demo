package co.instil.inline.classes;

public class InlineClassExampleJava {

    public static void showInterop() {
        FuelInLitres fuelInLitres = new FuelInLitres(10.0);
        double fuelInUkGallons = fuelInLitres.toUkGallons();
        co.instil.inline.classes.InlineClassExamplesKt.priceFromLitres(fuelInLitres)
    }

}
