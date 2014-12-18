package com.shinowit.entity;

import javax.persistence.*;

/**
 * Created by Administrator on 2014/12/17.
 */
@Entity
@Table(name = "tea", schema = "", catalog = "test")
public class TeaEntity {
    private int teaId;
    private String teaName;

    @Id
    @Column(name = "tea_id")
    public int getTeaId() {
        return teaId;
    }

    public void setTeaId(int teaId) {
        this.teaId = teaId;
    }

    @Basic
    @Column(name = "tea_name")
    public String getTeaName() {
        return teaName;
    }

    public void setTeaName(String teaName) {
        this.teaName = teaName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TeaEntity teaEntity = (TeaEntity) o;

        if (teaId != teaEntity.teaId) return false;
        if (teaName != null ? !teaName.equals(teaEntity.teaName) : teaEntity.teaName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = teaId;
        result = 31 * result + (teaName != null ? teaName.hashCode() : 0);
        return result;
    }
}
