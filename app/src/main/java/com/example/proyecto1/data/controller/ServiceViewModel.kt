package com.example.proyecto1.data.controller

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.proyecto1.data.network.RetrofitClient
import kotlinx.coroutines.launch
import retrofit2.Response

class ServiceViewModel: ViewModel() {
    val api = RetrofitClient.api

    fun getServices(onResult: (Response<List<ServiceViewModel>>) -> Unit){
        viewModelScope.launch{
            try {
                val response = api.getServices()
                onResult(response)
            } catch (exception: Exception){
                print(exception)
            }
        }
    }
    fun showService(id: Int, onResult: (Response<ServiceViewModel>) -> Unit) {
        viewModelScope.launch {
            try {
                val response = api.getServices(id)
                onResult(response)
            } catch (exception: Exception){
                print(exception)
        }
    }

}