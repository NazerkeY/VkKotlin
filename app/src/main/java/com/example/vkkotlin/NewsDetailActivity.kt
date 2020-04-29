package com.example.vkkotlin

import android.os.Bundle
import android.os.Parcelable
import android.view.View
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class NewsDetailActivity: AppCompatActivity() {
    private var tvNewsDetail: TextView? = null
    private var tvDate: TextView? = null
    private var tvContent: TextView? = null
    private var tvFullText: TextView? = null
    private var tvPeoplelikes: TextView? = null
    private var tvLikeCount: TextView? = null
    private var tvShareCount: TextView? = null
    private var tvViewsCount: TextView? = null
    private var ivImage: ImageView? = null
    private var ivImageAuthor: ImageView? = null
    private var ivLike: ImageButton? = null
    private var ivImageLiker: ImageView? = null
    private var ivShare: ImageView? = null
    private var ivViews: ImageView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news_detail)
        tvNewsDetail = findViewById(R.id.author)
        tvDate = findViewById(R.id.date)
        tvContent = findViewById(R.id.content)
        tvFullText = findViewById(R.id.fullText)
        tvPeoplelikes = findViewById(R.id.peoplelikes)
        tvLikeCount = findViewById(R.id.likeCount)
        tvShareCount = findViewById(R.id.shareCount)
        tvViewsCount = findViewById(R.id.viewsCount)
        ivImage = findViewById(R.id.image)
        ivImageAuthor = findViewById(R.id.imageAuthor)
        ivLike = findViewById(R.id.like)
        ivImageLiker = findViewById(R.id.imageliker)
        ivShare = findViewById(R.id.share)
        ivViews = findViewById(R.id.views)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)

        val news: News = intent.getParcelableExtra<Parcelable>("news") as News

        tvNewsDetail!!.setText(news.author)
        tvDate!!.setText(news.date)
        tvContent!!.setText(news.content)
        tvFullText!!.setText(news.fullText)
        tvPeoplelikes!!.setText(news.peopleLikes)
        tvLikeCount!!.setText(news.likeCount)
        tvShareCount!!.setText(news.shareCount)
        tvViewsCount!!.setText(news.viewsCount)
        ivImage!!.setImageResource(news.image)
        ivImageAuthor!!.setImageResource(news.imageAuthor)
        ivLike!!.setOnClickListener(View.OnClickListener { Toast.makeText(applicationContext, "Liked", Toast.LENGTH_LONG).show() })
        ivImageLiker!!.setImageResource(news.imageLiker)
        ivShare!!.setImageResource(news.share)
        ivViews!!.setImageResource(news.views)
    }
}

