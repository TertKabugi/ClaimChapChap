package com.example.claimchapchap.ui.polices

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.claimchapchap.R
import com.example.claimchapchap.models.Policies

class PolicyAdapter(private val policiesList: List<Policies>) : RecyclerView.Adapter<PolicyAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.test, parent, false)
        return ViewHolder(view)
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

//        holder.policies = policiesList[position]
//        holder.txvDestination.text = policiesList[position].firstName

//        holder.itemView.setOnClickListener { v ->
//            val context = v.context
//            val intent = Intent(context, DestinationDetailActivity::class.java)
//            intent.putExtra(DestinationDetailActivity.ARG_ITEM_ID, holder.policies!!.id)
//
//            context.startActivity(intent)
//        }
    }

    override fun getItemCount(): Int {
        return policiesList.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

//        val txvDestination: TextView = itemView.findViewById(R.id.txv_destination)
//        var policies: Policies? = null
//
//        override fun toString(): String {
//            return """${super.toString()} '${txvDestination.text}'"""
//        }
    }

}
//(policies: ArrayList<Policies>)