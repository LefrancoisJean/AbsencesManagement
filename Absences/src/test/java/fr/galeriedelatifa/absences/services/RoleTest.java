package fr.galeriedelatifa.absences.services;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.when;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import fr.galeriedelatifa.absences.Config;
import fr.galeriedelatifa.absences.data.RoleDao;
import fr.galeriedelatifa.absences.entities.Role;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Config.class)
public class RoleTest {

	@Mock
	RoleDao roleDao;

	@InjectMocks
	RoleService roleService;

	@Test
	public void createTestOk() {
		Role role = new Role();
		role.setRoleName("roleName");
		Role role2 = new Role();
		role2.setRoleName("roleName");
		Mockito.when(roleDao.save(role)).thenReturn(role2);
		System.out.println(role2.getRoleName());
		assertEquals(null, roleService.create(anyString()));

	}

	@Test(expected = Exception.class)
	public void createTestKo() throws Exception {
		Role role = new Role();
		Mockito.when(roleDao.save(role)).thenThrow(new SQLException());
		assertNull(roleService.create(anyString()));
	}

	// Test avec une liste
	@Test
	public void getRolesTest() throws SQLException {
		List<Role> role = new ArrayList<Role>();
		when(roleDao.findAll()).thenReturn(role);

		assertEquals(role, roleService.getRoles());
	}

	// Test avec une liste
	@Test(expected = Exception.class)
	public void getRolesTestKO() throws Exception {
		List<Role> role = new ArrayList<Role>();
		when(roleDao.findAll()).thenThrow(new Exception());

		assertNull(roleService.getRoles());
	}

}
