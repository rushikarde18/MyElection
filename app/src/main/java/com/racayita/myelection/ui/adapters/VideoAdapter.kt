package com.racayita.myelection.ui.adapters

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.racayita.myelection.R
import com.racayita.myelection.model.VideoItem
import java.net.MalformedURLException
import java.net.URL
import kotlin.jvm.Throws

/**
 * Created by Rushikesh Karde on 31/10/22.
 */
class VideoAdapter(val context : Context,
val itemList : ArrayList<VideoItem>): RecyclerView.Adapter<VideoAdapter.ViewHolder>() {

    // create new views
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):ViewHolder {
        // inflates the card_view_design view
        // that is used to hold list item
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.video_item, parent, false)

        return ViewHolder(view)
    }

    // binds the list items to a view
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        if(itemList.get(position).videoUrl != null) {
            var videoId = ""
            var imageUrl = ""
            try {
                videoId = extractYoutubeId(itemList.get(position).videoUrl).toString()
                imageUrl = "http://img.youtube.com/vi/$videoId/0.jpg"
                println("Thumbnail Url = $imageUrl")

            } catch (e: MalformedURLException) {
                e.printStackTrace()
            }
            holder.textView.text = videoId.toString()
            Glide.with(context)
                .load(imageUrl.toString())
                .placeholder(R.mipmap.ic_launcher)
                .into(holder.ivThumbnail)
            holder.clVideoItemMain.setOnClickListener(View.OnClickListener {
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(itemList.get(position).videoUrl))
                startActivity(context, intent, null)
            })
        }else {
            // make sure Glide doesn't load anything into this view until told otherwise
            Glide.with(context).clear(holder.ivThumbnail);
            // remove the placeholder (optional); read comments below
            holder.ivThumbnail.setImageDrawable(null);
        }
    }

    // return the number of the items in the list
    override fun getItemCount(): Int {
        return itemList.size
    }

    // Holds the views for adding it to image and text
    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val ivThumbnail: ImageView = itemView.findViewById(R.id.ivThumbnail)
        val textView: TextView = itemView.findViewById(R.id.tvTitle)
        val clVideoItemMain : ConstraintLayout = itemView.findViewById(R.id.clVideoItemMain)
    }

    @Throws(MalformedURLException::class)
    fun extractYoutubeId(url: String?): String?{
        val query: String = URL(url).getQuery()
        val param = query.split("&".toRegex()).toTypedArray()
        var id: String? = null
        for(row in param){
            val param1 = row.split("=".toRegex()).toTypedArray()
            if(param1[0] == "v"){
                id = param1[1]
            }
        }
        return id
    }
}