package peaksoft.examprojectwithboot.mappers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import peaksoft.examprojectwithboot.dto.requests.CourseRequest;
import peaksoft.examprojectwithboot.dto.responses.CourseResponse;
import peaksoft.examprojectwithboot.entities.Course;

import java.util.ArrayList;
import java.util.List;

@Component
@RequiredArgsConstructor
public class CourseMapper {

    public CourseResponse viewCourse(Course course){
        CourseResponse courseResponse = new CourseResponse();
        courseResponse.setId(course.getId());
        courseResponse.setCourseName(course.getCourseName());
        courseResponse.setDuration(course.getDuration());
        courseResponse.setCompany(course.getCompany());
        courseResponse.setGroups(course.getGroups());
        courseResponse.setTeacher(course.getTeacher());
        return courseResponse;
    }

    public List<CourseResponse> viewAll(List<Course> courses){
        List<CourseResponse> courseResponses = new ArrayList<>();
        for (Course course :  courses) {
            courseResponses.add(viewCourse(course));
        }
        return courseResponses;
    }


    public Course createCourse(CourseRequest courseRequest){
        if (courseRequest == null){
            return null;
        }
        Course course = new Course();
        course.setCourseName(courseRequest.getCourseName());
        course.setDuration(courseRequest.getDuration());
        course.setCompany(courseRequest.getCompany());
        course.setGroups(courseRequest.getGroups());
        course.setTeacher(courseRequest.getTeacher());
        return course;
    }

    public void update(CourseRequest courseRequest, Course course) {
        course.setCourseName(courseRequest.getCourseName());
        course.setDuration(courseRequest.getDuration());
        course.setCompany(courseRequest.getCompany());
        course.setGroups(courseRequest.getGroups());
        course.setTeacher(courseRequest.getTeacher());
    }
}
