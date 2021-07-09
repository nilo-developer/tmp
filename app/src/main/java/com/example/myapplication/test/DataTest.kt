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
                     "https://www.google.com/imgres?imgurl=https%3A%2F%2Fsimpletexting.com%2Fwp-content%2Fuploads%2F2019%2F08%2Fprzemyslaw-marczynski-oCfkSnqZ0SI-unsplash-e1566231541197.jpg&imgrefurl=https%3A%2F%2Fsimpletexting.com%2Fwhere-have-we-come-since-the-first-smartphone%2F&tbnid=PVObDHw5aeWygM&vet=12ahUKEwjIl8H0iNPxAhVsl-AKHeiCBQYQMygDegUIARCVAQ..i&docid=ZPZk_Rg7VAxNPM&w=1500&h=1000&itg=1&q=pic%20mobile&hl=en&ved=2ahUKEwjIl8H0iNPxAhVsl-AKHeiCBQYQMygDegUIARCVAQ")
             )
         }
         return array
     }
    }
}