package com.knifelight.application_com.controller;


import com.knifelight.application_com.zero01.pojo.AppUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RestController
public class LoginController {


    private String returnmessage;

    @Autowired
    private UserRepository userRepository;

    private String tempuser;

    @CrossOrigin
    @RequestMapping(value = "/api/login", method = RequestMethod.POST, produces = "application/json; charset=UTF-8")
    @ResponseBody
//    保证数据库dao层在同一文件夹下https://blog.csdn.net/ooyhao/article/details/83591018
    public String Login(@RequestBody AppUser user) {

        if (userRepository.findByNameAndPassword(user.getName(), user.getPassword()).isEmpty()) {
            returnmessage="wrong password or name";
        } else {
            returnmessage=userRepository.findidentity(user.getName());

//            String[] toBeStored = tempuser.toArray(new String[tempuser.size()]);
//            for(String s : toBeStored) {
//                System.out.println(s);
//            }
        }

        System.out.println("identity:"+tempuser);
        System.out.printf("用户名" + user.getName());
        System.out.printf("用户密码" + user.getPassword()+"\n");

        return returnmessage;
    }


}
