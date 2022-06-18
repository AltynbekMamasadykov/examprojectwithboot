package peaksoft.examprojectwithboot.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

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

}
