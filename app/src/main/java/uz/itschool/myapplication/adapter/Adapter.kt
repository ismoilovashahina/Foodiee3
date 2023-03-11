package uz.itschool.myapplication.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import uz.itschool.myapplication.Foods
import uz.itschool.myapplication.R
import uz.itschool.myapplication.databinding.ActivityMainBinding
import uz.itschool.myapplication.databinding.ItemViewBinding

class Adapter (private val context : Context, var foods: MutableList<Foods>) : RecyclerView.Adapter<Adapter.FoodHolder>(){
    var s:Int = 0
    var ov_price:Int = 0
    class FoodHolder(itemViewBinding: ItemViewBinding):ViewHolder(itemViewBinding.root){

        private val binding = itemViewBinding
        fun bind(food : Foods){
            binding.title.text = food.title
            binding.price.text = food.price.toString()
            binding.quantity.text = food.quantity.toString()
            binding.img.setImageResource(food.img)
        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodHolder {
        val binding = ItemViewBinding.inflate(LayoutInflater.from(context),parent,false)
       val binding2 = ActivityMainBinding.inflate(LayoutInflater.from(context), parent, false)
        binding.plus.setOnClickListener {
            s = binding.quantity.text.toString().toInt()
            s++
            binding.quantity.text = s.toString()
        }
        binding.minus.setOnClickListener {
            s = binding.quantity.text.toString().toInt()
            if (s>0) {
                s--
                binding.quantity.text=s.toString()
            }
        }

        ov_price = binding.quantity.text.toString().toInt()*binding.price.toString().toInt()
        binding2.overallPrice.text = ov_price.toString()
        return FoodHolder(binding)

    }

    override fun onBindViewHolder(holder: FoodHolder, position: Int) {
        var foodViewModel = foods[position]
        holder.bind(foodViewModel)

    }

    override fun getItemCount(): Int {
           return foods.size
    }
}