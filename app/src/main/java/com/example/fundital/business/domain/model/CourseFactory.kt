package com.example.fundital.business.domain.model
import com.example.fundital.business.domain.util.DateUtil
import org.openjdk.tools.javac.resources.CompilerProperties.Notes
import java.util.UUID
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class CourseFactory
@Inject
constructor(
    private val dateUtil : DateUtil
){
    /*Create a new course*/
    fun CreateCourse(
          title : String,
          description : String,
          prerequisites : String,
          ownerId : String,
          institution : String,
          date_created : String

    ):Course{
        return Course(
            id = UUID.randomUUID().toString(),
            title =title,
            description = description ,
            prerequisites =prerequisites,
            ownerId = ownerId ,
            institution = institution,
            date_created = dateUtil.getCurrentTimeStamp()
        )
    }

    /*create a course list for testing and shit(Not for Production)*/
    fun createCoursesList(numOfCourses :Int):List<Course>{
        val list : ArrayList<Course> = ArrayList()
        for (i in 0 until numOfCourses){
            list.add(
                CreateCourse(
                    title = UUID.randomUUID().toString(),
                    description = UUID.randomUUID().toString(),
                    prerequisites = UUID.randomUUID().toString(),
                    ownerId =UUID.randomUUID().toString(),
                    institution = "Institution" ,
                    date_created =  dateUtil.getCurrentTimeStamp()
                )
            )
        }

        return list
    }

}