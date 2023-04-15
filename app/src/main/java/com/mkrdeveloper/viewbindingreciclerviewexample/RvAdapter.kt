package com.mkrdeveloper.viewbindingreciclerviewexample

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.mkrdeveloper.viewbindingreciclerviewexample.databinding.RvItemRowBinding

class RvAdapter : RecyclerView.Adapter<RvAdapter.ViewHolder>() {

    inner class ViewHolder(val binding: RvItemRowBinding) : RecyclerView.ViewHolder(binding.root) {

       // val textView: TextView = itemView.findViewById(R.id.textView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        return ViewHolder(RvItemRowBinding.inflate(LayoutInflater.from(parent.context),parent,false))


       /* val itemView = LayoutInflater.from(parent.context).inflate(R.layout.rv_item_row, parent, false)
        return ViewHolder(itemView)*/
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.textView.text = "mkr developer"
    }
}