package com.istts.healthforyou

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.istts.healthforyou.databinding.FragmentKegiatanAddBinding

class KegiatanAddFragment : Fragment() {
    private lateinit var binding: FragmentKegiatanAddBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentKegiatanAddBinding.inflate(inflater, container, false)

        return binding.root
    }
}