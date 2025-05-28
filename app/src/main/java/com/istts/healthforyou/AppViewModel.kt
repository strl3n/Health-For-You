package com.istts.healthforyou

import android.content.Context
import android.content.Intent
import android.widget.Toast
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.navigation.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.coroutines.launch

class AppViewModel : ViewModel() {


    fun registerUser(newData: EntityUser, context: Context) {
        viewModelScope.launch {
            var retvalue = App.retrofitService.registerUser(newData)

            if(retvalue.status == 200) {
                Toast.makeText(context, "Register User Sukses", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(context, retvalue.message, Toast.LENGTH_SHORT).show()
            }
        }
    }

    fun loginUser(data: EntityUser, context: Context) {
        viewModelScope.launch {
            buka fragment Mainfragment dari sini
            
//            var retvalue = App.retrofitService.loginUser(data)
//            if(retvalue.status == 200) {
//                Toast.makeText(context, "Login User Sukses", Toast.LENGTH_SHORT).show()
//                context.openFragment("mainfragment")
//            } else {
//                Toast.makeText(context, retvalue.message, Toast.LENGTH_SHORT).show()
//            }
        }
    }
}