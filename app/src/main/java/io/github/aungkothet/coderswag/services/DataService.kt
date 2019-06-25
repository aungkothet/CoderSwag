package io.github.aungkothet.coderswag.services

import io.github.aungkothet.coderswag.model.Category
import io.github.aungkothet.coderswag.model.Product

object DataService {

    val categories = listOf(
        Category("SHIRTS","shirtimage"),
        Category("HOODIES","hoodieimage"),
        Category("HATS","hatimage"),
        Category("DIGITALS","digitalgoodsimage"),
        Category("SHIRTS","shirtimage"),
        Category("HOODIES","hoodieimage"),
        Category("HATS","hatimage"),
        Category("DIGITALS","digitalgoodsimage"),
        Category("SHIRTS","shirtimage"),
        Category("HOODIES","hoodieimage"),
        Category("HATS","hatimage"),
        Category("DIGITALS","digitalgoodsimage")
    )

    val hats = listOf(
        Product("Deveslopes Graphic Beanie","$18","hat1"),
        Product("Deveslopes Hat Black","$28","hat2"),
        Product("Deveslopes Hat White","$30","hat3"),
        Product("Deveslopes Hat Snapback","$150","hat4")
    )

    val hoodies = listOf(
        Product("Deveslopes Hoodies Gray","$18","hoodie1"),
        Product("Deveslopes Hoodies Black","$30","hoodie2"),
        Product("Deveslopes Sexy Hoodies","$28","hoodie3"),
        Product("Deveslopes Graphic Hoodies","$48","hoodie4")

        )

    val shirts = listOf(
        Product("Deveslopes Shirts White","$35","shirt1"),
        Product("Deveslopes Shirts Black","$20","shirt2"),
        Product("Deveslopes Sexy Shirts","$10","shirt3"),
        Product("Deveslopes Couple Shirts","$60","shirt4")

    )
}