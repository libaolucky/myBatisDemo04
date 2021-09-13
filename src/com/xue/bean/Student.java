package com.xue.bean;

import java.io.Serializable;
import java.util.List;

/**
 * student
 * @author 
 */
public class Student implements Serializable {
    private Integer sid;

    private String sname;

    private Integer scid;

    private String shobby;

    private Integer cid;

    private static final long serialVersionUID = 1L;

    private List<School> schoolList;

    // 多对多！！ 也要写 多方的 实体类的 集合,注意： 不是写中间表的
       private List<Banwei> banweiList;

    public List<Banwei> getBanweiList() {
        return banweiList;
    }

    public void setBanweiList(List<Banwei> banweiList) {
        this.banweiList = banweiList;
    }

    public List<School> getSchoolList() {
        return schoolList;
    }

    public void setSchoolList(List<School> schoolList) {
        this.schoolList = schoolList;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Integer getScid() {
        return scid;
    }

    public void setScid(Integer scid) {
        this.scid = scid;
    }

    public String getShobby() {
        return shobby;
    }

    public void setShobby(String shobby) {
        this.shobby = shobby;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
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
        Student other = (Student) that;
        return (this.getSid() == null ? other.getSid() == null : this.getSid().equals(other.getSid()))
            && (this.getSname() == null ? other.getSname() == null : this.getSname().equals(other.getSname()))
            && (this.getScid() == null ? other.getScid() == null : this.getScid().equals(other.getScid()))
            && (this.getShobby() == null ? other.getShobby() == null : this.getShobby().equals(other.getShobby()))
            && (this.getCid() == null ? other.getCid() == null : this.getCid().equals(other.getCid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getSid() == null) ? 0 : getSid().hashCode());
        result = prime * result + ((getSname() == null) ? 0 : getSname().hashCode());
        result = prime * result + ((getScid() == null) ? 0 : getScid().hashCode());
        result = prime * result + ((getShobby() == null) ? 0 : getShobby().hashCode());
        result = prime * result + ((getCid() == null) ? 0 : getCid().hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", scid=" + scid +
                ", shobby='" + shobby + '\'' +
                ", cid=" + cid +
                ", schoolList=" + schoolList +
                ", banweiList=" + banweiList +
                '}';
    }
}