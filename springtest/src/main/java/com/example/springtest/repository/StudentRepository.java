package com.example.springtest.repository;

import com.example.springtest.model.dbmodels;
import com.example.springtest.service.StudentService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository <dbmodels,Integer> {

}
