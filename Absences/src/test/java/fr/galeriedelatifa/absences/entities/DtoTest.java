package fr.galeriedelatifa.absences.entities;

import static pl.pojo.tester.api.assertion.Assertions.assertPojoMethodsFor;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import fr.galeriedelatifa.absences.entities.dto.AbsencesDto;
import fr.galeriedelatifa.absences.entities.dto.EmployeDto;
import fr.galeriedelatifa.absences.entities.dto.ReliquatDto;
import fr.galeriedelatifa.absences.entities.dto.RhDepartmentDto;
import fr.galeriedelatifa.absences.entities.dto.RoleDto;
import fr.galeriedelatifa.absences.entities.dto.StatutDto;
import fr.galeriedelatifa.absences.entities.dto.TeamDto;
import fr.galeriedelatifa.absences.entities.dto.TypeDto;
import fr.galeriedelatifa.absences.entities.dto.UserDto;
import pl.pojo.tester.api.assertion.Method;


@SpringBootTest
public class DtoTest {
	
	@Test
	public void testPojoRoleDto() {
		final Class<?> classUnderTest = RoleDto.class;
		
		assertPojoMethodsFor(classUnderTest)
		.testing(Method.GETTER, Method.SETTER, Method.CONSTRUCTOR)	
		.areWellImplemented();
	}
	
	@Test
	public void testPojoRhDto() {
		final Class<?> classUnderTest = RhDepartmentDto.class;
		
		assertPojoMethodsFor(classUnderTest)
		.testing(Method.GETTER, Method.SETTER, Method.CONSTRUCTOR)	
		.areWellImplemented();
	}
	
	@Test
	public void testPojoTeamDto() {
		final Class<?> classUnderTest = TeamDto.class;
		
		assertPojoMethodsFor(classUnderTest)
		.testing(Method.GETTER, Method.SETTER, Method.CONSTRUCTOR)	
		.areWellImplemented();
	}
	
	@Test
	public void testPojoStatutDto() {
		final Class<?> classUnderTest = StatutDto.class;
		
		assertPojoMethodsFor(classUnderTest)
		.testing(Method.GETTER, Method.SETTER, Method.CONSTRUCTOR)	
		.areWellImplemented();
	}
	
	@Test
	public void testPojoTypeDTO() {
		final Class<?> classUnderTest = TypeDto.class;
		
		assertPojoMethodsFor(classUnderTest)
		.testing(Method.GETTER, Method.SETTER, Method.CONSTRUCTOR)	
		.areWellImplemented();
	}
	
	@Test
	public void testPojoReliquatDto() {
		final Class<?> classUnderTest = ReliquatDto.class;
		
		assertPojoMethodsFor(classUnderTest)
		.testing(Method.GETTER, Method.SETTER, Method.CONSTRUCTOR)	
		.areWellImplemented();
	}
	
	@Test
	public void testPojoEmployeDto() {
		final Class<?> classUnderTest = EmployeDto.class;
		
		assertPojoMethodsFor(classUnderTest)
		.testing(Method.GETTER, Method.SETTER, Method.CONSTRUCTOR)	
		.areWellImplemented();
	}
	
	@Test
	public void testPojoAbsencesDto() {
		final Class<?> classUnderTest = AbsencesDto.class;
		
		assertPojoMethodsFor(classUnderTest)
		.testing(Method.GETTER, Method.SETTER, Method.CONSTRUCTOR)	
		.areWellImplemented();
	}
	
	@Test
	public void testPojoUserDto() {
		final Class<?> classUnderTest = UserDto.class;
		
		assertPojoMethodsFor(classUnderTest)
		.testing(Method.GETTER, Method.SETTER, Method.CONSTRUCTOR)	
		.areWellImplemented();
	}

}
