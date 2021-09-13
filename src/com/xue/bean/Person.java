package com.xue.bean;

import java.io.Serializable;

/**
 * person
 * @author 
 */
public class Person implements Serializable {
    private Integer pid;

    private String pname;

    private static final long serialVersionUID = 1L;

    private Card card;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
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
        Person other = (Person) that;
        return (this.getPid() == null ? other.getPid() == null : this.getPid().equals(other.getPid()))
            && (this.getPname() == null ? other.getPname() == null : this.getPname().equals(other.getPname()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPid() == null) ? 0 : getPid().hashCode());
        result = prime * result + ((getPname() == null) ? 0 : getPname().hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "Person{" +
                "pid=" + pid +
                ", pname='" + pname + '\'' +
                ", card=" + card +
                '}';
    }
}