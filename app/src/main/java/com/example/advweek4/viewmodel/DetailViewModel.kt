package com.example.advweek4.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.advweek4.model.Student

class DetailViewModel : ViewModel (){
    val studentsLiveData = MutableLiveData<Student>()
    fun fetch() {
        studentsLiveData.value =  Student("16055","Nonie","1998/03/28","5718444778",
            "http://dummyimage.com/75x100.jpg/cc0000/ffffff")
    }

}