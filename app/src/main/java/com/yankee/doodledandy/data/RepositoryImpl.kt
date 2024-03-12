package com.yankee.doodledandy.data

import com.yankee.doodledandy.sourceModel.Question
import com.yankee.doodledandy.sourceModel.QuestionSource

class RepositoryImpl(private val questionSource: QuestionSource) : Repository {
    override fun getQuestion(questionNumber: Int): Question {
        return questionSource.getQuestionList().get(questionNumber)
    }


}