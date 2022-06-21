package peaksoft.examprojectwithboot.services;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import peaksoft.examprojectwithboot.dto.requests.CompanyRequest;
import peaksoft.examprojectwithboot.dto.responses.CompanyResponse;
import peaksoft.examprojectwithboot.entities.Company;
import peaksoft.examprojectwithboot.mappers.CompanyEditMapper;
import peaksoft.examprojectwithboot.mappers.CompanyViewMapper;
import peaksoft.examprojectwithboot.repositories.CompanyRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CompanyService {

    private final CompanyRepository companyRepository;
    private final CompanyEditMapper companyEditMapper;
    private final CompanyViewMapper companyViewMapper;

    public CompanyResponse create(CompanyRequest companyRequest){
        Company company = companyEditMapper.create(companyRequest);
        companyRepository.save(company);
        return companyViewMapper.viewCompany(company);
    }

    public List<CompanyResponse> getAllCompanies(){
        return companyViewMapper.viewAllCompanies(companyRepository.findAll());
    }

    public CompanyResponse update(CompanyRequest companyRequest, Long id){
        Company company = companyRepository.findById(id).get();
        companyEditMapper.update(company,companyRequest);
        return companyViewMapper.viewCompany(companyRepository.save(company));
    }

    public CompanyResponse findById(Long id){
        Company company = companyRepository.findById(id).get();
        return companyViewMapper.viewCompany(company);
    }


    public CompanyResponse deleteById(Long id) {
        Company company = companyRepository.findById(id).get();
        companyRepository.delete(company);
        return companyViewMapper.viewCompany(company);
    }
}
