package com.example.lab5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils.replace
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    private lateinit var imgHome: ImageView
    private lateinit var imgUser: ImageView
    private val fragmentHome = HomeFragment()
    private val fragmentUser = UserFragment()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imgHome = findViewById(R.id.imgHome)
        imgUser = findViewById(R.id.imgUser)


        imgUser.setOnClickListener {
            imgHome.setImageResource(R.drawable.unselected_home)
            imgUser.setImageResource(R.drawable.selected_user)

            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragmentContainerView2, fragmentUser)
                commit()
            }
        }

        imgHome.setOnClickListener {
            imgHome.setImageResource(R.drawable.selected_home)
            imgUser.setImageResource(R.drawable.unselected_user)

            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragmentContainerView2, fragmentHome)
                commit()
            }
        }
    }


}