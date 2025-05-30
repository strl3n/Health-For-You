package com.istts.healthforyou

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.istts.healthforyou.databinding.FragmentMainBinding
import com.istts.healthforyou.databinding.FragmentSeminarListBinding

class SeminarListFragment : Fragment() {
    private lateinit var binding: FragmentSeminarListBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSeminarListBinding.inflate(inflater, container, false)

        binding.btnAddSeminar.setOnClickListener(){
            findNavController().navigate(R.id.action_seminarListFragment2_to_seminarAddFragment)
        }

        return binding.root
    }
}