package com.knifelight.application_com;

import com.knifelight.application_com.service.Testusermysql;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)

@SpringBootTest

public class ApplicationComApplicationTests {

    @Autowired
    private Testusermysql testusermysql;

    @Before
    public void setUp() {
        testusermysql.deleteAllUsers();
        System.out.println("清空user表");
    }

    @Test
    public void test() throws Exception {
        System.out.println("插入5个用户");
        testusermysql.create("p", 1);
        testusermysql.create("b", 2);
        testusermysql.create("c", 3);
        testusermysql.create("d", 4);
        testusermysql.create("e", 5);
        // 查数据库，应该有5个用户
        Assert.assertEquals(5, testusermysql.getAllUsers().intValue());
        // 删除两个用户
        testusermysql.deleteByName("a");
        testusermysql.deleteByName("e");
        // 查数据库，应该有3个用户
        Assert.assertEquals(4, testusermysql.getAllUsers().intValue());
    }
}
