package com.plcoding.graphqlcountriesapp.di

import com.apollographql.apollo3.ApolloClient
import com.plcoding.graphqlcountriesapp.data.ApolloCountryClient
import com.plcoding.graphqlcountriesapp.domain.CountryClient
import com.plcoding.graphqlcountriesapp.domain.GetCountriesUseCase
import com.plcoding.graphqlcountriesapp.domain.GetCountryUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

/**
 * Created by davidgonzalez on 26/12/23
 */
@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideApolloClient(): ApolloClient {
        return ApolloClient.Builder()
            .serverUrl("https://countries.trevorblades.com/graphql")
            .build()
    }

    @Provides
    @Singleton
    fun providesCountryClient(apolloClient: ApolloClient): CountryClient {
        return ApolloCountryClient(apolloClient)
    }

    @Provides
    @Singleton
    fun providesGetCountriesUseCase(countryClient: CountryClient): GetCountriesUseCase {
        return GetCountriesUseCase(countryClient)
    }

    @Provides
    @Singleton
    fun providesGetCountryUseCase(countryClient: CountryClient): GetCountryUseCase {
        return GetCountryUseCase(countryClient)
    }
}