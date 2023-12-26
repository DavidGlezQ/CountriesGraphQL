package com.plcoding.graphqlcountriesapp.domain

/**
 * Created by davidgonzalez on 26/12/23
 */
class GetCountriesUseCase(private val countryClient: CountryClient) {
    suspend fun execute(): List<SimpleCountry> {
        return countryClient
            .getCountries()
            .sortedBy { it.name }
    }
}