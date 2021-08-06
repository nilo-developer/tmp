package com.example.myapplication.test

import com.example.myapplication.dataClass.DataProduct

class DataTest {

    companion object{
     fun getDataProduct(): List<DataProduct> {
         val array = arrayListOf<DataProduct>()

         for (item in 1..10){
             array.add(
                 DataProduct(
                     item,
                     "گوشی موبایل",
                     "150.000",
                     true,
                     "120.000",
                     "https://s167.convertio.me/p/FY-RnqrnQyRycx_UqZeq1g/6915399ba6034a1d500f74272dec17c0/imgres.png")
             )
         }
         return array
     }
        fun getCategories() = listOf<String>(
            "لوازم خانگی",
            "لوازم ورزشی",
            "لوازم آرایشی",
            "لوازم سفر",
            "لوازم آشپزی",
            "لوازم دیجیتال",
            "لوازم جانبی"
        )
    }
}