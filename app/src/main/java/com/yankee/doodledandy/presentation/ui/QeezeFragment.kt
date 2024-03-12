package com.yankee.doodledandy.presentation.ui

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.yankee.doodledandy.R
import com.yankee.doodledandy.presentation.presener.QuestionViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel


const val QEEZEFRAGMENT = "QEEZEFRAGMENT"

class QeezeFragment : Fragment() {
    var isLastQuestion : Boolean = false
    var answerString: String = ""
    lateinit var imageViewQuestion: ImageView
    lateinit var textView: TextView
    lateinit var quizNumberQuestion: TextView

    lateinit var firstButton: Button
    lateinit var secondButton: Button
    lateinit var thirdButton: Button
    lateinit var fourButton: Button



    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.quiz_layout, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val quizViewModel by viewModel<QuestionViewModel>()

        quizViewModel.getQuestion()

        imageViewQuestion = view.findViewById(R.id.quiz_image_view)
        textView = view.findViewById(R.id.quiz_question_text)
        firstButton = view.findViewById(R.id.quiz_first_button)
        secondButton = view.findViewById(R.id.quiz_second_button)
        thirdButton = view.findViewById(R.id.quiz_third_button)
        fourButton = view.findViewById(R.id.quiz_four_button)
        quizNumberQuestion = view.findViewById(R.id.quiz_question_id)

        firstButton.setOnClickListener {

               if( quizViewModel.getAnswerBoolean(buttonNumber = 1)){
                   it.setBackgroundResource(R.drawable.green_button_shape)
               } else {
                   it.setBackgroundResource(R.drawable.red_button_shape)

               }

                Handler(Looper.getMainLooper()).postDelayed({
                   if (isLastQuestion){
                       parentFragmentManager.beginTransaction().replace(R.id.activity_fragment_container, ResultFragment.newInstance(quizViewModel.getRightAnswer()), RESULTFRAGMENT)
                           .commit()
                   }   else {
                       quizViewModel.getNextQuestion()
                   }

                }, 2000)


        }
        secondButton.setOnClickListener {

            if( quizViewModel.getAnswerBoolean(buttonNumber = 2)){
                it.setBackgroundResource(R.drawable.green_button_shape)
            } else {
                it.setBackgroundResource(R.drawable.red_button_shape)

            }

            Handler(Looper.getMainLooper()).postDelayed({
                if (isLastQuestion){
                    parentFragmentManager.beginTransaction().replace(R.id.activity_fragment_container, ResultFragment.newInstance(quizViewModel.getRightAnswer()), RESULTFRAGMENT)
                        .commit()
                }   else {
                    quizViewModel.getNextQuestion()
                }

            }, 2000)

        }
        thirdButton.setOnClickListener {

            if( quizViewModel.getAnswerBoolean(buttonNumber = 3)){
                it.setBackgroundResource(R.drawable.green_button_shape)
            } else {
                it.setBackgroundResource(R.drawable.red_button_shape)

            }

            Handler(Looper.getMainLooper()).postDelayed({
                if (isLastQuestion){
                    parentFragmentManager.beginTransaction().replace(R.id.activity_fragment_container, ResultFragment.newInstance(quizViewModel.getRightAnswer()), RESULTFRAGMENT)
                        .commit()
                }   else {
                    quizViewModel.getNextQuestion()
                }

            }, 2000)

        }
        fourButton.setOnClickListener {

            if( quizViewModel.getAnswerBoolean(buttonNumber = 4)){
                it.setBackgroundResource(R.drawable.green_button_shape)
            } else {
                it.setBackgroundResource(R.drawable.red_button_shape)

            }

            Handler(Looper.getMainLooper()).postDelayed({
                if (isLastQuestion){
                    parentFragmentManager.beginTransaction().replace(R.id.activity_fragment_container, ResultFragment.newInstance(quizViewModel.getRightAnswer()), RESULTFRAGMENT)
                        .commit()
                }   else {
                    quizViewModel.getNextQuestion()
                }

            }, 2000)

        }

        quizViewModel.getLiveQueestion().observe(viewLifecycleOwner){
            firstButton.text = it.firstText
            secondButton.text = it.secondText
            thirdButton.text = it.thirdText
            fourButton.text = it.fourText

            firstButton.setBackgroundResource(R.drawable.black_button_shape)
            secondButton.setBackgroundResource(R.drawable.black_button_shape)
            thirdButton.setBackgroundResource(R.drawable.black_button_shape)
            fourButton.setBackgroundResource(R.drawable.black_button_shape)

            textView.text = it.questionText
            imageViewQuestion.setImageResource(it.resImage)
            isLastQuestion = it.islast
            answerString = it.answer

           val count = quizViewModel.question_count + 1
            val numberString = count.toString()  + "/20"
            quizNumberQuestion.text = numberString
        }


    }
    companion object {
        fun newInstance() : QeezeFragment = QeezeFragment()

    }
}