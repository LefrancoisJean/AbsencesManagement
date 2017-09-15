package fr.galeriedelatifa.absences.data;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.galeriedelatifa.absences.entities.Role;

public interface RoleDao extends JpaRepository<Role, Long>, Serializable {
	
	Role findByRoleCode(String roleCode);
	
	Role saveRole(Role role);

}
