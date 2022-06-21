package peaksoft.examprojectwithboot.apiControllers;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import peaksoft.examprojectwithboot.dto.requests.TeacherRequest;
import peaksoft.examprojectwithboot.dto.responses.TeacherResponse;
import peaksoft.examprojectwithboot.services.TeacherService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/teacher")

public class TeacherApi {
    private final TeacherService teacherService;

    @GetMapping
    public List<TeacherResponse> getAllTeachers(){
        return teacherService.getAllTeachers();
    }

    @PostMapping
    public TeacherResponse create(@RequestBody TeacherRequest teacherRequest){
        return teacherService.create(teacherRequest);
    }

    @GetMapping("{id}")
    public TeacherResponse findById(@PathVariable Long id){
        return teacherService.findById(id);
    }

    @PutMapping("{id}")
    public TeacherResponse update(@PathVariable Long id, @RequestBody TeacherRequest teacherRequest){
        return teacherService.update(id,teacherRequest);
    }

    @DeleteMapping("{id}")
    public TeacherResponse delete(@PathVariable Long id){
        return teacherService.deleteById(id);
    }

}
