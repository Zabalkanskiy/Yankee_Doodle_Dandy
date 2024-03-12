package com.yankee.doodledandy.presentation.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.yankee.doodledandy.R

const val STARTQIEEZFRAGMENT = "STARTQIEEZFRAGMENT"
class StartQieezFragment : Fragment() {

    lateinit var startButton: Button

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       return inflater.inflate(R.layout.start_geeze_lyout, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        startButton = view.findViewById(R.id.start_quiz_button)

        startButton.setOnClickListener {
            parentFragmentManager.beginTransaction().replace(R.id.activity_fragment_container, QeezeFragment.newInstance(), QEEZEFRAGMENT)
                .commit()
        }
    }

    companion object {
        fun newInstance(): StartQieezFragment {
            return StartQieezFragment()
        }
    }

}