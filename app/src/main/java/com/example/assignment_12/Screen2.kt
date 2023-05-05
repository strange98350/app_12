package com.example.assignment_12

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Screen2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen2)

        val andtext = findViewById<TextView>(R.id.textAndroid)
        val machinetext = findViewById<TextView>(R.id.textMachine)
        val blockchaintext = findViewById<TextView>(R.id.textBlock_Chain)
        val webtext = findViewById<TextView>(R.id.text2)
        val iostext = findViewById<TextView>(R.id.text3)
        val cloudtext = findViewById<TextView>(R.id.text4)
        val btncall = findViewById<Button>(R.id.button3)


        btncall.setOnClickListener {
            val phoneNumber = "+917586037013"
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:$phoneNumber")
            startActivity(intent)

        }
        andtext.setOnClickListener {
            intent = Intent(applicationContext, AndroidActivity::class.java)
            startActivity(intent)
        }
        machinetext.setOnClickListener {
            intent=Intent(applicationContext, machineActivity::class.java)
            startActivity(intent)
        }
        blockchaintext.setOnClickListener {
            intent=Intent(applicationContext, blockchainactivity::class.java)
            startActivity(intent)
        }
        webtext.setOnClickListener {
            intent=Intent(applicationContext, WebActivity::class.java)
            startActivity(intent)
        }

        iostext.setOnClickListener {
            intent=Intent(applicationContext, iosActivity::class.java)
            startActivity(intent)
        }
        cloudtext.setOnClickListener {
            intent=Intent(applicationContext, cloudActivity::class.java)
            startActivity(intent)
        }
    }
}
