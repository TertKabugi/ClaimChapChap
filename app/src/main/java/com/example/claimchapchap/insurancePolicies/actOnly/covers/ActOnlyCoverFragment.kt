package com.example.claimchapchap.insurancePolicies.actOnly.covers

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.fragment.findNavController
import androidx.viewpager.widget.ViewPager
import com.example.claimchapchap.R
import com.example.claimchapchap.databinding.FragmentActonlyCoverBinding
import com.example.claimchapchap.insurancePolicies.comprehensive.covers.BronzeCoverFragment
import com.example.claimchapchap.insurancePolicies.comprehensive.covers.GoldCoverFragment
import com.example.claimchapchap.insurancePolicies.comprehensive.covers.SilverCoverFragment
import com.example.claimchapchap.ui.claims.newclaim.partiesinvolved.DriverOne
import com.example.claimchapchap.ui.claims.newclaim.partiesinvolved.DriverTwo
import com.example.claimchapchap.ui.claims.newclaim.partiesinvolved.PartiesInvolvedAdapter
import com.example.claimchapchap.ui.claims.newclaim.partiesinvolved.ThirdParty

class ActOnlyCoverFragment : Fragment() {

    private lateinit var binding: FragmentActonlyCoverBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentActonlyCoverBinding.inflate(layoutInflater)
        val view = binding.root

        val back: ImageView = binding.backIcon
        back.setOnClickListener{
            findNavController().navigate(R.id.action_actOnlyCoverFragment_to_vehicleDetailsFragment)
        }

        val viewPager = binding.viewPager
        val tabLayout = binding.tabOne

        val fragmentAdapter = ActOnlyCoverAdapter(parentFragmentManager)
        fragmentAdapter.addFragment(ActOnlyGoldCoverFragment(), "Gold")
        fragmentAdapter.addFragment(ActOnlySilverCoverFragment(), "Silver")
        fragmentAdapter.addFragment(ActOnlyBronzeCoverFragment(), "Bronze")

        viewPager.adapter = fragmentAdapter
        tabLayout.setupWithViewPager(viewPager)

        return view
    }

}