package com.istts.healthforyou

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
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
            binding.notificationErrorEmailLogin.visibility = View.GONE
            binding.notificationErrorPasswordLogin.visibility = View.GONE

            // Validasi input
            when {
                email.isEmpty() && password.isEmpty() -> {
                    binding.notificationErrorEmailLogin.text = "Email harus diisi"
                    binding.notificationErrorEmailLogin.visibility = View.VISIBLE
                    binding.notificationErrorPasswordLogin.text = "Password harus diisi"
                    binding.notificationErrorPasswordLogin.visibility = View.VISIBLE
                }
                email.isEmpty() -> {
                    binding.notificationErrorEmailLogin.text = "Email harus diisi"
                    binding.notificationErrorEmailLogin.visibility = View.VISIBLE
                }
                password.isEmpty() -> {
                    binding.notificationErrorPasswordLogin.text = "Password harus diisi"
                    binding.notificationErrorPasswordLogin.visibility = View.VISIBLE
                }
                else -> {
                    // LOGIC KALAU LOGIN BERHASIL
                    // Contohnya login berhasil -> langsung ke halaman utama
                    // findNavController().navigate(R.id.action_loginFragment_to_mainFragment)
                }
            }
        }

        // Ini buat waktu tulisan REGISTER diklik pindah ke halaman register
        binding.btnGoRegister.setOnClickListener(){
            findNavController().navigate(R.id.action_loginFragment_to_registerFragment)
        }

        return binding.root
    }
}