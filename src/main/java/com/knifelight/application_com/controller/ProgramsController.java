package com.knifelight.application_com.controller;


import com.knifelight.application_com.zero01.pojo.Programs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RestController
public class ProgramsController {

    private String returnmessage;


    @Autowired
    private ProgramsRepository programsrepository;

    @CrossOrigin
    @RequestMapping(value = "/api/addprogram", method = RequestMethod.POST, produces = "application/json; charset=UTF-8")
    @ResponseBody
    public String AddProgram(@RequestBody Programs program) {
        System.out.printf("get user : ");
        Programs temPrograms = new Programs();
        temPrograms.setId(program.getId());
        temPrograms.setProgramname(program.getProgramname());
        temPrograms.setUsername(program.getUsername());
        temPrograms.setApplicantunit(program.getApplicantunit());
        temPrograms.setSubject(program.getSubject());
        temPrograms.setApptime(program.getApptime());
        temPrograms.setStatus("1");
        System.out.println("   getApplicantunit:"+ program.getApplicantunit());
        System.out.println("temProgramsId : "+temPrograms.getId());
        programsrepository.save(temPrograms);

        return returnmessage;
    }






}
