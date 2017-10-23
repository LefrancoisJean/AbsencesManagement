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
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.node.ObjectNode;

import fr.galeriedelatifa.absences.entities.Role;
import fr.galeriedelatifa.absences.entities.dto.RoleDto;
import fr.galeriedelatifa.absences.exceptions.CommonException;
import fr.galeriedelatifa.absences.services.RoleService;

/**
 * @author jean
 *
 */
@RestController
@RequestMapping("gestAbs/v1/role")
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
	public ResponseEntity<Object> save(@RequestBody ObjectNode roleName) {
		String name = roleName.get("role_name").asText();
		if(name.isEmpty()) {
			return new ResponseEntity<>(new CommonException("Le nom ne doit pas être vide"), HttpStatus.BAD_REQUEST);
		} else {
			try {
				roleService.create(name);
			} catch (CommonException e) {
				return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
			}
		}
		return new ResponseEntity<>(HttpStatus.CREATED);
		
	}
	
	@GetMapping()
	public ResponseEntity<Object> getRole(){
		List<RoleDto> roles;
		try {
			roles = roleService.getRoles();
		} catch (Exception e) {
			return new ResponseEntity<>(new Exception(e), HttpStatus.BAD_REQUEST);		
		}
		return new ResponseEntity<>(roles, HttpStatus.OK);
	}
	
	@PutMapping()
	public ResponseEntity<Object> updateRole(@RequestBody @Valid RoleDto roleDto, BindingResult result){
		Map<String, Object> map = new HashMap<>();
		Role role = new Role();
		try {
			if (result.hasErrors()) {
				for (FieldError error : result.getFieldErrors()) {
					map.put(error.getField(), String.format("message:%s", error.getDefaultMessage()));
				}
				return new ResponseEntity<>(map, HttpStatus.BAD_REQUEST);
			} else {
				role = roleService.updateRole(roleDto);
			}
		} catch (Exception sqle) {
			return new ResponseEntity<>(sqle, HttpStatus.BAD_REQUEST);
		}
		return  new ResponseEntity<>(role.getRoleName() + " modifié.",HttpStatus.OK);
	}
	
	@DeleteMapping()
	public ResponseEntity<Object> deleteRole(@RequestBody @Valid RoleDto roleDto, BindingResult result){
		Map<String, Object> map = new HashMap<>();
		try {
			if (result.hasErrors()) {
				for (FieldError error : result.getFieldErrors()) {
					map.put(error.getField(), String.format("message:%s", error.getDefaultMessage()));
				}
				return new ResponseEntity<>(map, HttpStatus.BAD_REQUEST);
			} else {
				roleService.deleteRole(roleDto);
			}
		} catch (Exception sqle) {
			return new ResponseEntity<>(sqle, HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
	
	@GetMapping(value="/{role_code}")
	public ResponseEntity<Object> getRoleByCode(@PathVariable(value="role_code") String roleCode ){
		RoleDto role = new RoleDto();
		try {
			role = roleService.getRolebyCode(roleCode);
		} catch (Exception e) {
			return ResponseEntity.badRequest().body(e);		
		}
		return new ResponseEntity<>(role,HttpStatus.OK);
	}

}
