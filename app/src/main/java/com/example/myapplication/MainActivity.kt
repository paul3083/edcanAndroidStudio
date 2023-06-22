package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.bnvMain.run {
            setOnNavigationItemSelectedListener {
                when (it.itemId) {
                    R.id.menu_main_home -> {
                        Fragment1()
                        supportFragmentManager.beginTransaction()
                            .replace(R.id.fl_con, Fragment1()).commit()
                    }
                    R.id.menu_main_profile-> {
                        Fragment2()
                        supportFragmentManager.beginTransaction()
                            .replace(R.id.fl_con, Fragment2()).commit()
                    }
                    R.id.menu_main_chat-> {
                        Fragment3()
                        supportFragmentManager.beginTransaction()
                            .replace(R.id.fl_con, Fragment3()).commit()
                    }
                    R.id.menu_main_analyze-> {
                        Fragment4()
                        supportFragmentManager.beginTransaction()
                            .replace(R.id.fl_con, Fragment4()).commit()
                    }
                    R.id.menu_main_setting-> {
                        Fragment5()
                        supportFragmentManager.beginTransaction()
                            .replace(R.id.fl_con, Fragment5()).commit()
                    }
                }
                true
            }
            R.id.menu_main_home
        }
    }
}