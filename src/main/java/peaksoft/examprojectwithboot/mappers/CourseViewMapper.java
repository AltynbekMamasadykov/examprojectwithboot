package peaksoft.examprojectwithboot.mappers;

import org.springframework.stereotype.Component;
import peaksoft.examprojectwithboot.dto.responses.CourseResponse;
import peaksoft.examprojectwithboot.entities.Course;

import java.util.ArrayList;
import java.util.List;

@Component
public class CourseViewMapper {

    public CourseResponse viewCourse(Course course){
        CourseResponse courseResponse = new CourseResponse();
        courseResponse.setId(course.getId());
        courseResponse.setCourseName(course.getCourseName());
        courseResponse.setDuration(course.getDuration());
        return courseResponse;
    }

    public List<CourseResponse> viewAll(List<Course> courses){
        List<CourseResponse> courseResponses = new ArrayList<>();
        for (Course course :  courses) {
            courseResponses.add(viewCourse(course));
        }
        return courseResponses;
    }
}
