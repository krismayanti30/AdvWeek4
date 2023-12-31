package com.example.adv160419101week2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_main.*

class MainFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btnStart.setOnClickListener {
            val playername = txtName.text.toString()
            val action = MainFragmentDirections.actionGameFragment(playername)
            Navigation.findNavController(it).navigate(action)
        }
//        btnOption.setOnClickListener{
//            val action = MainFragmentDirections.Companion.actionOptionFragment
//            Navigation.findNavController(it).navigate(action)
//        }
    }
}