package com.example.instagram_ui

import Adapter.RasmAdapter
import Adapter.RasmAdapter2
import Models.Rasm
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.instagram_ui.Models.Rasm_2
import com.example.instagram_ui.Models.myData
import com.example.instagram_ui.databinding.ActivityMainBinding
import com.example.instagram_ui.databinding.FragmentProfilBinding


class BlankFragment : Fragment() {

    private lateinit var list_rasm:ArrayList<Rasm>
    private lateinit var list:ArrayList<Rasm_2>
    private val binding by lazy { FragmentProfilBinding.inflate(layoutInflater) }
    private lateinit var rasmAdapter: RasmAdapter
    private lateinit var rasmAdapter2: RasmAdapter2

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        loadData()

        rasmAdapter= RasmAdapter(list_rasm)
        binding.rv1.adapter=rasmAdapter


        load_Data()

        rasmAdapter2= RasmAdapter2(list)
        binding.rv2.adapter=rasmAdapter2
       return binding.root
    }

    private fun loadData() {
        list_rasm=ArrayList()
        for (i in 0 until 4) {
            list_rasm.add(Rasm(R.drawable.img_10, "Johnson"))
            list_rasm.add(Rasm(R.drawable.img_11, "Tom"))
            list_rasm.add(Rasm(R.drawable.img_8, "Robert"))
            list_rasm.add(Rasm(R.drawable.img_9, "Diana"))
            list_rasm.add(Rasm(R.drawable.img_12, "Thor"))
        }
    }


    private fun load_Data() {
        list = ArrayList()
        for (i in 0 until 4) {
            list.add(Rasm_2(R.drawable.spider_man_2))
            list.add(Rasm_2(R.drawable.spider_man_1))
            list.add(Rasm_2(R.drawable.captain_3))
            list.add(Rasm_2(R.drawable.captain_2))
        }
    }
}