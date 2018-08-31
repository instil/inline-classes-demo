package co.instil.typealias;

import static co.instil.typealias.TypeAliasExampleKt.priceFromLitres;
import static co.instil.typealias.TypeAliasExampleKt.toUsGallons;

public class TypeAliasExampleJava {

    public static void showInterop() {
        double fuelInLitres = 10.0;
        double fuelInUsGallons = toUsGallons(fuelInLitres);
        double price = priceFromLitres(fuelInLitres);
    }

}
