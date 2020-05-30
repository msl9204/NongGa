package com.example.mj_capstone

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class PredictionActivity :AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView((R.layout.activity_prediction))

        val actionbar = supportActionBar
        actionbar!!.title = "농산물 가격예측"
        actionbar.setDisplayHomeAsUpEnabled(true)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}