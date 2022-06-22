package peaksoft.examprojectwithboot.apiControllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import peaksoft.examprojectwithboot.dto.requests.CompanyRequest;
import peaksoft.examprojectwithboot.dto.responses.CompanyResponse;
import peaksoft.examprojectwithboot.services.CompanyService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/companies")
public class CompanyApi {

    private final CompanyService companyService;

    @PostMapping
    public CompanyResponse create(@RequestBody CompanyRequest companyRequest){
        return companyService.create(companyRequest);
    }

    @GetMapping
    public List<CompanyResponse> getAllCompanies(){
        return companyService.getAllCompanies();
    }

    @GetMapping("find/{id}")
    public CompanyResponse findById(@PathVariable Long id){
        return companyService.findById(id);
    }

    @PutMapping("update/{id}")
    public CompanyResponse update(@PathVariable Long id,@RequestBody CompanyRequest companyRequest){
        return companyService.update(companyRequest,id);
    }

    @DeleteMapping("delete/{id}")
    public CompanyResponse delete(@PathVariable Long id){
        return companyService.deleteById(id);
    }



}
