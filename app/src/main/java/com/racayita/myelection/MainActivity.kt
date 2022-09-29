package com.racayita.myelection

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.racayita.myelection.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding =  ActivityMainBinding.inflate(layoutInflater)
        binding.btNewsAndInfo.setOnClickListener(View.OnClickListener { v ->
            startActivity(Intent(this@MainActivity, NewsAndInformationActivity::class.java))
        })

        binding.btBiography.setOnClickListener(View.OnClickListener { v ->
            startActivity(Intent(this@MainActivity, NewsAndInformationActivity::class.java))
        })

        binding.btWorkAndVision.setOnClickListener(View.OnClickListener { v ->
            startActivity(Intent(this@MainActivity, NewsAndInformationActivity::class.java))
        })

        binding.btVideo.setOnClickListener(View.OnClickListener { v ->
            startActivity(Intent(this@MainActivity, NewsAndInformationActivity::class.java))
        })

        binding.btContactUs.setOnClickListener(View.OnClickListener { v ->
            startActivity(Intent(this@MainActivity, NewsAndInformationActivity::class.java))
        })


        setContentView(binding.root)
    }
}