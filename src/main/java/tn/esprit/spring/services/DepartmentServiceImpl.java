package tn.esprit.spring.services;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import tn.esprit.spring.entities.Departement;
import tn.esprit.spring.repository.DepartementRepository;

public class DepartmentServiceImpl implements IDepartementService {
	
	@Autowired
	DepartementRepository departementRepository;

	private static final Logger l = LogManager.getLogger(UserServiceImpl.class);

	@Override
	public List<Departement> listallDepartements() {
		List<Departement> departements = null; 
		try {
	
			l.info("In retrieveAllDepartements() : ");
			departements = (List<Departement>) departementRepository.findAll();  
			for (Departement departement : departements) {
				l.debug("departement +++ : " + departement);
			} 
			l.info("Out of retrieveAllDepartements() : ");
		}catch (Exception e) {
			l.error("Error in retrieveAllDepartements() : " + e);
		}

		return departements;
	}

	@Override
	public Departement addDepartment(Departement d) {
		return departementRepository.save(d);
	}

	@Override
	public void deleteDepartement(String id) {
	  departementRepository.deleteById(Long.parseLong(id));
	}

	@Override
	public Departement updateDepartement(Departement d) {
		return departementRepository.save(d);
	}

	@Override
	public Departement retrieveDepartement(String id) {
		l.info("in  retrieveDepartement id = " + id);
		Departement d =  departementRepository.findById(Long.parseLong(id)).orElse(null); 
		l.info("departement returned : " + d);
		return d; 
	}

}
