package peaksoft.examprojectwithboot.mappers;

import org.springframework.stereotype.Component;
import peaksoft.examprojectwithboot.dto.requests.TeacherRequest;
import peaksoft.examprojectwithboot.dto.responses.TeacherResponse;
import peaksoft.examprojectwithboot.entities.Teacher;

import java.util.ArrayList;
import java.util.List;

@Component
public class TeacherMapper {

    public TeacherResponse viewTeacher(Teacher teacher){
        TeacherResponse teacherResponse = new TeacherResponse();
        teacherResponse.setId(teacher.getId());
        teacherResponse.setFirstName(teacher.getFirstName());
        teacherResponse.setLastName(teacher.getLastName());
        teacherResponse.setEmail(teacher.getEmail());
        teacherResponse.setCourse(teacher.getCourse());
        return teacherResponse;
    }

    public List<TeacherResponse> viewAllTeachers(List<Teacher> teachers) {
        List<TeacherResponse> teacherResponses = new ArrayList<>();
        for (Teacher teacher:teachers) {
            teacherResponses.add(viewTeacher(teacher));
        }
        return teacherResponses;
    }

    public Teacher createTeacher(TeacherRequest teacherRequest){
        Teacher teacher = new Teacher();
        teacher.setFirstName(teacherRequest.getFirstName());
        teacher.setLastName(teacherRequest.getLastName());
        teacher.setEmail(teacherRequest.getEmail());
        teacher.setCourse(teacherRequest.getCourse());
        return teacher;
    }

    public void update(Teacher teacher, TeacherRequest teacherRequest) {
        teacher.setFirstName(teacherRequest.getFirstName());
        teacher.setLastName(teacherRequest.getLastName());
        teacher.setEmail(teacherRequest.getEmail());
        teacher.setCourse(teacherRequest.getCourse());
    }

}
