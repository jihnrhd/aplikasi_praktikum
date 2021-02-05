package com.jihan_18102091.praktikum10.data

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Quote(
    var id: Int = 0,
    var title: String? = null,
    var nama: String? = null,
    var description: String? = null,
    var category: String? = null,
    var tag: String? = null,
    var date: String? = null
) : Parcelable