package com.example.taxi

data class guide (val title: String, val descr: String, val image: Int)

object List {
    val list = arrayListOf(
        guide(
            "Быстрая подача",
            "TaxiMarcel - это приложение в котором  выможете заказать такси, очень быстро и удобно. \n" +
                    "Сейчас расскажем как оно работает",
            R.drawable.driver
        ),
        guide("Быстрая подача",
            "TaxiMarcel - это приложение в котором  выможете заказать такси, очень быстро и удобно. \n" +
                    "Сейчас расскажем как оно работает", R.drawable.image2),
        guide(
            "Быстрая подача",
            "TaxiMarcel",
            R.drawable.driver)

    )
}
