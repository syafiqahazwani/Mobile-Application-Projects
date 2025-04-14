package com.example.fasstweatherapp.Repository

import com.example.fasstweatherapp.Server.ApiServices

class WeatherRepository(val api:ApiServices) {

    fun getCurrentWeather(lat: Double,lng:Double,unit:String)=
        api.getCurrentWeather(lat,lng,unit,"58c9a2fa3cc4c3682a642592ed273675")

    fun getForecastWeather(lat: Double,lng:Double,unit:String)=
        api.getForecastWeather(lat,lng,unit,"58c9a2fa3cc4c3682a642592ed273675")
}