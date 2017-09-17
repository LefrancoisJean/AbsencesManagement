package fr.galeriedelatifa.absences.data;
/**
 * 
 * @author Galerie de Latifa
 * 
 */
import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.galeriedelatifa.absences.entities.Role;

public interface RoleDao extends JpaRepository<Role, Long>, Serializable {
	
	Role findByRoleCode(String roleCode);
	
}
