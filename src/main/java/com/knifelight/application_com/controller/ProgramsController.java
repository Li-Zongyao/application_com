package com.knifelight.application_com.controller;


import com.knifelight.application_com.zero01.pojo.Programs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        System.out.printf("   getApplicantunit:"+ program.getApplicantunit());
        System.out.printf("temProgramsId : "+temPrograms.getId());
        programsrepository.save(temPrograms);
        returnmessage = "save finish";

        return returnmessage;
    }

    @CrossOrigin
    @RequestMapping(value = "/api/programlist", method = RequestMethod.POST, produces = "application/json; charset=UTF-8")
    @ResponseBody
    public Map<String,Object> getprogram(@RequestBody Programs program) {
        Map<String,Object> returnMap=new HashMap<String,Object>();
        List<Programs> list = null;
        if (program.getProgramname().isEmpty()) {
            System.out.println("显示所有项目");
            list = programsrepository.findAll();
            System.out.println("显示所有项目结束");
            String str2 = new String("return all programs success");
            returnMap.put("aaa", str2);
            returnMap.put("program", list);
        }else {
            System.out.println("显示查询项目");
            String getProgramname = program.getProgramname();
            System.out.println("查询Programname： "+ getProgramname);
            list = programsrepository.findByprogramname( getProgramname );
            String str2 = new String("return select programs success");
            returnMap.put("aaa", str2);
            returnMap.put("program", list);
            System.out.println("显示查询项目结束");
        }
        return returnMap;
    }






}
