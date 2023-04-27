package com.example.claimchapchap.ui.claims.newclaim

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.fragment.findNavController
import androidx.viewpager.widget.ViewPager
import com.example.claimchapchap.R
import com.example.claimchapchap.databinding.FragmentNewClaimMainBinding

class NewClaimMainFragment : Fragment() {

    private lateinit var binding: FragmentNewClaimMainBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentNewClaimMainBinding.inflate(layoutInflater)
        val view = binding.root

        val back: ImageView = binding.backIcon
        back.setOnClickListener{
            findNavController().navigate(R.id.action_newClaimMainFragment2_to_mainActivity4)
        }

        val viewPager = binding.viewPager as ViewPager
        val tablayout = binding.tabOne

        val fragmentAdapter = NewClaimAdapter(parentFragmentManager)
        fragmentAdapter.addFragment(NewClaimFragmentOne(), "Page One")
        fragmentAdapter.addFragment(NewClaimFragmentTwo(), "Page Two")

        viewPager.adapter = fragmentAdapter
        tablayout.setupWithViewPager(viewPager)
        return view
    }
}