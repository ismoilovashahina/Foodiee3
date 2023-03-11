package uz.itschool.myapplication.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import uz.itschool.myapplication.Foods
import uz.itschool.myapplication.R

class Adapter (var foods: MutableList<Foods>) : RecyclerView.Adapter<Adapter.FoodHolder>(){
    class FoodHolder(item_view: View):ViewHolder(item_view){

        var img:ImageView =item_view.findViewById(R.id.img)
        var title:TextView = item_view.findViewById(R.id.title)
        var price:TextView = item_view.findViewById(R.id.price)
        var quantity:TextView = item_view.findViewById(R.id.quantity)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodHolder {

        var holder = FoodHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_view, parent, false))
        return holder

    }

    override fun onBindViewHolder(holder: FoodHolder, position: Int) {

        var foodViewModel = foods[position]

        holder.img.setImageResource(foodViewModel.img)
        holder.price.text = foodViewModel.price
        holder.title.text = foodViewModel.title
        holder.quantity.text = foodViewModel.quantity.toString()
    }

    override fun getItemCount(): Int {
           return foods.size
    }
}