package com.yankee.doodledandy.domain

import com.yankee.doodledandy.data.Repository

class GetAnswerUseCaseImpl(private val repository: Repository) : GetAnswerUseCase {

    override fun getAnswer(buttonNumber: Int, questionNumber: Int): Boolean {
        val field = when(buttonNumber){
            1 -> repository.getQuestion(questionNumber).firstText
            2 -> repository.getQuestion(questionNumber).secondText
            3 -> repository.getQuestion(questionNumber).thirdText
            4 -> repository.getQuestion(questionNumber).fourText
            else -> ""
        }
     return   repository.getQuestion(questionNumber).answer == field
    }

}