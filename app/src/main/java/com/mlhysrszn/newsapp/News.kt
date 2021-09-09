package com.mlhysrszn.newsapp

import java.io.Serializable

data class News(
    val newsImg: Int,
    val newsName: String,
    val newsDetail: String
) : Serializable
