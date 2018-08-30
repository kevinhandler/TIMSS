package com.yc.tims.po;

import java.util.Date;

public class TimsRecommend {
    private Integer rId;

    private Date rTime;

    private String rRank;

    private String rName;

    private Integer empId;

    
    
    @Override
	public String toString() {
		return "TimsRecommend [rId=" + rId + ", rTime=" + rTime + ", rRank=" + rRank + ", rName=" + rName + ", empId="
				+ empId + "]";
	}

	public Integer getrId() {
        return rId;
    }

    public void setrId(Integer rId) {
        this.rId = rId;
    }

    public Date getrTime() {
        return rTime;
    }

    public void setrTime(Date rTime) {
        this.rTime = rTime;
    }

    public String getrRank() {
        return rRank;
    }

    public void setrRank(String rRank) {
        this.rRank = rRank == null ? null : rRank.trim();
    }

    public String getrName() {
        return rName;
    }

    public void setrName(String rName) {
        this.rName = rName == null ? null : rName.trim();
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }
}