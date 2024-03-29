package com.example.marsphotos.network
import com.example.marsphotos.model.MarsPhoto
import com.example.marsphotos.model.Student
import retrofit2.http.GET

interface StudentApiService {
    /**
     * Returns a [List] of [MarsPhoto] and this method can be called from a Coroutine.
     * The @GET annotation indicates that the "photos" endpoint will be requested with the GET
     * HTTP method
     */
    @GET("students")
    suspend fun getStudents(): List<Student>
}