package com.test.demo.ui.behavior

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.test.demo.R

class BehaviorFragment : Fragment() {

    private lateinit var behaviorViewModel: BehaviorViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        behaviorViewModel =
                ViewModelProvider(this).get(BehaviorViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_behavior, container, false)
        val textView: TextView = root.findViewById(R.id.text_behavior)
        behaviorViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}

