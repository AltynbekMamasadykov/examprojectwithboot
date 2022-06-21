package peaksoft.examprojectwithboot.mappers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import peaksoft.examprojectwithboot.dto.requests.GroupRequest;
import peaksoft.examprojectwithboot.dto.responses.GroupResponse;
import peaksoft.examprojectwithboot.entities.Group;

import java.util.ArrayList;
import java.util.List;

@Component
@RequiredArgsConstructor

public class GroupMapper {

    public Group create(GroupRequest groupRequest) {
        Group group = new Group();
        group.setGroupName(groupRequest.getGroupName());
        group.setDateOfStart(groupRequest.getDateOfStart());
        group.setDateOfFinish(groupRequest.getDateOfFinish());
        return group;
    }

    public GroupResponse viewGroup(Group group) {
        GroupResponse groupResponse = new GroupResponse();
        groupResponse.setId(group.getId());
        groupResponse.setGroupName(group.getGroupName());
        groupResponse.setDateOfStart(group.getDateOfStart());
        groupResponse.setDateOfFinish(group.getDateOfFinish());
        return groupResponse;
    }

    public List<GroupResponse> getAllGroups(List<Group> groups) {
        List<GroupResponse> groupResponses = new ArrayList<>();
        for (Group group:groups) {
            groupResponses.add(viewGroup(group));
        }
        return  groupResponses;
    }

    public void update(Group group, GroupRequest groupRequest) {
        group.setGroupName(groupRequest.getGroupName());
        group.setDateOfStart(groupRequest.getDateOfStart());
        group.setDateOfFinish(groupRequest.getDateOfFinish());
    }
}
