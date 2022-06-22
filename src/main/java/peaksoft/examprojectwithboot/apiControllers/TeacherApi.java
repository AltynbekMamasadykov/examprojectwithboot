package peaksoft.examprojectwithboot.apiControllers;


import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import peaksoft.examprojectwithboot.dto.requests.TeacherRequest;
import peaksoft.examprojectwithboot.dto.responses.TeacherResponse;
import peaksoft.examprojectwithboot.services.TeacherService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@PreAuthorize("hasAuthority('SUPER_ADMIN')")
@RequestMapping("api/teachers")

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

    @GetMapping("find/{id}")
    public TeacherResponse findById(@PathVariable Long id){
        return teacherService.findById(id);
    }

    @PutMapping("update/{id}")
    public TeacherResponse update(@PathVariable Long id, @RequestBody TeacherRequest teacherRequest){
        return teacherService.update(id,teacherRequest);
    }

    @DeleteMapping("delete/{id}")
    public TeacherResponse delete(@PathVariable Long id){
        return teacherService.deleteById(id);
    }

}
