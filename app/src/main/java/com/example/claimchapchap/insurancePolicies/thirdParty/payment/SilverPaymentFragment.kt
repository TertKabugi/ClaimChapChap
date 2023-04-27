package com.example.claimchapchap.insurancePolicies.thirdParty.payment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.navigation.fragment.findNavController
import com.example.claimchapchap.R
import com.example.claimchapchap.databinding.FragmentThirdpartySilverMobilePaymentBinding
import com.example.claimchapchap.databinding.FragmentThirdpartySilverPaymentBinding

class SilverPaymentFragment : Fragment() {

    private lateinit var binding: FragmentThirdpartySilverPaymentBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentThirdpartySilverPaymentBinding.inflate(layoutInflater)
        val view = binding.root

        val back: ImageView = binding.backIcon
        back.setOnClickListener{
            findNavController().navigate(R.id.action_silverPaymentFragment5_to_silverQuoteFragment6)
        }

        val radioGroup: RadioGroup = binding.radioGroup
        val mobile: RadioButton = binding.mobilePayment
        val card: RadioButton = binding.cardPayment

        val next: Button = binding.btnNext
        next.setOnClickListener{
            val id: Int = radioGroup.checkedRadioButtonId
            if (id!=-1){
                if (mobile.isChecked){
                    Toast.makeText(activity, "Mobile Payment is Selected", Toast.LENGTH_SHORT).show()
                    findNavController().navigate(R.id.action_silverPaymentFragment5_to_silverMobilePayment4)
                }else if (card.isChecked){
                    Toast.makeText(activity, "Card Payment is Selected", Toast.LENGTH_SHORT).show()
                    findNavController().navigate(R.id.action_silverPaymentFragment5_to_silverCardPayment4)
                }
            }else{
                Toast.makeText(activity,"Nothing is Selected", Toast.LENGTH_SHORT).show()
            }
        }

        return view
    }

}