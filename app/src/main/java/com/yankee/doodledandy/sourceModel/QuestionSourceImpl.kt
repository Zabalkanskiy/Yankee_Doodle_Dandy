package com.yankee.doodledandy.sourceModel

import com.yankee.doodledandy.R

class QuestionSourceImpl : QuestionSource {

    override fun getQuestionList(): List<Question>{
        return listOf(
            Question(
                questionText = "Who was the first chief justice of the United States?",
                firstText = "John Jay",
                secondText = "Charles Evans Hughes",
                thirdText = "William Howard Taft",
                fourText = "Earl Warren",
                answer = "John Jay",
                resImage = R.drawable.john_jay_1
            ),
            Question(
                questionText = "Which American city was historically known as New Amsterdam?",
                firstText = "Boulder City",
                secondText = "New York City",
                thirdText = "Salt Lake City",
                fourText = "Brigham City",
                answer = "New York City",
                resImage = R.drawable.new_amsterdam_2
            ),
            Question(
                questionText = "In which state is the Painted Desert located?",
                firstText = "Nevada",
                secondText = "Kansas",
                thirdText = "Arizona",
                fourText = "California",
                answer = "Arizona",
                resImage = R.drawable.painted_desert_3
            ),
            Question(
                questionText = "Who appoints the director of the Federal Bureau of Investigation?",
                firstText = "the U.S. vice president",
                secondText = "the U.S. president",
                thirdText = "the chief of staff",
                fourText = "the chief justice",
                answer = "the U.S. president",
                resImage = R.drawable.federal_bureau_4
            ),
            Question(
                questionText = "Which American city's nickname is \"Iron City\"?",
                firstText = "Houston",
                secondText = "Baltimore",
                thirdText = "Pittsburgh",
                fourText = "Chicago",
                answer = "Pittsburgh",
                resImage = R.drawable.iron_city_5
            ),
            Question(
                questionText = "Which of these monuments is located in South Dakota?",
                firstText = "Martin Luther King, Jr. National Memorial",
                secondText = "Marine Corps War Memorial",
                thirdText = "Mount Rushmore National Memorial",
                fourText = "Montezuma Castle National Monument",
                answer = "Mount Rushmore National Memorial",
                resImage = R.drawable.mountrushmore_6
            ),
            Question(
                questionText = "On which river is Washington, D.C., situated?",
                firstText = "Cuyahoga River",
                secondText = "Hudson River",
                thirdText = "Ohio River",
                fourText = "Potomac River",
                answer = "Potomac River",
                resImage = R.drawable.potomac_7
            ),
            Question(
                questionText = "In which American city was the world’s first domed air-conditioned indoor stadium built?",
                firstText = "Houston",
                secondText = "Chicago",
                thirdText = "Denver",
                fourText = "Philadelphia",
                answer = "Houston",
                resImage = R.drawable.houston_8
            ),
            Question(
                questionText = "Which university was founded as King’s College in 1754?",
                firstText = "Stanford University",
                secondText = "Princeton University",
                thirdText = "Columbia University",
                fourText = "Brown University",
                answer = "Columbia University",
                resImage = R.drawable.columbia_9
            ),
            Question(
                questionText = "What is the smallest state by area in the United States?",
                firstText = "Delaware",
                secondText = "Hawaii",
                thirdText = "Rhode island",
                fourText = "Connecticut",
                answer = "Rhode island",
                resImage = R.drawable.rhode_10
            ),
            Question(
                questionText = "Which of these is not an American national park?",
                firstText = "Disneyland",
                secondText = "Yellowstone",
                thirdText = "Yosemite",
                fourText = "Grand Canyon",
                answer = "Disneyland",
                resImage = R.drawable.disneyland_11
            ),
            Question(
                questionText = "What is the largest man-made reservoir in the United States?",
                firstText = "Bull Shoals Lake",
                secondText = "Table Rock Lake",
                thirdText = "Lake Mead",
                fourText = "Lake Francis Case",
                answer = "Lake Mead",
                resImage = R.drawable.lake_mead_12
            ),
            Question(
                questionText = "In which American city is the Miss America Pageant held annually?",
                firstText = "Kansas City",
                secondText = "New York City",
                thirdText = "Los Angeles",
                fourText = "Atlantic City",
                answer = "Atlantic City",
                resImage = R.drawable.atlantic_13
            ),
            Question(
                questionText = "How many states are there in the United States of America?",
                firstText = "10",
                secondText = "49",
                thirdText = "50",
                fourText = "72",
                answer = "50",
                resImage = R.drawable.states_14
            ),
            Question(
                questionText = "In which state would you find the Everglades?",
                firstText = "Colorado",
                secondText = "Florida",
                thirdText = "Alaska",
                fourText = "Texas",
                answer = "Florida",
                resImage = R.drawable.everglades_15
            ),
            Question(
                questionText = "If you are visiting Death Valley, in which U.S. state will you be?",
                firstText = "Nevada",
                secondText = "California",
                thirdText = "Colorado",
                fourText = "New Mexico",
                answer = "California",
                resImage = R.drawable.death_valley_16
            ),
            Question(
                questionText = "Who designed the most famous Uncle Sam \"I Want You\" poster?",
                firstText = "James Montgomery Flagg",
                secondText = "Charles Dana Gibson",
                thirdText = "Thomas Nast",
                fourText = "Howard Chandler Christy",
                answer = "James Montgomery Flagg",
                resImage = R.drawable.uncle_sam_17
            ),
            Question(
                questionText = "In what year was the New York Stock Exchange created?",
                firstText = "1817",
                secondText = "1928",
                thirdText = "1909",
                fourText = "1875",
                answer = "1817",
                resImage = R.drawable.stock_exchange_18
            ),
            Question(
                questionText = "Which river is considered the \"Lifeline of the Southwest\"?",
                firstText = "Ohio River",
                secondText = "Columbia River",
                thirdText = "Snake River",
                fourText = "Colorado River",
                answer = "Colorado River",
                resImage = R.drawable.colorado_19,

            ),
            Question(
                questionText = "Which famous sculptor created the Statue of Liberty?",
                firstText = "Frédéric-Auguste Bartholdi",
                secondText = "Constantin Brancusi",
                thirdText = "Hiram Powers",
                fourText = "Auguste Rodin",
                answer = "Frédéric-Auguste Bartholdi",
                resImage = R.drawable.staue_liberty_20,
                islast = true
            )
        )
    }
}