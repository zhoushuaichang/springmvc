package com.shinowit.entity;

import java.io.Serializable;

public class SexType implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sex_type.sex_code
     *
     * @mbggenerated Tue Dec 23 16:11:09 CST 2014
     */
    private String sexCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sex_type.sex_type_name
     *
     * @mbggenerated Tue Dec 23 16:11:09 CST 2014
     */
    private String sexTypeName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sex_type
     *
     * @mbggenerated Tue Dec 23 16:11:09 CST 2014
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sex_type.sex_code
     *
     * @return the value of sex_type.sex_code
     *
     * @mbggenerated Tue Dec 23 16:11:09 CST 2014
     */
    public String getSexCode() {
        return sexCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sex_type.sex_code
     *
     * @param sexCode the value for sex_type.sex_code
     *
     * @mbggenerated Tue Dec 23 16:11:09 CST 2014
     */
    public void setSexCode(String sexCode) {
        this.sexCode = sexCode == null ? null : sexCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sex_type.sex_type_name
     *
     * @return the value of sex_type.sex_type_name
     *
     * @mbggenerated Tue Dec 23 16:11:09 CST 2014
     */
    public String getSexTypeName() {
        return sexTypeName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sex_type.sex_type_name
     *
     * @param sexTypeName the value for sex_type.sex_type_name
     *
     * @mbggenerated Tue Dec 23 16:11:09 CST 2014
     */
    public void setSexTypeName(String sexTypeName) {
        this.sexTypeName = sexTypeName == null ? null : sexTypeName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sex_type
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
        SexType other = (SexType) that;
        return (this.getSexCode() == null ? other.getSexCode() == null : this.getSexCode().equals(other.getSexCode()))
            && (this.getSexTypeName() == null ? other.getSexTypeName() == null : this.getSexTypeName().equals(other.getSexTypeName()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sex_type
     *
     * @mbggenerated Tue Dec 23 16:11:09 CST 2014
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSexCode() == null) ? 0 : getSexCode().hashCode());
        result = prime * result + ((getSexTypeName() == null) ? 0 : getSexTypeName().hashCode());
        return result;
    }
}