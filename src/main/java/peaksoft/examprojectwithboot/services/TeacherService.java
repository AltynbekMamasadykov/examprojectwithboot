package peaksoft.examprojectwithboot.services;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import peaksoft.examprojectwithboot.dto.requests.TeacherRequest;
import peaksoft.examprojectwithboot.dto.responses.TeacherResponse;
import peaksoft.examprojectwithboot.entities.Student;
import peaksoft.examprojectwithboot.entities.Teacher;
import peaksoft.examprojectwithboot.exceptions.NotFoundException;
import peaksoft.examprojectwithboot.mappers.TeacherMapper;
import peaksoft.examprojectwithboot.repositories.TeacherRepository;

import java.util.List;

@Service
@RequiredArgsConstructor

public class TeacherService {

    private final TeacherMapper teacherMapper;
    private final TeacherRepository teacherRepository;

    public List<TeacherResponse> getAllTeachers() {
        return teacherMapper.viewAllTeachers(teacherRepository.findAll());
    }

    public TeacherResponse create(TeacherRequest teacherRequest) {
        Teacher teacher = teacherMapper.createTeacher(teacherRequest);
        teacherRepository.save(teacher);
        return teacherMapper.viewTeacher(teacher);
    }

    private Teacher getTeacherById(Long id){
        return teacherRepository.findById(id).orElseThrow(
                ()-> new NotFoundException(
                        "Not found with id "+id
                )
        );
    }

    public TeacherResponse findById(Long id) {
        Teacher teacher = getTeacherById(id);
        return teacherMapper.viewTeacher(teacher);
    }


    public TeacherResponse update(Long id, TeacherRequest teacherRequest) {
        Teacher teacher = getTeacherById(id);
        teacherMapper.update(teacher,teacherRequest);
        return teacherMapper.viewTeacher(teacherRepository.save(teacher));
    }

    public TeacherResponse deleteById(Long id) {
        Teacher teacher = getTeacherById(id);
        teacherRepository.delete(teacher);
        return teacherMapper.viewTeacher(teacher);
    }
}
