package com.istts.healthforyou

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.istts.healthforyou.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {
    val viewModel by viewModels<AppViewModel>()
    private lateinit var binding: FragmentLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLoginBinding.inflate(inflater, container, false)

        binding.btnLogin.setOnClickListener {
            // Dapatkan nilai email dan password saat tombol diklik
            val email = binding.loginUsername.text.toString().trim()
            val password = binding.loginPassword.text.toString().trim()

            // Reset semua error
            binding.notificationErrorUsernameLogin.visibility = View.GONE
            binding.notificationErrorPasswordLogin.visibility = View.GONE

            // Validasi input
            when {
                email.isEmpty() && password.isEmpty() -> {
                    binding.notificationErrorUsernameLogin.text = "Username harus diisi"
                    binding.notificationErrorUsernameLogin.visibility = View.VISIBLE
                    binding.notificationErrorPasswordLogin.text = "Password harus diisi"
                    binding.notificationErrorPasswordLogin.visibility = View.VISIBLE
                }
                email.isEmpty() -> {
                    binding.notificationErrorUsernameLogin.text = "Username harus diisi"
                    binding.notificationErrorUsernameLogin.visibility = View.VISIBLE
                }
                password.isEmpty() -> {
                    binding.notificationErrorPasswordLogin.text = "Password harus diisi"
                    binding.notificationErrorPasswordLogin.visibility = View.VISIBLE
                }
                else -> {
                    // LOGIC KALAU LOGIN BERHASIL
                    // Contohnya login berhasil -> langsung ke halaman utama
                    // findNavController().navigate(R.id.action_loginFragment_to_mainFragment)
                    var result = viewModel.loginUser(EntityUser(
                        binding.loginUsername.text.toString(),
                        "",
                        binding.loginPassword.text.toString(),
                        "",
                        "user"
                    ), activity as Context)
                }
            }
        }

        // Ini buat waktu tulisan REGISTER diklik pindah ke halaman register
        binding.btnGoRegister.setOnClickListener(){
            findNavController().navigate(R.id.action_loginFragment_to_registerFragment)
        }

        // Ini buat waktu tulisan LUPA PASSWORD diklik pindah ke halaman Forgot Password
        binding.btnGoLupaPassword.setOnClickListener(){
            findNavController().navigate(R.id.action_loginFragment_to_forgotPasswordFragment)
        }

        return binding.root
    }
}