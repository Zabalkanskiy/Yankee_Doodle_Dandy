package com.yankee.doodledandy.domain

interface GetAnswerUseCase {

    fun getAnswer(buttonNumber: Int, questionNumber: Int): Boolean
}