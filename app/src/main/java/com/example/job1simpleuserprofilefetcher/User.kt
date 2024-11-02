package com.example.job1simpleuserprofilefetcher

data class Address(
    val street: String,
    val city: String
)

data class User(
    val name: String,
    val username: String,
    val email: String,
    val phone: String,
    val address: Address
)

