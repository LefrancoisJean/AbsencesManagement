package fr.galeriedelatifa.absences.services;

import static org.junit.Assert.*;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyString;
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
import fr.galeriedelatifa.absences.entities.dto.RoleDto;
import fr.galeriedelatifa.absences.exceptions.ResourceNotFoundException;
import fr.galeriedelatifa.absences.services.utils.AbsencesMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RoleTest {
	
	@Mock
	RoleDao roleDao;
	
	@Mock
	AbsencesMapper mapper;
	
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
		List<RoleDto> roleDto = new ArrayList<>();
		roles.add(role);
		when(roleDao.findAll()).thenReturn(roles);
		roleDto = mapper.rolesEntityToDtos(roles);
		assertEquals(roleDto.size(), roleService.getRoles().size());
	}
	
	@Test(expected=ResourceNotFoundException.class)
	public void getRoles_ko(){

		when(roleDao.findAll()).thenThrow(new ResourceNotFoundException("role"));
		roleService.getRoles();
	}
	
	@Test
	public void getRoleByCode() throws Exception {
		Role role = new Role();
		role.setId((long) 1);
		role.setRoleCode("rolecode");
		role.setRoleName("rolename");
		
		when(roleDao.findByRoleCode(any())).thenReturn(role);
		RoleDto roleDto = mapper.roleEntityToDto(role);
		assertEquals(roleDto, roleService.getRolebyCode(role.getRoleCode()));
	}
	
	@Test(expected=ResourceNotFoundException.class)
	public void getRoleByCode_ko(){

		when(roleDao.findByRoleCode(any())).thenReturn(null);
		roleService.getRoles();
	}

}
