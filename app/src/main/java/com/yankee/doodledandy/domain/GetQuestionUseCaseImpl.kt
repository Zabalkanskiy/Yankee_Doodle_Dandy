package com.yankee.doodledandy.domain

import com.yankee.doodledandy.data.Repository
import com.yankee.doodledandy.sourceModel.Question

class GetQuestionUseCaseImpl(private val repository: Repository) : GetQuestionUseCase {
    override fun getQuestion(quetionNumber: Int): Question {
       return repository.getQuestion(questionNumber = quetionNumber)
    }
}