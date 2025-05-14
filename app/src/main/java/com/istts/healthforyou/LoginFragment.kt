package com.istts.healthforyou

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.istts.healthforyou.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {
    private lateinit var binding: FragmentLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLoginBinding.inflate(inflater, container, false)

        binding.btnLogin.setOnClickListener {
            // Dapatkan nilai email dan password saat tombol diklik
            val email = binding.loginEmail.text.toString().trim()
            val password = binding.loginPassword.text.toString().trim()

            // Reset semua error
            binding.notificationErrorEmail.visibility = View.GONE
            binding.notificationErrorPassword.visibility = View.GONE

            // Validasi input
            when {
                email.isEmpty() && password.isEmpty() -> {
                    binding.notificationErrorEmail.text = "Email harus diisi"
                    binding.notificationErrorEmail.visibility = View.VISIBLE
                    binding.notificationErrorPassword.text = "Password harus diisi"
                    binding.notificationErrorPassword.visibility = View.VISIBLE
                }
                email.isEmpty() -> {
                    binding.notificationErrorEmail.text = "Email harus diisi"
                    binding.notificationErrorEmail.visibility = View.VISIBLE
                }
                password.isEmpty() -> {
                    binding.notificationErrorPassword.text = "Password harus diisi"
                    binding.notificationErrorPassword.visibility = View.VISIBLE
                }
                else -> {

                }
            }
        }

        return binding.root
    }
}