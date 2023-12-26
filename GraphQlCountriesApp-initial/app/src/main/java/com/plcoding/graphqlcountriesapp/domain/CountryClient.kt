package com.plcoding.graphqlcountriesapp.domain


/**
 * Created by davidgonzalez on 26/12/23
 */
interface CountryClient {
    suspend fun getCountries(): List<SimpleCountry>
    suspend fun getCountry(code: String): DetailedCountry?
}