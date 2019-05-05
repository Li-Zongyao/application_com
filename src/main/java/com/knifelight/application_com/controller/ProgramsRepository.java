package com.knifelight.application_com.controller;

import com.knifelight.application_com.zero01.pojo.Programs;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;


public interface ProgramsRepository extends JpaRepository<Programs,Integer> {
    public Optional<Programs> findById(Integer id);

    public List<Programs> findByprogramname(String programname);



}
