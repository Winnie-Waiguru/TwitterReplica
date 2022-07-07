package dev.waiguru.twitterviews

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import dev.waiguru.twitterviews.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displayTweets()
    }
    fun displayTweets(){
        var tweets1= Tweets("Linda Kengaju","@LindaKenaga",".13h",
            "Life is easier when you know what you want—but\n"+ " most people don't take the time to figure out what they want.","50",
            "138","90","","","","")
        var tweets2= Tweets("Christine Oure","@christineO",".1h",
            "Double down on your best relationship. It's the\n "+ " investment with the highest return.","61",
            "18","190","","","","")
        var tweets3=Tweets("Lauren Minage","@lauryneMinage",".10m",
            "People who jump from project to project are always\n "+ " dividing their effort, and producing high quality work becomes difficult\n "+ " without intense effort.","20",
            "152","50","","","","")
        var tweets4= Tweets("Jane Mary","@janeMary",".5h",
            "Often the difference between a successful person and a\n "+" failure is not one's better abilities or ideas, but\n "+ "the courage that one has to bet on one's ideas,\n "+ "to take a calculated risk—and to act."
            ,"25",
            "110","115","","","","")
        var tweets5= Tweets("Winfred Waiguru","@winfredWaiguru",".22h",
            "For me, success is not a public thing. It's a\n "+ "private thing. It's when you have fewer and\n "+ "fewer regrets.","88",
            "141","115","","","","")
        var tweets= listOf(tweets1,tweets2,tweets3,tweets4,tweets5)
        var tweetsAdapter=TweetsRVAdapter(tweets)
        binding.rvTweets.layoutManager=LinearLayoutManager(this)
            binding.rvTweets.adapter= tweetsAdapter

    }

}