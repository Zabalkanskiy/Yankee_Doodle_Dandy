package com.yankee.doodledandy.presentation.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.yankee.doodledandy.R

const val RESULTFRAGMENT = "RESULTFRAGMENT"
const val RIGHTANSWER = "RIGHTANSWER"
class ResultFragment : Fragment() {
    var resultInt = 0

    lateinit var resultText: TextView
    lateinit var startAgainButton: Button
    lateinit var textResult: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       resultInt = arguments?.getInt(RIGHTANSWER) ?: 0
        textResult = resultInt.toString() + "/20"
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       return inflater.inflate(R.layout.result_quiz_layout, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        startAgainButton = view.findViewById(R.id.result_fragment_start_again_button)
        resultText = view.findViewById(R.id.result_fragment_result_text_view)
        resultText.text = textResult

        startAgainButton.setOnClickListener {
            parentFragmentManager.beginTransaction().replace(R.id.activity_fragment_container, QeezeFragment.newInstance(), QEEZEFRAGMENT)
                .commit()
        }



    }

    companion object {
        fun newInstance(rightAnswer: Int): ResultFragment {
            val args = Bundle()
            args.putInt(RIGHTANSWER, rightAnswer)


            val fragment = ResultFragment()
            fragment.arguments = args
            return fragment
        }

    }
}