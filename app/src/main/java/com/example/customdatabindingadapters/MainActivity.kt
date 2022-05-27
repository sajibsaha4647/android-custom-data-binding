package com.example.customdatabindingadapters

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.customdatabindingadapters.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val post = Post("introduction to kotlin","this all about my channel discription","http://drive.google.com/uc?id=1pZqz5HDU7x4BF7Ye3dQYUjJ7mCaMwTyf")

        binding.post = post



    }
}