package com.example.marsphotos.data

import com.example.marsphotos.model.MarsPhoto
import com.example.marsphotos.model.Student
import com.example.marsphotos.network.MarsApiService
import com.example.marsphotos.network.StudentApiService

interface StudentRepository {
    //getter
    suspend fun getStudents(): List<Student>
}

//class NetworkStudentRepository(
//    private val studentApiService: StudentApiService) : StudentApiService {
//    override suspend fun getStudents(): List<Student> = studentApiService.getStudents()
//
//}
class NetworkStudentRepository(private val studentApiService: StudentApiService):StudentRepository {
    override suspend fun getStudents(): List<Student> = studentApiService.getStudents()

}