package com.mlhysrszn.newsapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.mlhysrszn.newsapp.databinding.FragmentScienceNewsBinding

class ScienceNewsFragment : Fragment() {
    private var news: News? = null
    private var _binding: FragmentScienceNewsBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            news = it.getSerializable(NEWS) as News?
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentScienceNewsBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.news = news
        binding.root.setOnClickListener {
            val fm = parentFragmentManager
            val detailFragment = NewsDetailFragment.newInstance(news!!)
            Utils.removeFragments(fm)
            parentFragmentManager
                .beginTransaction()
                .add(R.id.frag1, detailFragment)
                .commit()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {
        @JvmStatic
        fun newInstance(news: News) =
            ScienceNewsFragment().apply {
                arguments = Bundle().apply {
                    putSerializable(NEWS, news)
                }
            }
    }
}