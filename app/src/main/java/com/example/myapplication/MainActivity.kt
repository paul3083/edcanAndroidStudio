package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.bnvMain.run {
            setOnNavigationItemSelectedListener {
                when (it.itemId) {
                    R.id.menu_main_home -> {
                        val Fragment1 = Fragment1()
                        supportFragmentManager.beginTransaction()
                            .replace(R.id.fl_con, Fragment1).commit()
                    }
                    R.id.menu_main_profile-> {
                        val Fragment2 = Fragment2()
                        supportFragmentManager.beginTransaction()
                            .replace(R.id.fl_con, Fragment2).commit()
                    }
                    R.id.menu_main_chat-> {
                        val Fragment3 = Fragment3()
                        supportFragmentManager.beginTransaction()
                            .replace(R.id.fl_con, Fragment3()).commit()
                    }
                    R.id.menu_main_analyze-> {
                        val Fragment4 = Fragment4()
                        supportFragmentManager.beginTransaction()
                            .replace(R.id.fl_con, Fragment4()).commit()
                    }
                    R.id.menu_main_setting-> {
                        val Fragment5 = Fragment5()
                        supportFragmentManager.beginTransaction()
                            .replace(R.id.fl_con, Fragment5()).commit()
                    }
                }
                true
            }
            var selectedItemId = R.id.menu_main_home
        }
    }
}