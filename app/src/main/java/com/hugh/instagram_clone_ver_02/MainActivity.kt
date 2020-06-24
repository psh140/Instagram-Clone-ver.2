package com.hugh.instagram_clone_ver_02

import android.os.Bundle
import android.widget.TextView
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController

class MainActivity : AppCompatActivity() {

    private lateinit var textView: TextView

    private val onNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.nav_home -> {
//                moveToFragment(HomeFragment())
                textView.setText("Home")
                return@OnNavigationItemSelectedListener true
            }
            R.id.nav_search -> {
//                moveToFragment(SearchFragment())
                textView.setText("Search")
                return@OnNavigationItemSelectedListener true
            }
            R.id.nav_add_post -> {
                textView.setText("Add post")
                return@OnNavigationItemSelectedListener true
            }
            R.id.nav_notifications -> {
//                moveToFragment(NotificationsFragment())
                textView.setText("Notification")
                return@OnNavigationItemSelectedListener true
            }
            R.id.nav_profile -> {
//                moveToFragment(ProfileFragment())
                textView.setText("Profile")
                return@OnNavigationItemSelectedListener true
            }
        }

        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navView: BottomNavigationView = findViewById(R.id.nav_view)
        textView = findViewById(R.id.message)

        navView.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener)

//        moveToFragment(HomeFragment())

    }


//    private fun moveToFragment(fragment: Fragment)
//    {
//        val fragmentTrans = supportFragmentManager.beginTransaction()
//        fragmentTrans.replace(R.id.fragment_container, fragment)
//        fragmentTrans.commit()
//    }
}