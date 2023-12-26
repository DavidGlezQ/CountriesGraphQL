package com.plcoding.graphqlcountriesapp.domain

/**
 * Created by davidgonzalez on 26/12/23
 */
data class DetailedCountry(
    val code: String,
    val name: String,
    val emoji: String,
    val capital: String,
    val currency: String,
    val languages: List<String>,
    val continent: String
)
