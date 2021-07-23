package com.example.coderswaag.Services

import com.example.coderswaag.Model.Category
import com.example.coderswaag.Model.Product

object DataServices {

    val Categories = listOf(
        Category("shirts", "shirtimage"),
        Category ("hats" , "hatimage"),
        Category("Hoodies" , "hoddieimage"),
        Category("digital" , "digitaligoodsmage")

    )

    val Hats = listOf(
        Product(" dope", "22$" , "hats01"),
        Product(" weed boy", "21$" , "hats02"),
        Product(" RDX", "20$" , "hats03"),
        Product(" Gun Snoorr", "24$" , "hats04")
    )

    val hoodies = listOf(
                Product("void Class" ,"29$" , "hoodie01"),
                Product(" Hilfighter" ,"22$" , "hoodie02"),
                Product("Puma" ,"25$" , "hoodie03"),
                Product("USP Asian" ,"24$" , "hoodie04")
    )

    val shirts = listOf(
        Product("white denim" , "10$" , "shirt01"),
        Product(" BLACK task" , "14$" , "shirt01"),
        Product("  yellow volco" , "12$" , "shirt01"),
        Product("  brown locnomania","13$" , "shirt01"),
        )
}