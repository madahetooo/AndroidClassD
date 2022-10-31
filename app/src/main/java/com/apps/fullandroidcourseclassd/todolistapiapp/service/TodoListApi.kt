package com.apps.fullandroidcourseclassd.todolistapiapp.service

import com.apps.fullandroidcourseclassd.todolistapiapp.model.TodoListApiData
import retrofit2.Response
import retrofit2.http.GET

interface TodoListApi {

    @GET("/todos")
   suspend fun getTodos() : Response<List<TodoListApiData>>

}