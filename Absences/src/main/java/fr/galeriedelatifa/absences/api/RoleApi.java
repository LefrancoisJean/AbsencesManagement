/**
 * This class manage the autorisation
 * for the apllication
 */
package fr.galeriedelatifa.absences.api;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
	RoleService role;
	/**
	 * Création d'une autorisation
	 * @param roleName
	 * @return
	 */
	@PostMapping()
	public ResponseEntity<?> save(@RequestBody String roleName) {
		
		
			String name = role.create(roleName);
		
		return ResponseEntity.ok("Autorisation "+name+" créée");
		
		
	}
	

}
