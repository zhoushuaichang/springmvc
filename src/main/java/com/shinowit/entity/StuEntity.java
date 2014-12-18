package com.shinowit.entity;

import javax.persistence.*;

/**
 * Created by Administrator on 2014/12/17.
 */
@Entity
@Table(name = "stu")
public class StuEntity {
    private int stuId;
    private String stuName;

    @Id
    @Column(name = "stu_id")
    public int getStuId() {
        return stuId;
    }

    public void setStuId(int stuId) {
        this.stuId = stuId;
    }

    @Basic
    @Column(name = "stu_name")
    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

}
