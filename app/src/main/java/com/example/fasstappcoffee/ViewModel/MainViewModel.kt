package com.example.fasstappcoffee.ViewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.fasstappcoffee.Model.ItemsModel
import com.example.fasstappcoffee.Repository.MainRepository

class MainViewModel:ViewModel() {
    private val repository = MainRepository()

    fun loadFiltered(id:Int):LiveData<MutableList<ItemsModel>> {
        return repository.loadFiltered(id)
    }
}