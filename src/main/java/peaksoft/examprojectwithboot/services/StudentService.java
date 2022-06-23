package peaksoft.examprojectwithboot.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import peaksoft.examprojectwithboot.dto.requests.StudentRequest;
import peaksoft.examprojectwithboot.dto.responses.StudentResponce;
import peaksoft.examprojectwithboot.entities.Student;
import peaksoft.examprojectwithboot.exceptions.NotFoundException;
import peaksoft.examprojectwithboot.mappers.StudentMapper;
import peaksoft.examprojectwithboot.repositories.StudentRepository;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor

public class StudentService {

    private final StudentMapper studentMapper;
    private final StudentRepository studentRepository;

    public StudentResponce create(StudentRequest studentRequest) {
        Student student = studentMapper.create(studentRequest);
        studentRepository.save(student);
        return studentMapper.viewStudent(student);

    }

    public List<StudentResponce> getAllStudents() {
        return studentMapper.getAllStudents(studentRepository.findAll());
    }

    private Student getStudentById(Long id){
        return studentRepository.findById(id).orElseThrow(
                ()-> new NotFoundException(
                        "Not Found with id " +id
                )
        );
    }

    public StudentResponce findById(Long id) {
        Student student = getStudentById(id);
        return studentMapper.viewStudent(student);
    }

    public StudentResponce update(Long id, StudentRequest studentRequest) {
        Student student = getStudentById(id);
        studentMapper.update(student,studentRequest);
        return studentMapper.viewStudent(studentRepository.save(student));

    }

    public StudentResponce delete(Long id) {
        Student student = getStudentById(id);
        studentRepository.delete(student);
        return studentMapper.viewStudent(student);
    }
}
