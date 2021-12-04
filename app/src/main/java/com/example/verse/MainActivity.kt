package com.example.verse

import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "Ты прав — несносен Фирс ученый,")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "Педант надутый и мудреный —")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "Он важно судит обо всем,")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "Всего он знает понемногу.")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "Люблю тебя, сосед Пахом,—")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "Ты просто глуп, и слава богу.")
    }
}