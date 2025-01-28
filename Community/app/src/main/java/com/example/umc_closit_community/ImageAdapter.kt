package com.example.umc_closit_community

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class ImageAdapter(
    private val context: Context,
    private val imageList: List<String> // 이미지 URL 리스트
) : RecyclerView.Adapter<ImageAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_image, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val imageUrl = imageList[position]

        // Glide를 사용하여 이미지 로드
        Glide.with(context).load(imageUrl).into(holder.imageView)

        // 날짜 텍스트 설정
        holder.dateTextView.text = "2025-01-24"
    }

    override fun getItemCount(): Int = imageList.size

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.findViewById(R.id.imageView)
        val dateTextView: TextView = itemView.findViewById(R.id.dateTextView)
    }
}


