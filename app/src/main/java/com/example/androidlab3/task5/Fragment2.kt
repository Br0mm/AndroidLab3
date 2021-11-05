package com.example.androidlab3.task5

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.androidlab3.R
import com.example.androidlab3.databinding.Fragment2Binding

class Fragment2 : Fragment() {

    private var _binding: Fragment2Binding? = null

    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = Fragment2Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.toThird.setOnClickListener {
            view.findNavController().navigate(R.id.action_fragment2_to_fragment3)
        }

        binding.toFirst.setOnClickListener {
            view.findNavController().navigate(R.id.action_fragment2_to_fragment1)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}