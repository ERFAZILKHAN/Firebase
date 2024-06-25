package com.api.a_firebase.Activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge
import com.api.a_firebase.R
import com.api.a_firebase.databinding.MobileActivityBinding
import com.google.firebase.auth.FirebaseAuth


class MobileActivity : ComponentActivity() {
    private lateinit var binding: MobileActivityBinding

    private lateinit var auth : FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = MobileActivityBinding.inflate(layoutInflater)
       setContentView(binding.root)

    }
}