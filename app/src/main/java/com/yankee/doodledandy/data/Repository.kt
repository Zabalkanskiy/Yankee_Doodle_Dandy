package com.yankee.doodledandy.data

import com.yankee.doodledandy.sourceModel.Question

interface Repository {

    fun getQuestion(questionNumber: Int):Question


}