package com.yc.tims.po;

import java.util.Date;

public class TimsTechproject {
    private Integer tpId;

    private String tpName;

    private Integer paId;

    private String tpOrganizer;

    private String tpCooperation;

    private Date tpStartdate;

    private Date tpEnddate;

    private String tpFirstleader;

    private String tpSecondleader;

    private Double tpInvestment;

    private Double tpPay;

    private String tpAttch;

    private String tpStatus;

    public Integer getTpId() {
        return tpId;
    }

    public void setTpId(Integer tpId) {
        this.tpId = tpId;
    }

    public String getTpName() {
        return tpName;
    }

    public void setTpName(String tpName) {
        this.tpName = tpName == null ? null : tpName.trim();
    }

    public Integer getPaId() {
        return paId;
    }

    public void setPaId(Integer paId) {
        this.paId = paId;
    }

    public String getTpOrganizer() {
        return tpOrganizer;
    }

    public void setTpOrganizer(String tpOrganizer) {
        this.tpOrganizer = tpOrganizer == null ? null : tpOrganizer.trim();
    }

    public String getTpCooperation() {
        return tpCooperation;
    }

    public void setTpCooperation(String tpCooperation) {
        this.tpCooperation = tpCooperation == null ? null : tpCooperation.trim();
    }

    public Date getTpStartdate() {
        return tpStartdate;
    }

    public void setTpStartdate(Date tpStartdate) {
        this.tpStartdate = tpStartdate;
    }

    public Date getTpEnddate() {
        return tpEnddate;
    }

    public void setTpEnddate(Date tpEnddate) {
        this.tpEnddate = tpEnddate;
    }

    public String getTpFirstleader() {
        return tpFirstleader;
    }

    public void setTpFirstleader(String tpFirstleader) {
        this.tpFirstleader = tpFirstleader == null ? null : tpFirstleader.trim();
    }

    public String getTpSecondleader() {
        return tpSecondleader;
    }

    public void setTpSecondleader(String tpSecondleader) {
        this.tpSecondleader = tpSecondleader == null ? null : tpSecondleader.trim();
    }

    public Double getTpInvestment() {
        return tpInvestment;
    }

    public void setTpInvestment(Double tpInvestment) {
        this.tpInvestment = tpInvestment;
    }

    public Double getTpPay() {
        return tpPay;
    }

    public void setTpPay(Double tpPay) {
        this.tpPay = tpPay;
    }

    public String getTpAttch() {
        return tpAttch;
    }

    public void setTpAttch(String tpAttch) {
        this.tpAttch = tpAttch == null ? null : tpAttch.trim();
    }

    public String getTpStatus() {
        return tpStatus;
    }

    public void setTpStatus(String tpStatus) {
        this.tpStatus = tpStatus == null ? null : tpStatus.trim();
    }
}