package com.example.labactivity31.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.labactivity31.databinding.ItemNewsCardBinding
import com.example.labactivity31.repository.NewsItem

class NewsAdapter(
    private val newsList: List<NewsItem>
) : RecyclerView.Adapter<NewsAdapter.NewsViewHolder>() {

    class NewsViewHolder(val binding: ItemNewsCardBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {
        val binding = ItemNewsCardBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return NewsViewHolder(binding)
    }

    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {
        val news = newsList[position]
        with(holder.binding) {
            chipNewsCategory.text = news.category
            txtNewsTime.text = news.timeAgo
            txtNewsTitle.text = news.title
            txtNewsContent.text = news.content
        }
    }

    override fun getItemCount(): Int = newsList.size
}
