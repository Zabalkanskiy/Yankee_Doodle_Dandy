package com.yankee.doodledandy.sourceModel

data class Question(
    val questionText: String,
    val firstText: String,
    val secondText: String,
    val thirdText: String,
    val fourText: String,
    val answer: String,
    val resImage: Int,
    val islast: Boolean = false

)