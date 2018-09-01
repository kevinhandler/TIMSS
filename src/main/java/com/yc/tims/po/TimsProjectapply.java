package com.yc.tims.po;

public class TimsProjectapply {
    private Integer paId;

    private String paName;

    private String paSort;

    private String paOrgan;

    private String paLeader;

    private String paFunds;

    private Double paContent;

    private String paRemark;

    private String paAttrch;

    private String paLeaderoption;

    private String paScientistoption;

    private String paStatus;

    
    @Override
	public String toString() {
		return "TimsProjectapply [paId=" + paId + ", paName=" + paName + ", paSort=" + paSort + ", paOrgan=" + paOrgan
				+ ", paLeader=" + paLeader + ", paFunds=" + paFunds + ", paContent=" + paContent + ", paRemark="
				+ paRemark + ", paAttrch=" + paAttrch + ", paLeaderoption=" + paLeaderoption + ", paScientistoption="
				+ paScientistoption + ", paStatus=" + paStatus + "]";
	}

	public Integer getPaId() {
        return paId;
    }

    public void setPaId(Integer paId) {
        this.paId = paId;
    }

    public String getPaName() {
        return paName;
    }

    public void setPaName(String paName) {
        this.paName = paName == null ? null : paName.trim();
    }

    public String getPaSort() {
        return paSort;
    }

    public void setPaSort(String paSort) {
        this.paSort = paSort == null ? null : paSort.trim();
    }

    public String getPaOrgan() {
        return paOrgan;
    }

    public void setPaOrgan(String paOrgan) {
        this.paOrgan = paOrgan == null ? null : paOrgan.trim();
    }

    public String getPaLeader() {
        return paLeader;
    }

    public void setPaLeader(String paLeader) {
        this.paLeader = paLeader == null ? null : paLeader.trim();
    }

    public String getPaFunds() {
        return paFunds;
    }

    public void setPaFunds(String paFunds) {
        this.paFunds = paFunds == null ? null : paFunds.trim();
    }

    public Double getPaContent() {
        return paContent;
    }

    public void setPaContent(Double paContent) {
        this.paContent = paContent;
    }

    public String getPaRemark() {
        return paRemark;
    }

    public void setPaRemark(String paRemark) {
        this.paRemark = paRemark == null ? null : paRemark.trim();
    }

    public String getPaAttrch() {
        return paAttrch;
    }

    public void setPaAttrch(String paAttrch) {
        this.paAttrch = paAttrch == null ? null : paAttrch.trim();
    }

    public String getPaLeaderoption() {
        return paLeaderoption;
    }

    public void setPaLeaderoption(String paLeaderoption) {
        this.paLeaderoption = paLeaderoption == null ? null : paLeaderoption.trim();
    }

    public String getPaScientistoption() {
        return paScientistoption;
    }

    public void setPaScientistoption(String paScientistoption) {
        this.paScientistoption = paScientistoption == null ? null : paScientistoption.trim();
    }

    public String getPaStatus() {
        return paStatus;
    }

    public void setPaStatus(String paStatus) {
        this.paStatus = paStatus == null ? null : paStatus.trim();
    }
}