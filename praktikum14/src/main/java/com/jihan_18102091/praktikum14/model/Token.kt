package com.jihan_18102091.praktikum14

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Token (
        var token: String? = null
): Parcelable
