package com.xue.bean;

import java.io.Serializable;
import java.util.List;

/**
 * clazz
 * @author 
 */
public class Clazz implements Serializable {
    private Integer cid;

    private String cname;

    private String goodis;

    private static final long serialVersionUID = 1L;
    // 1对 多 对多
    private List<Student> studentList;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getGoodis() {
        return goodis;
    }

    public void setGoodis(String goodis) {
        this.goodis = goodis;
    }

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
        Clazz other = (Clazz) that;
        return (this.getCid() == null ? other.getCid() == null : this.getCid().equals(other.getCid()))
            && (this.getCname() == null ? other.getCname() == null : this.getCname().equals(other.getCname()))
            && (this.getGoodis() == null ? other.getGoodis() == null : this.getGoodis().equals(other.getGoodis()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCid() == null) ? 0 : getCid().hashCode());
        result = prime * result + ((getCname() == null) ? 0 : getCname().hashCode());
        result = prime * result + ((getGoodis() == null) ? 0 : getGoodis().hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "Clazz{" +
                "cid=" + cid +
                ", cname='" + cname + '\'' +
                ", goodis='" + goodis + '\'' +
                ", studentList=" + studentList +
                '}';
    }
}