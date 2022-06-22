package peaksoft.examprojectwithboot.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "courses")
@Getter @Setter
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "course_id_generator")
    @SequenceGenerator(name = "course_id_generator",sequenceName = "course_id_seq",allocationSize = 1)
    private Long id;
    private String courseName;
    private String duration;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "company_id")
    private Company company;

    @ManyToMany(mappedBy = "courses")
    @JsonIgnore
    private List<Group> groups;

    @OneToOne(mappedBy = "course")
    @JsonIgnore
    private Teacher teacher;

}
