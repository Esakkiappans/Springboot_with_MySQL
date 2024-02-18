package com.example.springtest.service;

import com.example.springtest.exception.ResourceNotFoundException;
import com.example.springtest.model.dbmodels;
import com.example.springtest.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    StudentRepository StRepo;
    public dbmodels addData(dbmodels data){

        return this.StRepo.save(data);
    }
    public List<dbmodels> getData(){
        return this.StRepo.findAll();
    }
    public Optional<dbmodels> getDataById (Integer id){
    return this.StRepo.findById(id);
    }
    public dbmodels putDatas(Integer id , dbmodels models){
        dbmodels AllRecords=this.StRepo.findById(id).orElseThrow(()-> new ResourceNotFoundException("User Data Not Found"));
        AllRecords.setName(models.getName());
        AllRecords.setDepartment(models.getDepartment());
        AllRecords.setAddress(models.getAddress());
        return this.StRepo.save(AllRecords);
    }
    public String deleteData(Integer id){
        this.StRepo.deleteById(id);
        return "Data SuccessFully Deleted";
    }
}

