package peaksoft.examprojectwithboot.mappers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import peaksoft.examprojectwithboot.dto.requests.StudentRequest;
import peaksoft.examprojectwithboot.dto.responses.StudentResponce;
import peaksoft.examprojectwithboot.entities.Student;
import peaksoft.examprojectwithboot.repositories.StudentRepository;

import java.util.ArrayList;
import java.util.List;

@Component
@RequiredArgsConstructor

public class StudentMapper {

    public StudentResponce viewStudent(Student student){
        StudentResponce studentResponce = new StudentResponce();
        studentResponce.setId(student.getId());
        studentResponce.setFirstName(student.getFirstName());
        studentResponce.setLastName(student.getLastName());
        studentResponce.setEmail(student.getEmail());
        studentResponce.setStudyFormat(student.getStudyFormat());
        return studentResponce;
    }

    public Student create(StudentRequest studentRequest){
        Student student = new Student();
        student.setFirstName(studentRequest.getFirstName());
        student.setLastName(studentRequest.getLastName());
        student.setEmail(studentRequest.getEmail());
        student.setStudyFormat(studentRequest.getStudyFormat());
        return student;
    }

    public List<StudentResponce> getAllStudents(List<Student> students){
        List<StudentResponce> studentResponces = new ArrayList<>();
        for (Student student:students) {
            studentResponces.add(viewStudent(student));
        }
        return studentResponces;
    }

    public void update(Student student, StudentRequest studentRequest) {
        student.setFirstName(studentRequest.getFirstName());
        student.setLastName(studentRequest.getLastName());
        student.setEmail(studentRequest.getEmail());
        student.setStudyFormat(studentRequest.getStudyFormat());
    }


}
