package peaksoft.examprojectwithboot.apiControllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import peaksoft.examprojectwithboot.dto.requests.GroupRequest;
import peaksoft.examprojectwithboot.dto.responses.GroupResponse;
import peaksoft.examprojectwithboot.services.GroupService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/groups")

public class GroupApi {

    private final GroupService groupService;

    @PostMapping
    public GroupResponse create(@RequestBody GroupRequest groupRequest){
        return groupService.create(groupRequest);
    }

    @GetMapping("find/{id}")
    public GroupResponse findById(@PathVariable Long id){
        return groupService.findById(id);
    }

    @GetMapping
    public List<GroupResponse> getAllGroups(){
        return groupService.getAllGroups();
    }

    @PutMapping("update/{id}")
    public GroupResponse update(@PathVariable Long id,@RequestBody GroupRequest groupRequest){
        return groupService.update(id,groupRequest);
    }

    @DeleteMapping("delete/{id}")
    public GroupResponse delete(@PathVariable Long id){
        return groupService.delete(id);
    }


}
