package com.yc.tims.po;

public class TimsAward {
    private Integer aId;

    private String aRank;

    private String aName;

    public Integer getaId() {
        return aId;
    }

    public void setaId(Integer aId) {
        this.aId = aId;
    }

    public String getaRank() {
        return aRank;
    }

    public void setaRank(String aRank) {
        this.aRank = aRank == null ? null : aRank.trim();
    }

    public String getaName() {
        return aName;
    }

    public void setaName(String aName) {
        this.aName = aName == null ? null : aName.trim();
    }
}