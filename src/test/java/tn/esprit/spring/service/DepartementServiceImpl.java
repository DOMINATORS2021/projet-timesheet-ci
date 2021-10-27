package tn.esprit.spring.service;

import java.text.ParseException;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import tn.esprit.spring.entities.Departement;
import tn.esprit.spring.services.IDepartementService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DepartementServiceImpl {
	@Autowired
	IDepartementService ds; 

	@Test
	public void testRetrieveAllDepartements() {
		List<Departement> listdepartements = ds.ListAllDepartements(); 
		// if there are 7 users in DB : 
		Assert.assertEquals(15, listdepartements.size());
	}
	
	
	@Test
	public void testAddDepartement() throws ParseException {
		Departement d = new Departement("Ressources Humaines"); 
		Departement departementAdded = ds.addDepartment(d); 
		Assert.assertEquals(d.getName(), departementAdded.getName());
	}
 
	@Test
	public void testModifyDepartement() throws ParseException   {
		Departement d = new Departement("Ressources Humaines 2"); 
		Departement departementUpdated  = ds.updateDepartement(d); 
		Assert.assertEquals(d.getName(), departementUpdated.getName());
	}

	@Test
	public void testRetrieveDepartement() {
		Departement departementRetrieved = ds.retrieveDepartement("1"); 
		Assert.assertEquals(1L, departementRetrieved.getId().longValue());
	}
	
	@Test
	public void testDeleteDepartement() {
		ds.deleteDepartement("1");
		Assert.assertNull(ds.retrieveDepartement("1"));
	}
}
