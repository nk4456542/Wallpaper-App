 package com.example.wallpaperactivity

import android.app.WallpaperManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import java.util.*

 class MainActivity : AppCompatActivity() {
     var cnt=0;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun changeWallpaper(v: View?){
        cnt++
        if(cnt == 5){
            return;
        }
        var r = Random()
        var i = r.nextInt(5)
        var imageArray = arrayOf(R.drawable.wallpaper1, R.drawable.wallpaper2, R.drawable.wallpaper3, R.drawable.wallpaper4, R.drawable.wallpaper5)
        var w = WallpaperManager.getInstance(this)
        w.setResource(imageArray[i]);
        Thread.sleep(1000)
        changeWallpaper(v)
    }
}