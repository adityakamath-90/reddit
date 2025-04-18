package com.awesome.notes.di

import com.awesome.notes.Dispatcher
import com.awesome.notes.DispatcherType
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.SupervisorJob
import javax.inject.Qualifier

@Retention(AnnotationRetention.RUNTIME)
@Qualifier
annotation class ApplicationScope

//@Module
//@InstallIn(SingletonComponent::class)
internal object CoroutineScopesModule {
    //@Provides
    //@Singleton
    //@ApplicationScope
    fun providesCoroutineScope(
        @Dispatcher(DispatcherType.Default) dispatcher: CoroutineDispatcher,
    ): CoroutineScope = CoroutineScope(SupervisorJob() + dispatcher)
}