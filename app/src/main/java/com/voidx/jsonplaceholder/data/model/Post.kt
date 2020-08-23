package com.voidx.jsonplaceholder.data.model

import com.google.gson.annotations.SerializedName

data class Post(

    @SerializedName("id")
    val id: Int,

    @SerializedName("title")
    val title: String,

    @SerializedName("body")
    val body: String

)