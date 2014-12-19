package com.shinowit.entity;

import javax.persistence.*;

/**
 * Created by Administrator on 2014/12/19.
 */
@Entity
@Table(name = "sex_type")
public class SexType {

    private String sexCode;
    private String sexTypeName;

    @Id
    @Column(name = "sex_code")
    public String getSexCode() {
        return sexCode;
    }

    public void setSexCode(String sexCode) {
        this.sexCode = sexCode;
    }

    @Basic
    @Column(name = "sex_type_name")
    public String getSexTypeName() {
        return sexTypeName;
    }

    public void setSexTypeName(String sexTypeName) {
        this.sexTypeName = sexTypeName;
    }

}
