package uz.itschool.myapplication

import java.io.Serializable

data class Foods(var img : Int, var price : Double, var title : String, var quantity: Int) : java.io.Serializable

object Foodlist {

    fun getModel() : List<Foods>{
        val food1 = Foods(
            R.drawable.burger,
            5.49,
            "Mr.Cheezy",
            0
        )
        val food2 = Foods(
            R.drawable.fries,
            3.29,
            "Fries M",
            0
        )
        val food3 = Foods(
            R.drawable.vanilla,
            6.99,
            "Vanilla Ice",
            0
        )
        val food4 = Foods(
            R.drawable.americano,
            1.99,
            "Americano L",
            0
        )

        val food5 = Foods(
            R.drawable.hot_dog,
            5.12,
            "Hot Dog",
            0
        )
        val food6 = Foods(
            R.drawable.drink,
            0.6,
            "Drink",
            0
        )
        val food7 = Foods(
            R.drawable.cheese,
            2.3,
            "Cheese",
            0
        )
        val food8 = Foods(
            R.drawable.bacoon,
            4.2,
            "Bacoon",
            0
        )
        val food9 = Foods(
            R.drawable.onion,
            0.2,
            "Onion",
            0
        )

        val foodList: ArrayList<Foods> = ArrayList()
        foodList.add(food1)
        foodList.add(food2)
        foodList.add(food3)
        foodList.add(food4)
        foodList.add(food5)
        foodList.add(food6)
        foodList.add(food7)
        foodList.add(food8)
        foodList.add(food9)

        return foodList
    }
}
