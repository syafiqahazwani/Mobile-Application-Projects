package com.example.fasstweatherapp.ViewModel

import androidx.lifecycle.ViewModel
import com.example.fasstweatherapp.Repository.WeatherRepository
import com.example.fasstweatherapp.Server.ApiClient
import com.example.fasstweatherapp.Server.ApiServices

class WeatherViewModel(val repository: WeatherRepository) : ViewModel() {

    constructor() : this(WeatherRepository(ApiClient().getClient().create(ApiServices::class.java)))

    fun loadCurrentWeather(lat:Double,lng:Double,unit:String)=
        repository.getCurrentWeather(lat,lng,unit)

    fun loadForecastWeather(lat:Double,lng:Double,unit:String)=
        repository.getForecastWeather(lat,lng,unit)
}