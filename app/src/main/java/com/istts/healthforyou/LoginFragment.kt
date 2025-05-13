package com.istts.healthforyou

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.istts.healthforyou.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {
    private lateinit var binding: FragmentLoginBinding // Inisialisasi untuk binding LoginFragment
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLoginBinding.inflate(inflater, container, false)
        val email = binding.loginEmail.text.toString()
        val password = binding.loginPassword.text.toString()

        binding.btnLogin.setOnClickListener(){
            if(email.isEmpty() || password.isEmpty()){
                Toast.makeText(requireContext(), "Semua field harus diisi", Toast.LENGTH_SHORT).show()
            }
        }

        return binding.root
    }
}