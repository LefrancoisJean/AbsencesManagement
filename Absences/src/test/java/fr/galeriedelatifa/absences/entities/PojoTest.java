package fr.galeriedelatifa.absences.entities;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import fr.galeriedelatifa.absences.entities.Absences;
import fr.galeriedelatifa.absences.entities.Employe;
import fr.galeriedelatifa.absences.entities.Reliquat;
import fr.galeriedelatifa.absences.entities.RequestNumber;
import fr.galeriedelatifa.absences.entities.RhDepartment;
import fr.galeriedelatifa.absences.entities.Role;
import fr.galeriedelatifa.absences.entities.Statut;
import fr.galeriedelatifa.absences.entities.Team;
import fr.galeriedelatifa.absences.entities.Type;
import fr.galeriedelatifa.absences.entities.Users;
import fr.galeriedelatifa.absences.entities.dto.AbsencesDto;
import pl.pojo.tester.api.assertion.Method;

import static pl.pojo.tester.api.assertion.Assertions.assertPojoMethodsFor;


@SpringBootTest
public class PojoTest {
	
	@Test
	public void testPojoRole() {
		final Class<?> classUnderTest = Role.class;
		
		assertPojoMethodsFor(classUnderTest)
		.testing(Method.GETTER, Method.SETTER, Method.CONSTRUCTOR)	
		.areWellImplemented();
	}
	
	@Test
	public void testPojoRh() {
		final Class<?> classUnderTest = RhDepartment.class;
		
		assertPojoMethodsFor(classUnderTest)
		.testing(Method.GETTER, Method.SETTER, Method.CONSTRUCTOR)	
		.areWellImplemented();
	}
	
	@Test
	public void testPojoTeam() {
		final Class<?> classUnderTest = Team.class;
		
		assertPojoMethodsFor(classUnderTest)
		.testing(Method.GETTER, Method.SETTER, Method.CONSTRUCTOR)	
		.areWellImplemented();
	}
	
	@Test
	public void testPojoStatut() {
		final Class<?> classUnderTest = Statut.class;
		
		assertPojoMethodsFor(classUnderTest)
		.testing(Method.GETTER, Method.SETTER, Method.CONSTRUCTOR)	
		.areWellImplemented();
	}
	
	@Test
	public void testPojoType() {
		final Class<?> classUnderTest = Type.class;
		
		assertPojoMethodsFor(classUnderTest)
		.testing(Method.GETTER, Method.SETTER, Method.CONSTRUCTOR)	
		.areWellImplemented();
	}
	
	@Test
	public void testPojoRequestNumber() {
		final Class<?> classUnderTest = RequestNumber.class;
		
		assertPojoMethodsFor(classUnderTest)
		.testing(Method.GETTER, Method.SETTER, Method.CONSTRUCTOR)	
		.areWellImplemented();
	}
	
	@Test
	public void testPojoReliquat() {
		final Class<?> classUnderTest = Reliquat.class;
		
		assertPojoMethodsFor(classUnderTest)
		.testing(Method.GETTER, Method.SETTER, Method.CONSTRUCTOR)	
		.areWellImplemented();
	}
	
	@Test
	public void testPojoEmploye() {
		final Class<?> classUnderTest = Employe.class;
		
		assertPojoMethodsFor(classUnderTest)
		.testing(Method.GETTER, Method.SETTER, Method.CONSTRUCTOR)	
		.areWellImplemented();
	}
	
	@Test
	public void testPojoAbsences() {
		final Class<?> classUnderTest = Absences.class;
		
		assertPojoMethodsFor(classUnderTest)
		.testing(Method.GETTER, Method.SETTER, Method.CONSTRUCTOR)	
		.areWellImplemented();
	}
	
	@Test
	public void testPojoUser() {
		final Class<?> classUnderTest = Users.class;
		
		assertPojoMethodsFor(classUnderTest)
		.testing(Method.GETTER, Method.SETTER, Method.CONSTRUCTOR)	
		.areWellImplemented();
	}


}
