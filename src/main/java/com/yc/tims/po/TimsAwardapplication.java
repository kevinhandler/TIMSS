package com.yc.tims.po;

public class TimsAwardapplication {
    private Integer aaId;

    private Integer tpId;

    private Integer achId;

    private String achLevel;

    private String achRank;

    private String aaAttch;

    
    
    @Override
	public String toString() {
		return "TimsAwardapplication [aaId=" + aaId + ", tpId=" + tpId + ", achId=" + achId + ", achLevel=" + achLevel
				+ ", achRank=" + achRank + ", aaAttch=" + aaAttch + "]";
	}

	public Integer getAaId() {
        return aaId;
    }

    public void setAaId(Integer aaId) {
        this.aaId = aaId;
    }

    public Integer getTpId() {
        return tpId;
    }

    public void setTpId(Integer tpId) {
        this.tpId = tpId;
    }

    public Integer getAchId() {
        return achId;
    }

    public void setAchId(Integer achId) {
        this.achId = achId;
    }

    public String getAchLevel() {
        return achLevel;
    }

    public void setAchLevel(String achLevel) {
        this.achLevel = achLevel == null ? null : achLevel.trim();
    }

    public String getAchRank() {
        return achRank;
    }

    public void setAchRank(String achRank) {
        this.achRank = achRank == null ? null : achRank.trim();
    }

    public String getAaAttch() {
        return aaAttch;
    }

    public void setAaAttch(String aaAttch) {
        this.aaAttch = aaAttch == null ? null : aaAttch.trim();
    }
}