package com.example.week11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    private lateinit var mAdapter:RecordAdapter
    private val TAG="MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.toolbarMain.inflateMenu(R.menu.menu)

        binding.toolbarMain.setOnMenuItemClickListner{
            when (it.itemId){
                R.id.item_add->{
                    Log.e(TAG,"item_add")
                    true

                }
            }
            true
        }

    }
}