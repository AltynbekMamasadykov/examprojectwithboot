package peaksoft.examprojectwithboot.dto.responses;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDate;

@Getter @Setter

public class GroupResponse {

    private Long id;

    private String groupName;

    @CreatedDate
    private LocalDate dateOfStart;

    @CreatedDate
    private LocalDate dateOfFinish;
}
