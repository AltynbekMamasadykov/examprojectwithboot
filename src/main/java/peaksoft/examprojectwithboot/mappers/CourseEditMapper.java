package peaksoft.examprojectwithboot.mappers;

import org.springframework.stereotype.Component;
import peaksoft.examprojectwithboot.dto.requests.CourseRequest;
import peaksoft.examprojectwithboot.entities.Course;

@Component
public class CourseEditMapper {

    public Course createCourse(CourseRequest courseRequest){
        if (courseRequest == null){
            return null;
        }
        Course course = new Course();
        course.setCourseName(courseRequest.getCourseName());
        course.setDuration(courseRequest.getDuration());
        course.setCompany(courseRequest.getCompany());
        return course;
    }

    public void update(CourseRequest courseRequest, Course course) {
        course.setCourseName(courseRequest.getCourseName());
        course.setDuration(courseRequest.getDuration());
        course.setCompany(courseRequest.getCompany());
    }
}
