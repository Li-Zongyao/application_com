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
        System.out.println("开始查询在线视频资源");
        List<Programs> list = null;
        list = programsrepository.findAll();
        System.out.println("结束查询在线视频资源" + list );
        String str2 = new String("return programs success");
        returnMap.put("aaa", str2 );
        returnMap.put("program", list);
        return returnMap;
    }






}
