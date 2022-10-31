package com.racayita.myelection.ui

import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.racayita.myelection.databinding.VideoActivityBinding
import com.racayita.myelection.model.VideoItem
import com.racayita.myelection.ui.adapters.VideoAdapter

/**
 * Created by Rushikesh Karde on 31/10/22.
 */
class VideosActivity : AppCompatActivity() {

    var videoListItem : ArrayList<VideoItem> = ArrayList<VideoItem>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = VideoActivityBinding.inflate(layoutInflater)

        for(i in 1..2){
           videoListItem.add(VideoItem( "Video No.$i","https://www.youtube.com/watch?v=NwjOZ8FzYFA", ""))
           videoListItem.add(VideoItem( "Video No.$i","https://www.youtube.com/watch?v=waHxJeQtj_U", ""))
           videoListItem.add(VideoItem( "Video No.$i","https://www.youtube.com/watch?v=m4p6_Fazlro", ""))
           videoListItem.add(VideoItem( "Video No.$i","https://www.youtube.com/watch?v=Q1HUg-yMdjY", ""))
        }

        val videoAdapter = VideoAdapter(this, videoListItem)
        binding.rvVideo.layoutManager = LinearLayoutManager(this)
        binding.rvVideo.adapter = videoAdapter
        //binding.rvVideo.adapter?.notifyDataSetChanged()
        setContentView(binding.root)

    }
}