package peaksoft.examprojectwithboot.dto.responses;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter @Setter

public class GroupResponse {

    private Long id;

    private String groupName;

    private LocalDate dateOfStart;

    private LocalDate dateOfFinish;
}
