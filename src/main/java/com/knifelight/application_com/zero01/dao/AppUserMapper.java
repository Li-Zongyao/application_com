package com.knifelight.application_com.zero01.dao;

import com.knifelight.application_com.zero01.pojo.AppUser;

public interface AppUserMapper {
    int insert(AppUser record);

    int insertSelective(AppUser record);
}