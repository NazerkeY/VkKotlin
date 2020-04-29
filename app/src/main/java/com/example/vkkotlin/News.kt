package com.example.vkkotlin

import android.os.Parcel
import android.os.Parcelable

class News : Parcelable{
    var author:String? = null
    var date: String? = null
    var content: String? = null
    var fullText: String? = null
    var peopleLikes: String? = null

    var likeCount:String? = null
    var commentsCount: String? = null
    var shareCount: String? = null
    var viewsCount: String? = null
    var image: Int = 0
    var imageAuthor: Int = 0
    var like: Int = 0
    var comments: Int = 0
    var share: Int = 0
    var views: Int = 0
    var imageLiker: Int = 0

    constructor(author: String?,
                date: String?,
                content: String?,
                fullText: String?,
                peoplelikes: String?,
                likeCount: String?,
                commentsCount: String?,
                shareCount: String?,
                viewsCount: String?,
                image: Int,
                imageAuthor: Int,
                like: Int,
                comments: Int,
                share: Int,
                views: Int,
                imageLiker: Int) {
        this.author = author
        this.date = date
        this.content = content
        this.fullText = fullText
        peopleLikes = peoplelikes
        this.likeCount = likeCount
        this.commentsCount = commentsCount
        this.shareCount = shareCount
        this.viewsCount = viewsCount
        this.image = image
        this.imageAuthor = imageAuthor
        this.like = like
        this.comments = comments
        this.share = share
        this.views = views
        this.imageLiker = imageLiker
    }

    fun setPeoplelikes() {
        peopleLikes = peopleLikes
    }

    override fun writeToParcel(dest: Parcel, flags: Int) {
        dest.writeString(author)
        dest.writeString(date)
        dest.writeString(content)
        dest.writeString(fullText)
        dest.writeString(peopleLikes)
        dest.writeString(likeCount)
        dest.writeString(viewsCount)
        dest.writeString(shareCount)
        dest.writeString(commentsCount)
        dest.writeInt(image)
        dest.writeInt(imageAuthor)
        dest.writeInt(like)
        dest.writeInt(comments)
        dest.writeInt(share)
        dest.writeInt(views)
        dest.writeInt(imageLiker)
    }

    protected constructor(`in`: Parcel) {
        author = `in`.readString()
        date = `in`.readString()
        content = `in`.readString()
        fullText = `in`.readString()
        peopleLikes = `in`.readString()
        likeCount = `in`.readString()
        viewsCount = `in`.readString()
        shareCount = `in`.readString()
        commentsCount = `in`.readString()
        image = `in`.readInt()
        imageAuthor = `in`.readInt()
        like = `in`.readInt()
        comments = `in`.readInt()
        share = `in`.readInt()
        views = `in`.readInt()
        imageLiker = `in`.readInt()
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object {
        @JvmField
        val CREATOR: Parcelable.Creator<News?> = object : Parcelable.Creator<News?> {
            override fun createFromParcel(source: Parcel): News? {
                return News(source)
            }

            override fun newArray(size: Int): Array<News?> {
                return arrayOfNulls(size)
            }
        }
    }
}