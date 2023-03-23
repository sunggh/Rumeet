package com.d204.rumeet.data.di

import android.os.Build.VERSION_CODES.P
import com.d204.rumeet.data.remote.api.AuthApiService
import com.d204.rumeet.data.remote.api.UserApiService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Named
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
internal object ServiceModule {

    @Provides
    @Singleton
    fun providesAuthApiService(
        @Named("NoAuth") retrofit: Retrofit
    ) : AuthApiService {
        return retrofit.create(AuthApiService::class.java)
    }

    @Provides
    @Singleton
    fun providesUserApiService(
        @Named("Auth") retrofit: Retrofit
    ) : UserApiService{
        return retrofit.create(UserApiService::class.java)
    }
}