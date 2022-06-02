package com.example.appmapaconspinner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import com.example.appmapaconspinner.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    val tag = "MainActivity"
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val mapa = mutableMapOf<String, String>()


        binding.btnAgregar.setOnClickListener {


        }
        binding.btnEnviar.setOnClickListener {

        }

        val adaptador: ArrayAdapter<*> = ArrayAdapter.createFromResource(this, R.array.Datos, android.R.layout.simple_spinner_item)
        binding.spinner.adapter = adaptador
        binding.spinner.onItemSelectedListener = object :
        AdapterView.OnItemSelectedListener{
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                Toast.makeText(this@MainActivity, "Selección:".plus(position.toString()),Toast.LENGTH_SHORT).show()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                Toast.makeText(this@MainActivity, "Selección", Toast.LENGTH_SHORT).show()
            }
        }
    }
}