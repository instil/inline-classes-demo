package co.instil.inline.classes

class Main {
    companion object {
        @JvmStatic
        fun main(args : Array<String>) {
            val myBloodSugarsInMmol = BloodSugarsInMillimolesPerLitre(5.0f)
            val myBloodSugarsInMgdl = myBloodSugarsInMmol.asMgdl()
            val myBloodSugarsInMmolAgain = myBloodSugarsInMgdl.asMmol()

            assert(myBloodSugarsInMmol == BloodSugarsInMillimolesPerLitre(5.0f))
            assert(myBloodSugarsInMmol == myBloodSugarsInMmolAgain)
            assert(myBloodSugarsInMmol.mmol == 5.0f)

            assert(myBloodSugarsInMgdl == BloodSugarsInMilligramsDeciliter(90.0f))
            assert(myBloodSugarsInMgdl.mgdl == 90.0f)
        }
    }
}

