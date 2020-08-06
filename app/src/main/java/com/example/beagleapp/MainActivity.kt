package com.example.beagleapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.zup.beagle.android.view.BeagleActivity
import br.com.zup.beagle.android.view.ScreenRequest
import com.example.beagleapp.beagle.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val intent = BeagleActivity.newIntent(this, ScreenRequest("https://run.mocky.io/v3/1d1fd5a5-bacb-4853-98b2-28dabeb1b1ae"))
        startActivity(intent)
        finish()
    }
}