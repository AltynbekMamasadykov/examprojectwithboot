package peaksoft.examprojectwithboot.dto.requests;

import lombok.Getter;

import lombok.Setter;

import java.time.LocalDate;

@Getter @Setter

public class GroupRequest {
    private String groupName;

    private LocalDate dateOfStart;

    private LocalDate dateOfFinish;
}
