package dev.waiguru.twitterviews

data class Tweets(
    var displayName:String,
    var handle: String,
    var time:String,
    var tweet:String,
    var repliesCount:String,
    var retweetCount:String,
    var likesCount:String,
    var imageRetweet:String,
    var imageLikes:String,
    var imageReplies:String,
    var imageShare:String
)