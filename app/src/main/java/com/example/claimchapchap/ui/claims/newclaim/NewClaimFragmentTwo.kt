package com.example.claimchapchap.ui.claims.newclaim

import android.os.Bundle
import android.text.Layout
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.TextView
import android.widget.Toast
import androidx.core.view.get
import androidx.viewpager2.widget.ViewPager2
import com.example.claimchapchap.R
import com.example.claimchapchap.databinding.FragmentNewClaimTwoBinding
import com.example.claimchapchap.databinding.TestBinding

class NewClaimFragmentTwo : Fragment() {

    private lateinit var binding: TestBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = TestBinding.inflate(layoutInflater)
        val vieww = binding.root

        val item = listOf("me","me","me","me","me")
        val text: AutoCompleteTextView = binding.text
        val adapter = ArrayAdapter(requireContext(),R.layout.z_list_item, item)
        text.setAdapter(adapter)

        text.onItemClickListener = AdapterView.OnItemClickListener {
                adapterView, view, i, l ->
            val itemSelected = adapterView.getItemAtPosition(i)
            Toast.makeText(activity, "Item: $itemSelected" , Toast.LENGTH_SHORT).show()
        }

        return vieww
    }
}