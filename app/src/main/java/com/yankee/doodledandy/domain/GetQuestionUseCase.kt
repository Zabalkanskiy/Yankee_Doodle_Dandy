package com.yankee.doodledandy.domain

import com.yankee.doodledandy.sourceModel.Question

interface GetQuestionUseCase {
    fun getQuestion(quetionNumber: Int): Question
}