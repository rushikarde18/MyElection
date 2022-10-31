package com.racayita.myelection

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.racayita.myelection.databinding.ActivityMainBinding
import com.racayita.myelection.ui.VideosActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding =  ActivityMainBinding.inflate(layoutInflater)
        binding.btNewsAndInfo.setOnClickListener(View.OnClickListener { v ->
//            startActivity(Intent(this@MainActivity, NewsAndInformationActivity::class.java))
            val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("http://www.eci.gov.in"))
            startActivity(browserIntent)
        })

        binding.btBiography.setOnClickListener(View.OnClickListener { v ->
            startActivity(Intent(this@MainActivity, NewsAndInformationActivity::class.java))
        })

        binding.btWorkAndVision.setOnClickListener(View.OnClickListener { v ->
            startActivity(Intent(this@MainActivity, NewsAndInformationActivity::class.java))

        })

        binding.btVideo.setOnClickListener(View.OnClickListener { v ->
            startActivity(Intent(this@MainActivity, VideosActivity::class.java))
        })

        binding.btContactUs.setOnClickListener(View.OnClickListener { v ->
            startActivity(Intent(this@MainActivity, NewsAndInformationActivity::class.java))
        })


        setContentView(binding.root)
    }
}