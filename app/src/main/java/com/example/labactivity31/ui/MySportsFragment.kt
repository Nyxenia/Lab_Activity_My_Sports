package com.example.labactivity31.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.labactivity31.R
import com.example.labactivity31.databinding.FragmentMySportsBinding

class MySportsFragment : Fragment() {

    private var _binding: FragmentMySportsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMySportsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnFootball.setOnClickListener { navigateToSport("football") }
        binding.btnBasketball.setOnClickListener { navigateToSport("basketball") }
        binding.btnTennis.setOnClickListener { navigateToSport("tennis") }
    }

    private fun navigateToSport(sportId: String) {
        val args = Bundle().apply {
            putString("sportId", sportId)
        }
        findNavController().navigate(
            R.id.action_mySportsFragment_to_sportDetailFragment,
            args
        )
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
