package com.plcoding.graphqlcountriesapp.domain

/**
 * Created by davidgonzalez on 26/12/23
 */
class GetCountryUseCase(private val countryClient: CountryClient) {
    suspend fun execute(code: String): DetailedCountry? {
        return countryClient.getCountry(code)
    }
}