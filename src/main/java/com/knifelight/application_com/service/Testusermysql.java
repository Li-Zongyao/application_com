package com.knifelight.application_com.service;

public interface Testusermysql {
    void create(String name, Integer age);
    void deleteByName(String name);
    Integer getAllUsers();
    void deleteAllUsers();
}