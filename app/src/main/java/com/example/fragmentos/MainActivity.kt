package com.example.fragmentos

import android.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    var primeiro = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentManager = supportFragmentManager
            fragmentManager.beginTransaction()
                .add(R.id.frameManager, Fragmento1())
                .commit()

    }

    fun trocar(v: View) {
        primeiro = !primeiro
        var fragment: android.support.v4.app.Fragment
        if (primeiro) {
            fragment = Fragmento1()
        }
        else {
            fragment = Fragmento2()
        }
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.frameManager, fragment)
            .commit()



    }
}
