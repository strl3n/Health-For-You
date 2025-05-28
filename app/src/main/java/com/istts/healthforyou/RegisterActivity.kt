package com.istts.healthforyou

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.istts.healthforyou.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {
    lateinit var binding: ActivityRegisterBinding
    private lateinit var navController: NavController
//as8yd9IUAHSIUHDIAUHSDIHAIHSIUDHIHIAHCBXZJBCBUWEUIIWD
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_register)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_register)

        val navHostFragment = supportFragmentManager.findFragmentById(R.id.view_register_fragment) as NavHostFragment
        navController = navHostFragment.navController
    }
}