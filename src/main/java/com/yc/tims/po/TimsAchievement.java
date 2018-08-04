package com.yc.tims.po;

import java.util.Date;

public class TimsAchievement {
    private Integer achId;

    private Integer tpId;

    private String achContent;

    private String achExtension;

    private String achRank;

    private String achAttch;

    private Date achChecktime;

    private String achStatus;

    public Integer getAchId() {
        return achId;
    }

    public void setAchId(Integer achId) {
        this.achId = achId;
    }

    public Integer getTpId() {
        return tpId;
    }

    public void setTpId(Integer tpId) {
        this.tpId = tpId;
    }

    public String getAchContent() {
        return achContent;
    }

    public void setAchContent(String achContent) {
        this.achContent = achContent == null ? null : achContent.trim();
    }

    public String getAchExtension() {
        return achExtension;
    }

    public void setAchExtension(String achExtension) {
        this.achExtension = achExtension == null ? null : achExtension.trim();
    }

    public String getAchRank() {
        return achRank;
    }

    public void setAchRank(String achRank) {
        this.achRank = achRank == null ? null : achRank.trim();
    }

    public String getAchAttch() {
        return achAttch;
    }

    public void setAchAttch(String achAttch) {
        this.achAttch = achAttch == null ? null : achAttch.trim();
    }

    public Date getAchChecktime() {
        return achChecktime;
    }

    public void setAchChecktime(Date achChecktime) {
        this.achChecktime = achChecktime;
    }

    public String getAchStatus() {
        return achStatus;
    }

    public void setAchStatus(String achStatus) {
        this.achStatus = achStatus == null ? null : achStatus.trim();
    }
}