package com.example.shortcut

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    companion object {
        private const val KEY_ADD_FAVORITE = "android.intent.action.ADD_FAVORITE"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val text = findViewById<TextView>(R.id.main_text)

        if(intent.action == KEY_ADD_FAVORITE){
            text.text = "Conteúdo personalizado"
        }

    }
}
















