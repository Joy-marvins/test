package com.test.demo.ui.permission

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.test.demo.R

class PermissionFragment : Fragment() {

    private lateinit var permissionViewModel: PermissionViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        permissionViewModel =
                ViewModelProvider(this).get(PermissionViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_permission, container, false)
        val textView: TextView = root.findViewById(R.id.text_permission)
        permissionViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}

