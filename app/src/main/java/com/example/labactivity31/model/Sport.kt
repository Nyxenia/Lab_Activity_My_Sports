package com.example.labactivity31.model

import java.io.Serializable

data class Sport(
    val id: String,
    val name: String,
    val category: String,
    val iconResId: Int,
    val shortDescription: String,
    val fullDescription: String,
    val rules: String,
    val popularLeagues: String,
    val topTeams: String,
    val isFavorite: Boolean = true
) : Serializable
