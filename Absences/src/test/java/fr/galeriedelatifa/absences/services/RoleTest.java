package fr.galeriedelatifa.absences.services;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import fr.galeriedelatifa.absences.data.RoleDao;
import fr.galeriedelatifa.absences.entities.Role;

@SpringBootTest
public class RoleTest {
	
	@Mock
	RoleDao roleDao;
	
	@InjectMocks
	RoleService roleService;
	
	@Test
	public void cresteTestOk() {
		Role role = new Role();
		role.setId((long) 1); 
		role.setRoleCode("roleCode");
		role.setRoleName("roleName");
		System.out.println(role.getRoleCode());
		when(roleDao.saveRole(role)).thenReturn(role);
		System.out.println(role.getRoleCode());
		assertEquals("roleCode", roleService.create(anyString()));
	}

}
