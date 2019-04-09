package org.zero01.dao;

import org.zero01.pojo.AppUser;

public interface AppUserMapper {
    int insert(AppUser record);

    int insertSelective(AppUser record);
}