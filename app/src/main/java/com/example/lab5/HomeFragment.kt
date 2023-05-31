package com.example.lab5

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast


class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)
        val btnDisplay = view.findViewById<Button>(R.id.btnDisplay)
        val edtName = view.findViewById<EditText>(R.id.edtName)

        btnDisplay.setOnClickListener {
            if (edtName.text.toString().isEmpty()) {
                Toast.makeText(context, "Please enter your name!", Toast.LENGTH_LONG)
                    .show()
            } else {
                Toast.makeText(context, "Hello, ${edtName.text.toString()}", Toast.LENGTH_LONG)
                    .show()

            }

        }
        return view
    }


}