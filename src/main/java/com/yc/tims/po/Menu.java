package com.yc.tims.po;

public class Menu {
    private Integer menuId;

    private String menuName;

    private String url;

    
    @Override
	public String toString() {
		return "Menu [menuId=" + menuId + ", menuName=" + menuName + ", url=" + url + "]";
	}

	public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName == null ? null : menuName.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }
}