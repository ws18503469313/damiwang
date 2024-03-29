package com.cloud.dto;

import com.cloud.model.User;

public class UserDTO extends User {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2396835051847444596L;
	
	/**
	 * 	角色名称
	 */
	private String rolename;
	/**
	 *用户管理的layoutid
	 */
	private Long layoutId;
	public String getRolename() {
		return rolename;
	}

	public void setRolename(String rolename) {
		this.rolename = rolename;
	}

	public Long getLayoutId() {
		return layoutId;
	}

	public void setLayoutId(Long layoutId) {
		this.layoutId = layoutId;
	}
	
	
}
