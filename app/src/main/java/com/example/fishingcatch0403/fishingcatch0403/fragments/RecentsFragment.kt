package com.example.fishingcatch0403.fishingcatch0403.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.fishingcatch0403.databinding.FragmentKeyBinding
import com.example.fishingcatch0403.databinding.FragmentRecentsBinding

class RecentsFragment : Fragment()  {

    private var mBinding : FragmentRecentsBinding? = null
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentRecentsBinding.inflate(inflater, container, false)

        mBinding = binding

        return mBinding?.root
    }

    override fun onDestroyView() {
        mBinding = null
        super.onDestroyView()
    }
}