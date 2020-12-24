package com.jihan_18102091.praktikum9.preferences

import android.content.Context
import com.jihan_18102091.praktikum9.data.SettingModel

    internal class SettingPreference(context: Context) {
        companion object {
            private const val PREFS_NAME = "setting_pref" 
            private const val NAME = "name" 
            private const val EMAIL = "email" 
            private const val AGE = "age"
            private const val PHONE_NUMBER = "phone"
            private const val SIFAT = "sifat"
            private const val ALAMAT = "alamat"
            private const val THEME = "theme"
        }
        private val preferences = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
        fun setSetting(value: SettingModel) {
            val editor = preferences.edit()
            editor.putString(NAME, value.name)
            editor.putString(EMAIL, value.email)
            editor.putInt(AGE, value.age)
            editor.putString(PHONE_NUMBER, value.phoneNumber)
            editor.putString(SIFAT, value.sifat)
            editor.putString(ALAMAT, value.alamat)
            editor.putBoolean(THEME, value.isDarkTheme)
            editor.apply()
        }
        fun getSetting(): SettingModel {
            val model = SettingModel()
            model.name = preferences.getString(NAME, "")
            model.email = preferences.getString(EMAIL, "")
            model.age = preferences.getInt(AGE, 0)
            model.phoneNumber = preferences.getString(PHONE_NUMBER, "")
            model.sifat = preferences.getString(SIFAT, "")
            model.alamat = preferences.getString(ALAMAT, "")
            model.isDarkTheme = preferences.getBoolean(THEME, false)
            return model }
    }
