package com.racayita.myelection

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.racayita.myelection.databinding.ActivityNewsAndInformationBinding

/**
 * Created by Rushikesh Karde on 30/09/22.
 */
class NewsAndInformationActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityNewsAndInformationBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}