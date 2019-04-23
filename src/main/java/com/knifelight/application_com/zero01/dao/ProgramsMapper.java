package com.knifelight.application_com.zero01.dao;

import com.knifelight.application_com.zero01.pojo.Programs;

public interface ProgramsMapper {
    int insert(Programs record);

    int insertSelective(Programs record);
}