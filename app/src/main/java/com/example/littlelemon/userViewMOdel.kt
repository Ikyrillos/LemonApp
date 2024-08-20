package com.example.littlelemon

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class UserViewModel : ViewModel() {
    // This would typically be backed by DataStore or SharedPreferences
    private val _user = MutableStateFlow(User())
    val user: StateFlow<User> get() = _user

    private val _menuItems = MutableStateFlow(sampleMenuItems)
    val menuItems: StateFlow<List<MenuItem>> get() = _menuItems

    fun saveUserDetails(firstName: String, lastName: String, email: String) {
        _user.value = User(firstName, lastName, email)
        // Here you would also save to DataStore or SharedPreferences
    }

    fun clearUserData() {
        _user.value = User()
        // Here you would clear DataStore or SharedPreferences
    }
}
