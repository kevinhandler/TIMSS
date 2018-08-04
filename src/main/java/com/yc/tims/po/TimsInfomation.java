package com.yc.tims.po;

import java.util.Date;

public class TimsInfomation {
    private Integer infoId;

    private String infoTilte;

    private String infoContent;

    private Date infoTime;

    public Integer getInfoId() {
        return infoId;
    }

    public void setInfoId(Integer infoId) {
        this.infoId = infoId;
    }

    public String getInfoTilte() {
        return infoTilte;
    }

    public void setInfoTilte(String infoTilte) {
        this.infoTilte = infoTilte == null ? null : infoTilte.trim();
    }

    public String getInfoContent() {
        return infoContent;
    }

    public void setInfoContent(String infoContent) {
        this.infoContent = infoContent == null ? null : infoContent.trim();
    }

    public Date getInfoTime() {
        return infoTime;
    }

    public void setInfoTime(Date infoTime) {
        this.infoTime = infoTime;
    }
}