package com.yankee.doodledandy.presentation.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.yankee.doodledandy.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction().replace(R.id.activity_fragment_container, StartQieezFragment.newInstance(), STARTQIEEZFRAGMENT)
            .commit()
    }
}