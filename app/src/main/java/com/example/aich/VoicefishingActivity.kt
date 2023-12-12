package com.example.aich

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.aich.databinding.ActivityVoicefishingBinding

class VoicefishingActivity : Fragment() {
    lateinit var binding: ActivityVoicefishingBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = ActivityVoicefishingBinding.inflate(inflater, container, false)

//        binding.icBottomUpdateFishingIv.setOnClickListener{
//            setBoxStatus(false)
//        }
//        binding.icBottomUpdateFishingIv.setOnClickListener{
//            setBoxStatus(true)
//        }
        binding = ActivityVoicefishingBinding.inflate(inflater, container, false)

        binding.albumBackIv.setOnClickListener{
            (context as MainActivity).supportFragmentManager.beginTransaction()
                .replace(R.id.main_frm,HomeFragment())
                .commitAllowingStateLoss()
        }


        fun setBoxStatus(isPlaying : Boolean) {
            if(isPlaying) {
                binding.callContentBoxIv.visibility = View.VISIBLE
                binding.blackIv.visibility = View.GONE
            }
            else {
                binding.callContentBoxIv.visibility = View.GONE
                binding.blackIv.visibility = View.VISIBLE
            }
        }

        return binding.root
    }


}