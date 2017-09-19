/**
 * This class manage the autorisation
 * for the apllication
 */
package fr.galeriedelatifa.absences.api;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.galeriedelatifa.absences.entities.Role;
import fr.galeriedelatifa.absences.entities.dto.RoleDto;
import fr.galeriedelatifa.absences.services.RoleService;

/**
 * @author jean
 *
 */
@RestController
@RequestMapping("/roles")
public class RoleApi implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Autowired
	RoleService roleService;
	/**
	 * Création d'une autorisation
	 * @param roleName
	 * @return 200 OK
	 */
	@PostMapping()
	public ResponseEntity<String> save(@RequestBody String roleName) {
	
			Role name = roleService.create(roleName);
		
		return ResponseEntity.ok("Autorisation "+name.getRoleCode()+" créée");
		
	}
	
	@GetMapping()
	public ResponseEntity<?> getRole(){
		List<Role> roles;
		try {
			roles = roleService.getRoles();
		} catch (Exception e) {
			return ResponseEntity.badRequest().body(e);		
		}
		return ResponseEntity.ok(roles);
	}
	
	@PutMapping()
	public ResponseEntity<?> updateRole(@Valid RoleDto roleDto, BindingResult result){
		Map<String, Object> map = new HashMap<>();
		Role role = new Role();
		try {
			if (result.hasErrors()) {
				for (FieldError error : result.getFieldErrors()) {
					map.put(error.getField(), String.format("message:%s", error.getDefaultMessage()));
					return ResponseEntity.badRequest().body(map);
				}
			} else {
				role = roleService.updateRole(roleDto);
			}
		} catch (Exception sqle) {
			return ResponseEntity.badRequest().body(sqle);
		}
		return ResponseEntity.ok(role.getRoleName() + " modifié.");
	}

}
