package peaksoft.examprojectwithboot.dto.requests;

import lombok.Getter;
import lombok.Setter;
import peaksoft.examprojectwithboot.entities.Company;
import peaksoft.examprojectwithboot.entities.Group;
import peaksoft.examprojectwithboot.entities.Teacher;

import java.util.List;

@Getter @Setter
public class CourseRequest {
    private String courseName;

    private String duration;

    private Company company;

    private List<Group> groups;

    private Teacher teacher;
}
