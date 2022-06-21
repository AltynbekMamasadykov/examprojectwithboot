package peaksoft.examprojectwithboot.apiControllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import peaksoft.examprojectwithboot.dto.requests.CourseRequest;
import peaksoft.examprojectwithboot.dto.responses.CourseResponse;
import peaksoft.examprojectwithboot.services.CourseService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/course")

public class CourseApi {
    private final CourseService courseService;



    @PostMapping
    public CourseResponse create(@RequestBody CourseRequest courseRequest){
        return courseService.create(courseRequest);
    }

    @GetMapping
    public List<CourseResponse> getAllCourses(){
        return courseService.getAllCourses();
    }

    @GetMapping("{id}")
    public CourseResponse findById(@PathVariable Long id){
        return  courseService.findById(id);
    }

    @PutMapping("{id}")
    public CourseResponse update(@PathVariable Long id, @RequestBody CourseRequest courseRequest){
        return courseService.update(courseRequest,id);
    }

    @DeleteMapping("{id}")
    public CourseResponse delete(@PathVariable Long id){
        return courseService.delete(id);
    }
}
