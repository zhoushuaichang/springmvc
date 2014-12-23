package com.shinowit.test;


import com.shinowit.dao.mapper.SexTypeMapper;
import com.shinowit.dao.mapper.StuMapper;
import com.shinowit.dao.mapper.StudentMapper;
import com.shinowit.dao.mapper.TeacherMapper;
import com.shinowit.entity.*;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:application-context.xml" })
public class StuTest extends AbstractJUnit4SpringContextTests {
    @Resource
    private StuMapper stu_dao;
    @Resource
    private StudentMapper student_dao;
    @Resource
    private SexTypeMapper sexType_dao;
    @Resource
    private TeacherMapper teacher_dao;

    @Test
    public void test(){

        Teacher teacher=teacher_dao.selectByPrimaryKey(3);
        List<Student> studentList=teacher.getStudentList();

        for(Student student:studentList){
            System.out.println(student.getName());
        }


//        StudentCriteria studentCriteria=new StudentCriteria();
//        studentCriteria.createCriteria().andTeacherIdEqualTo(3);
//
//        List<Student> studentList=student_dao.selectStudentWithTeacherNameByExample(studentCriteria);
//        for(Student student:studentList){
//            System.out.println(student.getTeacherName());
//        }



//        List<Student> studentList=student_dao.selectStudentWithTeacherNameByPrimaryKey(1);
//        System.out.println(studentList.get(0).getTeacherName());



//        Teacher teacher=teacher_dao.selectByPrimaryKey(3);
//        List<Student> studentList=teacher.getStudentList();
//        for(Student student:studentList){
//            System.out.println(student.getName());
//        }


//        SexType sexType=new SexType();
//        sexType.setSexCode("03");
//        sexType.setSexTypeName("未知");
//        sexType_dao.insert(sexType);
//        Assert.assertTrue();

//        StudentCriteria studentCriteria=new StudentCriteria();
//        studentCriteria.setPageSize(5);
//        studentCriteria.setPageIndex(1);
//        List<Student> studentList=student_dao.listAll();
//        System.out.print(studentList.size());
//        for(Student student:studentList){
//            Teacher teacher=student.getTeacher();
//            String teacher_name=teacher.getName();
//            System.out.println(teacher_name);
//        }

//        StuCriteria stuCriteria=new StuCriteria();
//        stuCriteria.setPageIndex(2);
//        stuCriteria.setPageSize(2);
//
//        List<Stu> stuList=stu_dao.selectPage(stuCriteria);
//
//        for(Stu stu:stuList){
//            System.out.println(stu.getStuName());
//        }

//        Stu stu=new Stu();
//        stu.setStuName("小熊");
//
//        stu_dao.insert(stu);
//
//        System.out.print(stu.getStuId());

    }
}
