package com.dicoding.skinlyze11.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.dicoding.skinlyze11.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel = ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        // Observasi teks greeting
        homeViewModel.greetingText.observe(viewLifecycleOwner) { greeting ->
            binding.tvGreeting.text = greeting
        }

        // Observasi teks subtitle
        homeViewModel.subtitleText.observe(viewLifecycleOwner) { subtitle ->
            binding.tvSubtitle.text = subtitle
        }

        // Observasi teks berita
        homeViewModel.newsTitle.observe(viewLifecycleOwner) { newsTitle ->
            binding.tvBeritaTitle.text = newsTitle
        }

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
