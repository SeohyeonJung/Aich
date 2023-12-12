package com.example.aich

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.aich.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        var binding = FragmentHomeBinding.inflate(inflater, container, false)

        binding.homeMainOption1Iv.setOnClickListener{
            (context as MainActivity).supportFragmentManager.beginTransaction().replace(R.id.main_frm,CallActivity()).commitAllowingStateLoss()
        }

        binding.homeMainOption2Iv.setOnClickListener{
            (context as MainActivity).supportFragmentManager.beginTransaction().replace(R.id.main_frm,VoicefishingActivity()).commitAllowingStateLoss()
        }

        binding.homeMainOption3Iv.setOnClickListener{
            (context as MainActivity).supportFragmentManager.beginTransaction().replace(R.id.main_frm,MessageActivity()).commitAllowingStateLoss()
        }
        return binding.root
    }
}