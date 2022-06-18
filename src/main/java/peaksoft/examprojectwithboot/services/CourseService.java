package peaksoft.examprojectwithboot.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import peaksoft.examprojectwithboot.dto.requests.CourseRequest;
import peaksoft.examprojectwithboot.dto.responses.CourseResponse;
import peaksoft.examprojectwithboot.entities.Course;
import peaksoft.examprojectwithboot.mappers.CourseEditMapper;
import peaksoft.examprojectwithboot.mappers.CourseViewMapper;
import peaksoft.examprojectwithboot.repositories.CourseRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CourseService {

    private final CourseRepository courseRepository;
    private final CourseEditMapper courseEditMapper;
    private final CourseViewMapper courseViewMapper;

    public CourseResponse create(CourseRequest courseRequest){
        Course course = courseEditMapper.createCourse(courseRequest);
        courseRepository.save(course);
        return courseViewMapper.viewCourse(course);
    }

    public List<CourseResponse> getAllCourses(){
        return courseViewMapper.viewAll(courseRepository.findAll());
    }

    public CourseResponse findById(Long id) {
        Course course = courseRepository.findById(id).get();
        return courseViewMapper.viewCourse(course);
    }

    public CourseResponse update(CourseRequest courseRequest, Long id) {
        Course course = courseRepository.findById(id).get();
        courseEditMapper.update(courseRequest,course);
        return courseViewMapper.viewCourse(courseRepository.save(course));

    }
}
