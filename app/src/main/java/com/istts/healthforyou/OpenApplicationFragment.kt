package com.istts.healthforyou

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.istts.healthforyou.databinding.FragmentOpenApplicationBinding

class OpenApplicationFragment : Fragment() {
    private lateinit var binding: FragmentOpenApplicationBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentOpenApplicationBinding.inflate(inflater, container, false)

        return binding.root
    }
}