package com.example.videoplayercoursera

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView
import java.util.logging.Level.parse

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val videoView = findViewById<VideoView>(R.id.videoView)

//        Creating Media Contorler
        val mediaController = MediaController(this)
        mediaController.setAnchorView(videoView)

//        location of video
        val uri: Uri = Uri.parse(
            "android.resource://"+packageName+
                    "/raw/test"
        )

        videoView.setMediaController(mediaController)
        videoView.setVideoURI(uri)
        videoView.requestFocus()
        videoView.start()
    }
}