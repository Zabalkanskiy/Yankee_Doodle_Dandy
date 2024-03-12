package com.yankee

import android.app.Application
import com.yankee.doodledandy.data.Repository
import com.yankee.doodledandy.data.RepositoryImpl
import com.yankee.doodledandy.domain.GetAnswerUseCase
import com.yankee.doodledandy.domain.GetAnswerUseCaseImpl
import com.yankee.doodledandy.domain.GetQuestionUseCase
import com.yankee.doodledandy.domain.GetQuestionUseCaseImpl
import com.yankee.doodledandy.presentation.presener.QuestionViewModel
import com.yankee.doodledandy.sourceModel.QuestionSource
import com.yankee.doodledandy.sourceModel.QuestionSourceImpl
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.context.startKoin
import org.koin.dsl.module

class YankeeApp: Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin{
            androidContext(this@YankeeApp)
            modules(appModule)
        }
    }
}

val appModule = module {
    single<QuestionSource> { QuestionSourceImpl()  }
    single<Repository> { RepositoryImpl(get()) }
    single<GetQuestionUseCase> {GetQuestionUseCaseImpl(get())}
    single<GetAnswerUseCase> {GetAnswerUseCaseImpl(get())}
    viewModel {QuestionViewModel(get(), get())}
}