package com.knifelight.application_com.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sherry on 17/2/20.
 */
@RestController
public class helloworld {

    /**
     * 日志
     */
    private Logger logger = LoggerFactory.getLogger(helloworld.class);

    @RequestMapping("/")
    public String index() {
        return "Hello Spring Boot,Index!";
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test() {

        return "Spring Boot Test Demo!";
    }


}