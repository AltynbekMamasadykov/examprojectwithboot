package peaksoft.examprojectwithboot.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import peaksoft.examprojectwithboot.dto.requests.CourseRequest;
import peaksoft.examprojectwithboot.dto.responses.CourseResponse;
import peaksoft.examprojectwithboot.entities.Course;
import peaksoft.examprojectwithboot.exceptions.NotFoundException;
import peaksoft.examprojectwithboot.mappers.CourseMapper;
import peaksoft.examprojectwithboot.repositories.CourseRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CourseService {

    private final CourseRepository courseRepository;
    private final CourseMapper courseMapper;

    public CourseResponse create(CourseRequest courseRequest){
        Course course = courseMapper.createCourse(courseRequest);
        courseRepository.save(course);
        return courseMapper.viewCourse(course);
    }

    public List<CourseResponse> getAllCourses(){
        return courseMapper.viewAll(courseRepository.findAll());
    }

    private Course getCourseById(Long id){
        return courseRepository.findById(id).orElseThrow(
                () -> new NotFoundException(
                        "Not Found with id " +id
                )
        );
    }


    public CourseResponse findById(Long id) {
        Course course = getCourseById(id);
        return courseMapper.viewCourse(course);
    }

    public CourseResponse update(CourseRequest courseRequest, Long id) {
        Course course = getCourseById(id);
        courseMapper.update(courseRequest,course);
        return courseMapper.viewCourse(courseRepository.save(course));

    }

    public CourseResponse delete(Long id) {
        Course course = getCourseById(id);
        courseRepository.delete(course);
        return courseMapper.viewCourse(course);
    }
}
