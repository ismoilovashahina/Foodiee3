package uz.itschool.myapplication

data class Foods(var img : Int, var price : Double, var title : String, var quantity: Int)

object Foodlist {

    fun getModel() : List<Foods>{
        val food1 = Foods(
            R.drawable.burger,
            5.49,
            "Mr.Cheezy",
            5
        )
        val food2 = Foods(
            R.drawable.fries,
            3.29,
            "Fries M",
            3
        )
        val food3 = Foods(
            R.drawable.vanilla,
            6.99,
            "Vanilla Ice",
            4
        )
        val food4 = Foods(
            R.drawable.americano,
            1.99,
            "Americano L",
            10
        )

        val foodList: ArrayList<Foods> = ArrayList()
        foodList.add(food1)
        foodList.add(food2)
        foodList.add(food3)
        foodList.add(food4)

        return foodList
    }
}
