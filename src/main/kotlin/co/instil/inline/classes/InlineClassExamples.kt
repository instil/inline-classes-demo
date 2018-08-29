package co.instil.inline.classes

inline class BloodSugarsInMillimolesPerLitre(val mmol: Float) {
    fun asMgdl() = BloodSugarsInMilligramsDeciliter(mmol * 18.0f)
}

inline class BloodSugarsInMilligramsDeciliter(val mgdl: Float) {
    fun asMmol() = BloodSugarsInMillimolesPerLitre(mgdl / 18.0f)
}