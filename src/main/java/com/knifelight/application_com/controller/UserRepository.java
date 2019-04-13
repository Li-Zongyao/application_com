package com.knifelight.application_com.controller;


import com.knifelight.application_com.zero01.pojo.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<AppUser,Integer> {

    public List<AppUser> findByName(String name);

    public List<AppUser> findByNameAndPassword(String name,String password);

    @Query(nativeQuery=true,value ="select IDENTITY from app_user where name=?1 ")
    public String findidentity(String name);

//    @Query("select * from app_user u where u.name=:name")
//    public List<AppUser> findUser(@Param("name") String name);
    ///////////////////////////////////////////
    //spring boot jpa 文档
    //https://docs.spring.io/spring-data/jpa/docs/2.0.9.RELEASE/reference/html/
}
