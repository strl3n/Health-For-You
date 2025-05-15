package com.istts.healthforyou

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.istts.healthforyou.databinding.FragmentRegisterBinding

class RegisterFragment : Fragment() {
    private lateinit var binding: FragmentRegisterBinding // Inisialisasi untuk binding RegisterFragment
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentRegisterBinding.inflate(inflater, container, false)

        binding.btnRegister.setOnClickListener(){
            val name = binding.registerName.text.toString().trim()
            val email = binding.registerName.text.toString().trim()
            val phone = binding.registerPhone.text.toString().trim()
            val password = binding.registerPassword.text.toString().trim()

            // Untuk notifikasi error
            binding.notificationErrorNameRegister.visibility = View.GONE
            binding.notificationErrorEmailRegister.visibility = View.GONE
            binding.notificationErrorPhoneRegister.visibility = View.GONE
            binding.notificationErrorPasswordRegister.visibility = View.GONE

            when{
                name.isEmpty() || email.isEmpty() || phone.isEmpty() || password.isEmpty() -> {
                    binding.notificationErrorNameRegister.text = "Nama harus diisi"
                    binding.notificationErrorNameRegister.visibility = View.VISIBLE
                    binding.notificationErrorEmailRegister.text = "Email harus diisi"
                    binding.notificationErrorEmailRegister.visibility = View.VISIBLE
                    binding.notificationErrorPhoneRegister.text = "No telepon harus diisi"
                    binding.notificationErrorPhoneRegister.visibility = View.VISIBLE
                    binding.notificationErrorPasswordRegister.text = "Password harus diisi"
                    binding.notificationErrorPasswordRegister.visibility = View.VISIBLE
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
                    // LOGIC KALAU REGISTER BERHASIL
                    // MISAL SIMPAN KE DATABASE DLL
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