package com.yc.tims.po;

public class TimsAdmin {
    private Integer adminId;

    private String adminName;

    private String adminPassword;

    private String adminEmail;

    private String adminTelpone;

    
    
    @Override
	public String toString() {
		return "TimsAdmin [adminId=" + adminId + ", adminName=" + adminName + ", adminPassword=" + adminPassword
				+ ", adminEmail=" + adminEmail + ", adminTelpone=" + adminTelpone + "]";
	}

	public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName == null ? null : adminName.trim();
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword == null ? null : adminPassword.trim();
    }

    public String getAdminEmail() {
        return adminEmail;
    }

    public void setAdminEmail(String adminEmail) {
        this.adminEmail = adminEmail == null ? null : adminEmail.trim();
    }

    public String getAdminTelpone() {
        return adminTelpone;
    }

    public void setAdminTelpone(String adminTelpone) {
        this.adminTelpone = adminTelpone == null ? null : adminTelpone.trim();
    }
}