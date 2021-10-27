package tn.esprit.spring.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import tn.esprit.spring.entities.Entreprise;
import tn.esprit.spring.entities.Role;
import tn.esprit.spring.entities.User;
import tn.esprit.spring.services.IEntrepriseService;
import tn.esprit.spring.services.IUserService;

public class EntrepriseServiceImplTest {
	

	@Autowired
	IEntrepriseService us; 

	@Test
	public void testRetrieveAllUsers() {
		List<Entreprise> listEntreprises = us.retrieveAllEntreprise(); 
		// if there are 7 users in DB : 
		Assert.assertEquals(15, listEntreprises.size());
	}
	
	
	@Test
	public void testAddEntreprise() throws ParseException {
		Entreprise u = new Entreprise("Tesla", "BBL"); 
        Entreprise entrepriseAdded = us.addEntreprise(u); 
		Assert.assertEquals(u.getName(), entrepriseAdded.getName());
	}
 
	@Test
	public void testModifyEntreprise() throws ParseException   {
		//Date d = dateFormat.parse("2015-03-23");
		Entreprise u = new Entreprise("BMW", "TTC"); 
		Entreprise entrepriseUpdated  = us.updateEntreprise(u); 
		Assert.assertEquals(u.getName(), entrepriseUpdated.getName());
	}

	@Test
	public void testRetrieveEntreprise() {
		Entreprise entrepriseRetrieved = us.retrieveEntreprise("1"); 
		Assert.assertEquals(1L, entrepriseRetrieved.getId());
	}
	
	@Test
	public void testDeleteUser() {
		us.deleteEntreprise("1");
		Assert.assertNull(us.retrieveEntreprise("1"));
	}
	
	// 5 tests unitaires  

}
