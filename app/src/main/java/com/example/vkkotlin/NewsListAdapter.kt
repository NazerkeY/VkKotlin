package com.example.vkkotlin

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.vkkotlin.NewsListAdapter.NewsViewHolder

class NewsListAdapter(private val newsList: List<News>, private val listener: ItemClickListener?, var context: Context?) : RecyclerView.Adapter<NewsListAdapter.NewsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_news, null, false)

        return NewsViewHolder(view)
    }

    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {
        val news = newsList[position]
        holder.author.text = news.author
        holder.date.text = news.date
        holder.shareCount.text = news.shareCount
        holder.viewsCount.text = news.viewsCount.toString()
        holder.peoplelikes.text = news.peopleLikes
        holder.likeCount.text = news.likeCount.toString()
        holder.commentsCount.text = news.commentsCount
        holder.comments.setImageResource(news.comments)
        holder.share.setImageResource(news.share)
        holder.views.setImageResource(news.views)
        holder.imageLiker.setImageResource(news.imageLiker)
        holder.content.text = news.content
        holder.fullText.text = news.fullText
        holder.image.setImageResource(news.image)
        holder.imageAuthor.setImageResource(news.imageAuthor)
        holder.like.setOnClickListener { Toast.makeText(context, "Liked", Toast.LENGTH_LONG).show() }
        holder.itemView.setOnClickListener { listener?.itemClick(position, news) }
    }

    override fun getItemCount(): Int {
        return newsList.size
    }

    inner class NewsViewHolder(itemView: View) : ViewHolder(itemView) {
        var author: TextView
        var date: TextView
        var content: TextView
        var fullText: TextView
        var peoplelikes: TextView
        var likeCount: TextView
        var commentsCount: TextView
        var shareCount: TextView
        var viewsCount: TextView
        var image: ImageView
        var imageAuthor: ImageView
        var like: ImageView
        var comments: ImageView
        var share: ImageView
        var views: ImageView
        var imageLiker: ImageView

        init {
            author = itemView.findViewById(R.id.author)
            date = itemView.findViewById(R.id.date)
            content = itemView.findViewById(R.id.content)
            fullText = itemView.findViewById(R.id.fullText)
            peoplelikes = itemView.findViewById(R.id.peoplelikes)
            likeCount = itemView.findViewById(R.id.likeCount)
            commentsCount = itemView.findViewById(R.id.commentsCount)
            shareCount = itemView.findViewById(R.id.shareCount)
            viewsCount = itemView.findViewById(R.id.viewsCount)
            image = itemView.findViewById(R.id.image)
            imageAuthor = itemView.findViewById(R.id.imageAuthor)
            like = itemView.findViewById(R.id.like)
            comments = itemView.findViewById(R.id.comments)
            share = itemView.findViewById(R.id.share)
            views = itemView.findViewById(R.id.views)
            imageLiker = itemView.findViewById(R.id.imageliker)
        }
    }

    interface ItemClickListener {
        fun itemClick(position: Int, item: News?)
    }

}