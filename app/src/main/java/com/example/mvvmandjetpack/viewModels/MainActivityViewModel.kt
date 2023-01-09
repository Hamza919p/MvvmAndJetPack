package com.example.mvvmandjetpack.viewModels

import android.util.Log
import android.widget.Toast
import androidx.lifecycle.*
import com.example.jetpacksampleproject.models.EmployeesParent
import com.example.mvvmandjetpack.interfaces.ApiCallBack
import com.example.mvvmandjetpack.models.dummyModel.DummyParent
import com.example.mvvmandjetpack.models.login.LoginResponse
import com.example.mvvmandjetpack.respository.EmployeesRepository
import com.example.mvvmandjetpack.respository.LoginRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivityViewModel : ViewModel() {

    private var mutableLiveDouble = MutableLiveData<DummyParent>()

    val employeesList: LiveData<DummyParent>
    get() = mutableLiveDouble

    fun getEmployees() {
        viewModelScope.launch(Dispatchers.Main) {
            if( EmployeesRepository().getEmployeesData() != null) {
                mutableLiveDouble.value = EmployeesRepository().getEmployeesData()
            }else{
                Log.d("Response::", "429")
            }
        }
    }






























    var userNumber = "+923008441266"
    var userPassword = "123456789"
    lateinit var apiCallBack:ApiCallBack
    var mediatorLiveData: MediatorLiveData<LoginResponse> ?= null



    fun onLoginBtnClick() {
        if (validate()) {
            viewModelScope.launch(Dispatchers.IO){
                LoginRepository().getLoginResponse(userNumber!!, userPassword!!,apiCallBack)
            }
        }
    }

    private fun validate(): Boolean {
        if (userNumber == "" || userNumber == null) {
            return false
        } else if (userPassword == "" || userNumber == null) {
            return false
        }
        return true
    }

}