package com.istts.healthforyou

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.viewModels
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.istts.healthforyou.databinding.FragmentRegisterBinding

class RegisterFragment : Fragment() {
    val viewModel by viewModels<AppViewModel>()
    private lateinit var binding: FragmentRegisterBinding // Inisialisasi untuk binding RegisterFragment

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentRegisterBinding.inflate(inflater, container, false)

        binding.btnRegister.setOnClickListener(){
            val username = binding.registerUsername.text.toString().trim()
            val name = binding.registerName.text.toString().trim()
            val email = binding.registerName.text.toString().trim()
            val phone = binding.registerPhone.text.toString().trim()
            val password = binding.registerPassword.text.toString().trim()

            // Untuk notifikasi error
            binding.notificationErrorNameRegister.visibility = View.GONE
            binding.notificationErrorEmailRegister.visibility = View.GONE
            binding.notificationErrorPhoneRegister.visibility = View.GONE
            binding.notificationErrorPasswordRegister.visibility = View.GONE
            binding.notificationErrorUsernameRegister.visibility = View.GONE

            when{
                username.isEmpty() || name.isEmpty() || email.isEmpty() || phone.isEmpty() || password.isEmpty() -> {
                    binding.notificationErrorNameRegister.text = "Nama harus diisi"
                    binding.notificationErrorNameRegister.visibility = View.VISIBLE
                    binding.notificationErrorEmailRegister.text = "Email harus diisi"
                    binding.notificationErrorEmailRegister.visibility = View.VISIBLE
                    binding.notificationErrorPhoneRegister.text = "No telepon harus diisi"
                    binding.notificationErrorPhoneRegister.visibility = View.VISIBLE
                    binding.notificationErrorPasswordRegister.text = "Password harus diisi"
                    binding.notificationErrorPasswordRegister.visibility = View.VISIBLE
                    binding.notificationErrorUsernameRegister.text = "Username harus diisi"
                    binding.notificationErrorUsernameRegister.visibility = View.VISIBLE
                }
                name.isEmpty() -> {
                    binding.notificationErrorNameRegister.text = "Nama harus diisi"
                    binding.notificationErrorNameRegister.visibility = View.VISIBLE
                }
                email.isEmpty() -> {
                    binding.notificationErrorEmailRegister.text = "Email harus diisi"
                    binding.notificationErrorEmailRegister.visibility = View.VISIBLE
                }
                phone.isEmpty() -> {
                    binding.notificationErrorPhoneRegister.text = "No telepon harus diisi"
                    binding.notificationErrorPhoneRegister.visibility = View.VISIBLE
                }
                password.isEmpty() -> {
                    binding.notificationErrorPasswordRegister.text = "Password harus diisi"
                    binding.notificationErrorPasswordRegister.visibility = View.VISIBLE
                }
                else -> {
                    viewModel.registerUser(EntityUser(
                        binding.registerUsername.text.toString(),
                        binding.registerEmail.text.toString(),
                        binding.registerPassword.text.toString(),
                        binding.registerName.text.toString(),
                        "user"
                    ), activity as Context)
                }
            }
        }

        // Ini buat waktu tulisan LOGIN diklik pindah ke halaman login
        binding.btnGoLogin.setOnClickListener(){
            findNavController().navigate(R.id.action_registerFragment_to_loginFragment)
        }

        return binding.root
    }
}