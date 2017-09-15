package fr.galeriedelatifa.absences.entities;

import static pl.pojo.tester.api.assertion.Assertions.assertPojoMethodsFor;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import fr.galeriedelatifa.absences.entities.input.EmployeInput;
import fr.galeriedelatifa.absences.entities.input.RhDepartmentInput;
import fr.galeriedelatifa.absences.entities.input.TeamInput;
import pl.pojo.tester.api.assertion.Method;

@SpringBootTest
public class InputTest {
	
	@Test
	public void testPojoEmployeInput() {
		final Class<?> classUnderTest = EmployeInput.class;
		
		assertPojoMethodsFor(classUnderTest)
		.testing(Method.GETTER, Method.SETTER, Method.CONSTRUCTOR)	
		.areWellImplemented();
	}
	
	@Test
	public void testPojoTeamInput() {
		final Class<?> classUnderTest = TeamInput.class;
		
		assertPojoMethodsFor(classUnderTest)
		.testing(Method.GETTER, Method.SETTER, Method.CONSTRUCTOR)	
		.areWellImplemented();
	}
	
	@Test
	public void testPojoRhInput() {
		final Class<?> classUnderTest = RhDepartmentInput.class;
		
		assertPojoMethodsFor(classUnderTest)
		.testing(Method.GETTER, Method.SETTER, Method.CONSTRUCTOR)	
		.areWellImplemented();
	}

}
