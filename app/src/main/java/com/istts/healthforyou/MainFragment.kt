package com.istts.healthforyou

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.istts.healthforyou.databinding.FragmentMainBinding

class MainFragment : Fragment() {
    private lateinit var binding: FragmentMainBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainBinding.inflate(inflater, container, false)

        binding.profile.setOnClickListener(){
            findNavController().navigate(R.id.action_mainFragment_to_profileFragment)
        }

        binding.btnKontrolKesehatan.setOnClickListener(){
            Toast.makeText(requireContext(), "Kontrol Kesehatan", Toast.LENGTH_SHORT).show()
        }

        binding.btnLayananRehabilitasi.setOnClickListener(){
            Toast.makeText(requireContext(), "Layanan Rehabilitasi", Toast.LENGTH_SHORT).show()
        }

        binding.btnSeminarKesehatan.setOnClickListener(){
            findNavController().navigate(R.id.action_mainFragment_to_seminarListFragment)
        }

        binding.btnKonsultasi.setOnClickListener(){
            Toast.makeText(requireContext(), "Layanan Rehabilitasi", Toast.LENGTH_SHORT).show()
        }

        return binding.root
    }
}