package com.smarttoolfactory.tutorial7_1bnv_viewpager2_nestednavigation.blankfragment

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import com.smarttoolfactory.tutorial7_1bnv_viewpager2_nestednavigation.R
import com.smarttoolfactory.tutorial7_1bnv_viewpager2_nestednavigation.databinding.FragmentDashboard1Binding

class DashboardFragment1 : BaseDataBindingFragment<FragmentDashboard1Binding>() {

    override fun getLayoutRes(): Int = R.layout.fragment_dashboard1

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        dataBinding!!.btnNextPage.setOnClickListener {
            findNavController().navigate(R.id.action_dashboardFragment1_to_dashboardFragment2)
        }
    }
}
