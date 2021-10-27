package tn.esprit.spring.services;

import java.util.List;

import tn.esprit.spring.entities.Mission;

public interface IMissionService { 
	 
	List<Mission> retrieveAllMission(); 
	Mission addMission(Mission m);
	void deleteMission(int id);
	Mission updateMission(Mission u);
	Mission retrieveMission(int id);

} 
 