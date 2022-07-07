package dev.waiguru.twitterviews

import android.content.ClipData
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TweetsRVAdapter(var tweetList:List<Tweets>):
RecyclerView.Adapter<TweetsViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TweetsViewHolder {
        var itemView= LayoutInflater.from(parent.context).inflate(R.layout.tweets_layout_views,parent,false)
        return TweetsViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: TweetsViewHolder, position: Int) {
        var currentTweet=tweetList.get(position)
        holder.tvDisplayName.text=currentTweet.displayName
        holder.tvHandle.text=currentTweet.handle
        holder.tvTime.text=currentTweet.time
        holder.tvTweet.text=currentTweet.tweet
        holder.tvReplies.text=currentTweet.repliesCount
        holder.tvLikes.text=currentTweet.likesCount
        holder.tvRetweets.text=currentTweet.retweetCount
    }

    override fun getItemCount(): Int {
        return tweetList.size
    }
}

class TweetsViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
    var tvDisplayName= itemView.findViewById<TextView>(R.id.tvDisplayName)
    var tvHandle=itemView.findViewById<TextView>(R.id.tvHandle)
    var tvTime=itemView.findViewById<TextView>(R.id.tvTime)
    var tvTweet=itemView.findViewById<TextView>(R.id.tvTweet)
    var tvReplies=itemView.findViewById<TextView>(R.id.tvReplies)
    var tvRetweets=itemView.findViewById<TextView>(R.id.tvRetweets)
    var tvLikes=itemView.findViewById<TextView>(R.id.tvLikes)
    var imgAvatar=itemView.findViewById<ImageView>(R.id.imgAvatar)
    var imgReplies=itemView.findViewById<ImageView>(R.id.imgReplies)
    var imgRetweet=itemView.findViewById<ImageView>(R.id.imgRetweet)
    var imgLikes=itemView.findViewById<ImageView>(R.id.imgLikes)
    var imgShare=itemView.findViewById<ImageView>(R.id.imgShare)
}