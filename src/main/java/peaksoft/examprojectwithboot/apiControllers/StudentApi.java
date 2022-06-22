package peaksoft.examprojectwithboot.apiControllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import peaksoft.examprojectwithboot.dto.requests.StudentRequest;
import peaksoft.examprojectwithboot.dto.responses.StudentResponce;
import peaksoft.examprojectwithboot.services.StudentService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/students")

public class StudentApi {

    private final StudentService studentService;

    @PostMapping
    public StudentResponce create(@RequestBody StudentRequest studentRequest) {
       return studentService.create(studentRequest);
    }

    @GetMapping
    public List<StudentResponce> getAllStudents(){
        return studentService.getAllStudents();
    }

    @GetMapping("find/{id}")
    public StudentResponce findById(@PathVariable Long id){
        return studentService.findById(id);
    }

   @PutMapping("update/{id}")
    public StudentResponce update(@PathVariable Long id,@RequestBody StudentRequest studentRequest){
        return studentService.update(id,studentRequest);
   }

   @DeleteMapping("delete/{id}")
    public StudentResponce delete(@PathVariable Long id){
        return studentService.delete(id);
   }

}
