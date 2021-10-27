package tn.esprit.spring.services;

import java.util.List;

import tn.esprit.spring.entities.Departement;

public interface IDepartementService {
	List<Departement> ListAllDepartements(); 
	Departement addDepartment(Departement d);
	void deleteDepartement(String id);
	Departement updateDepartement(Departement d);
	Departement retrieveDepartement(String id);
}
