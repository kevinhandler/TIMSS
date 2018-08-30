package com.yc.tims.po;

public class Role {
    private Integer roleId;

    private String roleName;

    private String roleSign;

    
    
    @Override
	public String toString() {
		return "Role [roleId=" + roleId + ", roleName=" + roleName + ", roleSign=" + roleSign + "]";
	}

	public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public String getRoleSign() {
        return roleSign;
    }

    public void setRoleSign(String roleSign) {
        this.roleSign = roleSign == null ? null : roleSign.trim();
    }
}