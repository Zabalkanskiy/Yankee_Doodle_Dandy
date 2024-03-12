package com.yankee.doodledandy.presentation.presener

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.yankee.doodledandy.domain.GetAnswerUseCase
import com.yankee.doodledandy.domain.GetQuestionUseCase
import com.yankee.doodledandy.sourceModel.Question

class QuestionViewModel(private val getAnswerUseCase: GetAnswerUseCase, private val getQuestionUseCase: GetQuestionUseCase) : ViewModel() {
     var question_count = 0
    private var right_answer = 0
    private val _question = MutableLiveData<Question>()

    private val _answer = MutableLiveData<Boolean>()

    fun getLiveQueestion(): LiveData<Question> = _question

    fun getLiveAnswer(): LiveData<Boolean> = _answer

    fun getQuestion(){
        getQuestionUseCase.getQuestion(quetionNumber = question_count).let {
            _question.value = it
        }

    }

    fun getNextQuestion(){
        question_count +=1
        getQuestionUseCase.getQuestion(quetionNumber = question_count).let {
            _question.value = it
        }


    }

    fun getAnswer( buttonNumber: Int){

        getAnswerUseCase.getAnswer(buttonNumber = buttonNumber, questionNumber = question_count).let {
            _answer.value = it
            if(it){
                right_answer +=1
            }
        }
    }

    fun getAnswerBoolean(buttonNumber: Int): Boolean {

        val result = getAnswerUseCase.getAnswer(buttonNumber = buttonNumber, questionNumber = question_count)
        if (result){
            right_answer +=1
        }
        return result

    }

    fun getRightAnswer(): Int = right_answer
}