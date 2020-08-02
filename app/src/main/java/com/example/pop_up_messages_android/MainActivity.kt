package com.example.pop_up_messages_android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.widget.Button
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btnAdd = findViewById<Button>(R.id.add)

        btnAdd.setOnClickListener {
            val snackbar = Snackbar.make(findViewById(R.id.CurrentLayout),
                "Added",
                Snackbar.LENGTH_SHORT)

            snackbar.show()
        }
    }
}