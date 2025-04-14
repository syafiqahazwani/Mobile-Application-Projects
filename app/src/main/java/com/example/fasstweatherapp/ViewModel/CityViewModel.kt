package com.example.fasstweatherapp.ViewModel

import androidx.lifecycle.ViewModel
import com.example.fasstweatherapp.Repository.CityRepository
import com.example.fasstweatherapp.Server.ApiClient
import com.example.fasstweatherapp.Server.ApiServices
import retrofit2.create

class CityViewModel(val repository: CityRepository) : ViewModel() {

    constructor() : this(CityRepository(ApiClient().getClient().create(ApiServices::class.java)))

    fun loadCity(q: String, limit: Int) =
        repository.getCities(q, limit)
}