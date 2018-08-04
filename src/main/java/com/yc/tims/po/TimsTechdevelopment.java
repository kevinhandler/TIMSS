package com.yc.tims.po;

import java.util.Date;

public class TimsTechdevelopment {
    private Integer tdId;

    private String tdTitle;

    private String tdContent;

    private Date tdTime;

    public Integer getTdId() {
        return tdId;
    }

    public void setTdId(Integer tdId) {
        this.tdId = tdId;
    }

    public String getTdTitle() {
        return tdTitle;
    }

    public void setTdTitle(String tdTitle) {
        this.tdTitle = tdTitle == null ? null : tdTitle.trim();
    }

    public String getTdContent() {
        return tdContent;
    }

    public void setTdContent(String tdContent) {
        this.tdContent = tdContent == null ? null : tdContent.trim();
    }

    public Date getTdTime() {
        return tdTime;
    }

    public void setTdTime(Date tdTime) {
        this.tdTime = tdTime;
    }
}