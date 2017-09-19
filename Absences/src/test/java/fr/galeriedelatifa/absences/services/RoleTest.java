package fr.galeriedelatifa.absences.services;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import fr.galeriedelatifa.absences.data.RoleDao;
import fr.galeriedelatifa.absences.entities.Role;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RoleTest {
	
	@Mock
	RoleDao roleDao;
	
	@InjectMocks
	RoleService roleService;
	
	@Before
	public void init() {
		
	}
	
	@Test
	public void createRole_ok() {
		
	}
	
	@Test
	public void getRoles() throws Exception {
		Role role = new Role();
		role.setId((long) 1);
		role.setRoleCode("rolecode");
		role.setRoleName("rolename");
		List<Role> roles = new ArrayList<>();
		roles.add(role);
		when(roleDao.findAll()).thenReturn(roles);
		assertEquals(roles, roleService.getRoles());
	}
	
	@Test
	public void getRoles_ko() throws Exception {
		Role role = new Role();
		role.setId((long) 1);
		role.setRoleCode("rolecode");
		role.setRoleName("rolename");
		List<Role> roles = new ArrayList<>();
		roles.add(role);
		when(roleDao.findAll()).thenThrow(new Exception());
		assertEquals(roles, roleService.getRoles());
	}

}
