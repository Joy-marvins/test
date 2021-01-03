package com.test.demo.ui.event

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.test.demo.R

class EnentFragment : Fragment() {

    private lateinit var enentViewModel: EnentViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        enentViewModel =
                ViewModelProvider(this).get(EnentViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_enent, container, false)
        val textView: TextView = root.findViewById(R.id.text_event)
        enentViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}