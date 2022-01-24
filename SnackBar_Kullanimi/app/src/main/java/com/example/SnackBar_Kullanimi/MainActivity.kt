package com.example.SnackBar_Kullanimi

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.lab_22.R
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var snack = findViewById<Button>(R.id.snack)

        snack.setOnClickListener { x->

            val sb = Snackbar.make(x, "Geri Alınsın mı ?",Snackbar.LENGTH_INDEFINITE)

            sb.setAction("Evet") { y ->
                Snackbar.make(y ,"Geri alındı",Snackbar.LENGTH_LONG).show()

            }
                    sb.setActionTextColor(Color.RED)
                    sb.setTextColor(Color.WHITE)
                    sb.setBackgroundTint(Color.DKGRAY)
                .show()
        }
    }

}