package com.example.myapplication

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.SuperAdapter
import org.w3c.dom.Text

class SuperAdapter (var data : ArrayList<Superhero>, var context: Activity?) : RecyclerView.Adapter<SuperAdapter.MyViewHolder>(){

    class MyViewHolder (view: View) : RecyclerView.ViewHolder(view) {
        val imgSuperhero = view.findViewById<ImageView>(R.id.img_item_photo)
        val nameSuperhero = view.findViewById<TextView>(R.id.tv_item_name)
        val descSuperhero = view.findViewById<TextView>(R.id.tv_item_description)

        fun bindView(superhero: Superhero, listener: (Superhero) -> Unit){
            imgSuperhero.setImageResource(superhero.imgSuperhero)
            nameSuperhero.text = superhero.nameSuperhero
            descSuperhero.text = superhero.descSuperhero
            itemView.setOnClickListener{
                listener(superhero)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view : View = LayoutInflater.from(parent.context).inflate(R.layout.item_superhero, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.imgSuperhero.setImageResource(data[position].imgSuperhero)
        holder.nameSuperhero.text = data[position].nameSuperhero
        holder.descSuperhero.text = data[position].descSuperhero
    }

    override fun getItemCount(): Int {
        return data.size
    }


}