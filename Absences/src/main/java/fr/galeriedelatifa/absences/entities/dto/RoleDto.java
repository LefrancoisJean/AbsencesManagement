package fr.galeriedelatifa.absences.entities.dto;

import java.io.Serializable;

public class RoleDto implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6033963707452871594L;

	private String roleCode;
	
	private String roleName;

	public String getRoleCode() {
		return roleCode;
	}

	public void setRoleCode(String roleCode) {
		this.roleCode = roleCode;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
}
