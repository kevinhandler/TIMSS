package com.yc.tims.po;

public class TimsAuthority {
    private Integer authId;

    private String authRolename;

    private Integer authAuthority;

    private Integer empId;

    public Integer getAuthId() {
        return authId;
    }

    public void setAuthId(Integer authId) {
        this.authId = authId;
    }

    public String getAuthRolename() {
        return authRolename;
    }

    public void setAuthRolename(String authRolename) {
        this.authRolename = authRolename == null ? null : authRolename.trim();
    }

    public Integer getAuthAuthority() {
        return authAuthority;
    }

    public void setAuthAuthority(Integer authAuthority) {
        this.authAuthority = authAuthority;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }
}