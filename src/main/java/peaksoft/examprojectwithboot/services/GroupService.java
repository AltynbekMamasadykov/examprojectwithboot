package peaksoft.examprojectwithboot.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import peaksoft.examprojectwithboot.dto.requests.GroupRequest;
import peaksoft.examprojectwithboot.dto.responses.GroupResponse;
import peaksoft.examprojectwithboot.entities.Group;
import peaksoft.examprojectwithboot.exceptions.NotFoundException;
import peaksoft.examprojectwithboot.mappers.GroupMapper;
import peaksoft.examprojectwithboot.repositories.GroupRepository;

import java.util.List;

@Service
@RequiredArgsConstructor

public class GroupService {

    private final GroupMapper groupMapper;

    private final GroupRepository groupRepository;

    public GroupResponse create(GroupRequest groupRequest) {
        Group group = groupMapper.create(groupRequest);
        groupRepository.save(group);
        return groupMapper.viewGroup(group);
    }

    private Group getGroupById(Long id){
        return groupRepository.findById(id).orElseThrow(
                () -> new NotFoundException(
                        "Not Found with id " +id
                )
        );
    }

    public GroupResponse findById(Long id) {
        Group group = getGroupById(id);
        return groupMapper.viewGroup(group);
    }

    public List<GroupResponse> getAllGroups() {
        return groupMapper.getAllGroups(groupRepository.findAll());
    }

    public GroupResponse update(Long id, GroupRequest groupRequest) {
        Group group = getGroupById(id);
        groupMapper.update(group,groupRequest);
        return groupMapper.viewGroup(groupRepository.save(group));

    }

    public GroupResponse delete(Long id) {
        Group group = getGroupById(id);
        groupRepository.delete(group);
        return groupMapper.viewGroup(group);
    }
}
