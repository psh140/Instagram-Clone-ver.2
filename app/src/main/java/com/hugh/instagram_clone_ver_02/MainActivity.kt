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
import com.hugh.instagram_clone_ver_02.Fragments.HomeFragment
import com.hugh.instagram_clone_ver_02.Fragments.NotificationsFragment
import com.hugh.instagram_clone_ver_02.Fragments.ProfileFragment
import com.hugh.instagram_clone_ver_02.Fragments.SearchFragment

class MainActivity : AppCompatActivity() {

    internal var selectedFragment : Fragment? = null


    private val onNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.nav_home -> {
//                moveToFragment(HomeFragment())
                selectedFragment = HomeFragment()
            }
            R.id.nav_search -> {
//                moveToFragment(SearchFragment())
                selectedFragment = SearchFragment()
            }
            R.id.nav_add_post -> {

                return@OnNavigationItemSelectedListener true
            }
            R.id.nav_notifications -> {
//                moveToFragment(NotificationsFragment())

                selectedFragment = NotificationsFragment()
            }
            R.id.nav_profile -> {
//                moveToFragment(ProfileFragment())

                selectedFragment = ProfileFragment()
            }
        }

        if(selectedFragment != null) {
            supportFragmentManager.beginTransaction().replace(
                R.id.fragment_container,
                selectedFragment!!
            ).commit()
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navView: BottomNavigationView = findViewById(R.id.nav_view)

        navView.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener)

        supportFragmentManager.beginTransaction().replace(
            R.id.fragment_container,
            HomeFragment()
        ).commit()
//        moveToFragment(HomeFragment())

    }


//    private fun moveToFragment(fragment: Fragment)
//    {
//        val fragmentTrans = supportFragmentManager.beginTransaction()
//        fragmentTrans.replace(R.id.fragment_container, fragment)
//        fragmentTrans.commit()
//    }
}