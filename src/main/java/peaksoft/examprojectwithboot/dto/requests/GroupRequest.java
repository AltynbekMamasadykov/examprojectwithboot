package peaksoft.examprojectwithboot.dto.requests;

import lombok.Getter;

import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import peaksoft.examprojectwithboot.entities.Course;
import peaksoft.examprojectwithboot.entities.Student;

import java.time.LocalDate;
import java.util.List;

@Getter @Setter

public class GroupRequest {
    private String groupName;

    @CreatedDate
    private LocalDate dateOfStart;

    @CreatedDate
    private LocalDate dateOfFinish;

    private List<Course> courses;

    private List<Student> students;
}
