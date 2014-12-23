package com.shinowit.test;


import com.shinowit.dao.mapper.StuMapper;
import com.shinowit.entity.Stu;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.rmi.StubNotFoundException;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:application-context.xml" })
public class StuTest extends AbstractJUnit4SpringContextTests {
    @Resource
    private StuMapper stu_dao;

    @Test
    public void test(){

        Stu stu=new Stu();
        stu.setStuName("小熊");

        stu_dao.insert(stu);

        System.out.print(stu.getStuId());

    }
}
