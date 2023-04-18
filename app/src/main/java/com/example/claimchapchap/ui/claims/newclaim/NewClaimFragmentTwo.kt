package com.example.claimchapchap.ui.claims.newclaim

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.example.claimchapchap.R
import com.example.claimchapchap.databinding.FragmentNewClaimTwoBinding

class NewClaimFragmentTwo : Fragment() {

    private lateinit var binding: FragmentNewClaimTwoBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentNewClaimTwoBinding.inflate(layoutInflater)
        val view = binding.root

        val viewPager = activity?.findViewById<ViewPager2>(R.id.viewPager)
        val skip = binding.btnNext
        skip.setOnClickListener{
            //viewPager?.currentItem = 2
        }

        return view
    }
}