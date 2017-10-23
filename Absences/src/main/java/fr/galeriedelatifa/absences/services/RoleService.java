/**
 * This class manage the autorisation
 * for the application
 */
package fr.galeriedelatifa.absences.services;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.galeriedelatifa.absences.data.RoleDao;
import fr.galeriedelatifa.absences.entities.Role;
import fr.galeriedelatifa.absences.entities.dto.RoleDto;
import fr.galeriedelatifa.absences.exceptions.CommonException;
import fr.galeriedelatifa.absences.exceptions.ResourceNotFoundException;
import fr.galeriedelatifa.absences.services.utils.AbsencesMapper;

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

	private static final Logger logger = LoggerFactory.getLogger(RoleService.class);

	@Autowired
	RoleDao roleDao;
	
	@Autowired
	AbsencesMapper mapper;

	/**
	 * 
	 * Create a new Role
	 * @param roleName
	 * @return Role
	 * @throws CommonException 
	 * 
	 */
	public Role create(String roleName) throws CommonException {
		String roleBase = Base64.getEncoder().encodeToString(roleName.getBytes());
		Role role = roleDao.findByRoleName(roleBase);
		Role newRole = new Role();
		try {
			if (role==null) {
				newRole.setRoleCode(UUID.randomUUID().toString());
				newRole.setRoleName(roleName);
				roleDao.save(newRole);
			} else {
				throw new CommonException("La ressource existe déjà");
			}
			
		} catch (ResourceNotFoundException e) {
			logger.error("Erreur de création du role" + roleName, e);
			System.err.println("Erreur de création " + roleName + e);
			throw new ResourceNotFoundException("Error !: createRole" + e);
		}
		return role;
	}

	public List<RoleDto> getRoles(){
		List<RoleDto> roles = new ArrayList<>();
		try {
			roles = mapper.rolesEntityToDtos(roleDao.findAll());
		} catch (ResourceNotFoundException e) {
			logger.error("Erreur de lecture de la base role" + e);
			throw new ResourceNotFoundException("Error !: getRoles" + e);

		}
		return roles;
	}

	public Role updateRole(RoleDto roleDto){
		Role role = new Role();
		try {
			role = roleDao.findByRoleCode(roleDto.getRoleCode());
			role.setRoleName(roleDto.getRoleName());
			role = roleDao.save(role);
		} catch (ResourceNotFoundException e) {
			logger.error("Erreur de la mise à jour de la base Role" + role.getRoleName(), e);
			throw new ResourceNotFoundException("Error !: updateRole" + e);
		}
		return role;
	}

	public void deleteRole(RoleDto roleDto) {
		Role role = new Role();
		try {
			role=roleDao.findByRoleCode(roleDto.getRoleCode());
			roleDao.delete(role);
		} catch (ResourceNotFoundException e) {
			logger.error("Erreur de la suppression dans la base Role" + role.getRoleName(), e);
			throw new ResourceNotFoundException("Error !: deleteRole" + e);
		}
				
	}

	public RoleDto getRolebyCode(String roleCode) {
		RoleDto role = new RoleDto();
		try {
			role = mapper.roleEntityToDto(roleDao.findByRoleName(roleCode));
		} catch (ResourceNotFoundException e) {
			logger.error("Erreur de lecture de la base role" + e);
			throw new ResourceNotFoundException("Error !: getRoleByCode" + e);

		}
		return role;
	}

}
