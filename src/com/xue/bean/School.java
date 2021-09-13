package com.xue.bean;

import java.io.Serializable;

/**
 * school
 * @author 
 */
public class School implements Serializable {
    private Integer scid;

    private String scname;

    private String scadress;

    private static final long serialVersionUID = 1L;

    public Integer getScid() {
        return scid;
    }

    public void setScid(Integer scid) {
        this.scid = scid;
    }

    public String getScname() {
        return scname;
    }

    public void setScname(String scname) {
        this.scname = scname;
    }

    public String getScadress() {
        return scadress;
    }

    public void setScadress(String scadress) {
        this.scadress = scadress;
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
        School other = (School) that;
        return (this.getScid() == null ? other.getScid() == null : this.getScid().equals(other.getScid()))
            && (this.getScname() == null ? other.getScname() == null : this.getScname().equals(other.getScname()))
            && (this.getScadress() == null ? other.getScadress() == null : this.getScadress().equals(other.getScadress()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getScid() == null) ? 0 : getScid().hashCode());
        result = prime * result + ((getScname() == null) ? 0 : getScname().hashCode());
        result = prime * result + ((getScadress() == null) ? 0 : getScadress().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", scid=").append(scid);
        sb.append(", scname=").append(scname);
        sb.append(", scadress=").append(scadress);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}