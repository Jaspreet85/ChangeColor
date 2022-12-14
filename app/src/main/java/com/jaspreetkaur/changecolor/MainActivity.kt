package com.jaspreetkaur.changecolor

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.Fragment
import com.jaspreetkaur.changecolor.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding
    lateinit var activityInterface :ActivityInterface
    var i=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnAlert.setOnClickListener {

            var alertDialog = AlertDialog.Builder(this)
            alertDialog.setTitle("Select Color")
            alertDialog.setMessage("Select a color that you want to set as fragment background")
            alertDialog.setPositiveButton("Blue") { _, _ ->
                i++
                activityInterface.ActivityInterface(0,i)
            }
            alertDialog.setNegativeButton("Red") { _, _ ->
                i++
                activityInterface.ActivityInterface(1,i)
            }
            alertDialog.setNeutralButton("Yellow") { _, _ ->
                i++
                activityInterface.ActivityInterface(2,i)
            }
            alertDialog.show()
        }
    }
    }
