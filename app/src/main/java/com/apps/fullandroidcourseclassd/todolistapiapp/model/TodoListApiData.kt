package com.apps.fullandroidcourseclassd.todolistapiapp.model

data class TodoListApiData(
    val completed: Boolean,
    val id: Int,
    val title: String,
    val userId: Int
)