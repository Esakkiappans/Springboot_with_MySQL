package com.example.springtest.controller;
import com.example.springtest.model.dbmodels;
import com.example.springtest.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/dass")
public class Controll {
    @Autowired
    StudentService stu;
    @PostMapping("/da")
    public String dass (@RequestBody dbmodels db){
        this.stu.addData(db);
        return "Data SuccessFully Added";
    }

    @GetMapping("/dass")
    public List <dbmodels> dass (){

        return this.stu.getData();
    }
    @GetMapping("/dass/{name}")
    public Optional <dbmodels> getrecords (@PathVariable (value = "name") Integer na){
   return this.stu.getDataById(na);
    }
    @PutMapping("/dasss/{id}")
    public dbmodels putData (@PathVariable(value="id") Integer d ,@RequestBody dbmodels models) {
        return this.stu.putDatas(d,models);
    }
    @DeleteMapping("delete/{id}")
    public String deleteData (@PathVariable(value = "id") Integer id){
        return this.stu.deleteData(id);
    }
}
