package com.shinowit.entity;

import java.io.Serializable;

public class Stu implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stu.stu_id
     *
     * @mbggenerated Tue Dec 23 16:11:09 CST 2014
     */
    private Integer stuId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stu.stu_name
     *
     * @mbggenerated Tue Dec 23 16:11:09 CST 2014
     */
    private String stuName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table stu
     *
     * @mbggenerated Tue Dec 23 16:11:09 CST 2014
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stu.stu_id
     *
     * @return the value of stu.stu_id
     *
     * @mbggenerated Tue Dec 23 16:11:09 CST 2014
     */
    public Integer getStuId() {
        return stuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stu.stu_id
     *
     * @param stuId the value for stu.stu_id
     *
     * @mbggenerated Tue Dec 23 16:11:09 CST 2014
     */
    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stu.stu_name
     *
     * @return the value of stu.stu_name
     *
     * @mbggenerated Tue Dec 23 16:11:09 CST 2014
     */
    public String getStuName() {
        return stuName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stu.stu_name
     *
     * @param stuName the value for stu.stu_name
     *
     * @mbggenerated Tue Dec 23 16:11:09 CST 2014
     */
    public void setStuName(String stuName) {
        this.stuName = stuName == null ? null : stuName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stu
     *
     * @mbggenerated Tue Dec 23 16:11:09 CST 2014
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Stu other = (Stu) that;
        return (this.getStuId() == null ? other.getStuId() == null : this.getStuId().equals(other.getStuId()))
            && (this.getStuName() == null ? other.getStuName() == null : this.getStuName().equals(other.getStuName()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stu
     *
     * @mbggenerated Tue Dec 23 16:11:09 CST 2014
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getStuId() == null) ? 0 : getStuId().hashCode());
        result = prime * result + ((getStuName() == null) ? 0 : getStuName().hashCode());
        return result;
    }
}