package com.myapp.testapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn:Button=findViewById(R.id.button)
        val txt:TextView=findViewById(R.id.tv)
        var timesclicked=0

        btn.setOnClickListener {
            timesclicked+=1
            txt.text=timesclicked.toString()
            Toast.makeText(this,"you clicked me $timesclicked time",Toast.LENGTH_SHORT).show()
        }
    }
}