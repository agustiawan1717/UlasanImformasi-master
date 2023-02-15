package com.kotlin.agustiawan.ui.negara

import android.os.Bundle
import com.kotlin.agustiawan.R
import com.kotlin.agustiawan.base.BaseActivity
import com.kotlin.agustiawan.databinding.ActivityCountiresBinding
import dagger.hilt.android.AndroidEntryPoint

// Views data binding

@AndroidEntryPoint
class CountriesActivity : BaseActivity<ActivityCountiresBinding>() {

    /**
     * membuat data Binding
     */
    override fun createBinding(): ActivityCountiresBinding =
        ActivityCountiresBinding.inflate(layoutInflater)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if (savedInstanceState == null) {
            supportFragmentManager
                .beginTransaction()
                .add(R.id.fragment_container, CountriesFragment.newInstance(1))
                .commit()
        }

    }
}
