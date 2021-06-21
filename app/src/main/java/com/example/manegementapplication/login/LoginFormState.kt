package com.example.manegementapplication.ui.login

/**
 * Data validation state of the login form.
 */
data class LoginFormState(
    val idError: Int? = null,
    val pwError: Int? = null,
    val isDataValid: Boolean = false
)