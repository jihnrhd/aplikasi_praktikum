package com.jihan_18102091.praktikum14.`interface`

import com.jihan_18102091.praktikum14.model.Login
import com.jihan_18102091.praktikum14.model.Quote

interface MainView {
    fun showMessage(messsage : String)
    fun resultQuote(data: ArrayList<Quote>)
    fun resultLogin(data: Login)
}