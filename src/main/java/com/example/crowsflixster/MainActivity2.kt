package com.example.crowsflixster

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var backtomain1=findViewById<Button>(R.id.tomain1)
        backtomain1.setOnClickListener {
            val switchbacktomain1=Intent(this,MainActivity::class.java)
            startActivity((switchbacktomain1))
        }

        var backtomain3=findViewById<Button>(R.id.tomain3)
        backtomain3.setOnClickListener {
            val switchbacktomain3=Intent(this,MainActivity3::class.java)
            startActivity(switchbacktomain3)

        }

    }
}