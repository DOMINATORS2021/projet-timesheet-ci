package tn.esprit.spring.services;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import tn.esprit.spring.entities.Entreprise;
import tn.esprit.spring.repository.EntrepriseRepository;

public class EntrepriseServiceImpl implements IEntrepriseService {
	
	
	@Autowired
	EntrepriseRepository entrepriseRepository;

	private static final Logger l = LogManager.getLogger(EntrepriseServiceImpl.class);
	
	@Override
	public List<Entreprise> retrieveAllEntreprise() { 
		List<Entreprise> entreprises = null; 
		try {
	
			l.info("In retrieveAllUsers() : ");
			entreprises = (List<Entreprise>) entrepriseRepository.findAll();  
			for (Entreprise entreprise : entreprises) {
				l.debug("entreprise +++ : " + entreprise);
			} 
			l.info("Out of retrieveAllEntreprises() : ");
		}catch (Exception e) {
			l.error("Error in retrieveAllEntreprises() : " + e);
		}

		return entreprises;
	}
	

	@Override
	public Entreprise addEntreprise(Entreprise u) {
		return entrepriseRepository.save(u); 
	}

	@Override 
	public Entreprise updateEntreprise(Entreprise u) { 
		return entrepriseRepository.save(u);
	}

	@Override
	public void deleteEntreprise(String id) {
		entrepriseRepository.deleteById(Integer.parseInt(id));
	}


	public Entreprise retrieveEntreprise(String id) {
		l.info("in  retrieveEntreprise id = " + id);
		//User u =  userRepository.findById(Long.parseLong(id)).orElse(null);
		//int i = 1/0; 
		Entreprise e =  entrepriseRepository.findById(Integer.parseInt(id)).get(); 
		l.info("entreprise returned : " + e);
		return e; 
	}



}
