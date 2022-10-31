package com.apps.fullandroidcourseclassd.bullscarsapp.utils

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.apps.fullandroidcourseclassd.databinding.ItemBullsCarsBinding

class BullsCarsViewPagerAdapter (var images: List<Int>) :RecyclerView.Adapter<BullsCarsViewPagerAdapter.BullsCarsViewHolder>()  {

    inner class BullsCarsViewHolder(val binding: ItemBullsCarsBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BullsCarsViewHolder {
       return BullsCarsViewHolder(ItemBullsCarsBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun onBindViewHolder(holder: BullsCarsViewHolder, position: Int) {
      val currentBullsCarsImage = images[position]
        holder.binding.ivBullsCarsItem.setImageResource(currentBullsCarsImage)
    }

    override fun getItemCount(): Int {
        return  images.size
    }
}