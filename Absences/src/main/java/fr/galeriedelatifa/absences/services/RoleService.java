/**
 * This class manage the autorisation
 * for the application
 */
package fr.galeriedelatifa.absences.services;

import java.io.Serializable;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.galeriedelatifa.absences.AbsencesManagementApplication;
import fr.galeriedelatifa.absences.data.RoleDao;
import fr.galeriedelatifa.absences.entities.Role;

/**
 * @author Galerie de Latifa
 *
 */
@Service
public class RoleService implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static final Logger logger = LoggerFactory.getLogger(AbsencesManagementApplication.class);

	@Autowired
	RoleDao roleDao;

	/**
	 * 
	 * Create a new Role
	 * @param roleName
	 * @return Role
	 * 
	 */
	public Role create(String roleName) {
		Role role = new Role();
		Role newRole = new Role();
		try {
			role.setRoleCode(UUID.randomUUID().toString());
			role.setRoleName(roleName);
			newRole = roleDao.save(role);
		} catch (Exception e) {
			logger.error("Erreur de création " + roleName, e);
			System.err.println("Erreur de création " + roleName + e);
		}
		return newRole;
	}

}
