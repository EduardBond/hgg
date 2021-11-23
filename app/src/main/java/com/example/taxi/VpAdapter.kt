package com.example.taxi

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class VpAdapter(val context: Context,): RecyclerView.Adapter<VpAdapter.MyVh>() {
    class MyVh(itemView: View): RecyclerView.ViewHolder(itemView) {
        val title: TextView = itemView.findViewById(R.id.text)
        val descr: TextView = itemView.findViewById(R.id.text2)
        val image: ImageView = itemView.findViewById(R.id.image)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VpAdapter.MyVh {
       val root = LayoutInflater.from(context).inflate(R.layout.vp_adapter,parent, false)
        return MyVh(root)
    }

    override fun onBindViewHolder(holder: VpAdapter.MyVh, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

}