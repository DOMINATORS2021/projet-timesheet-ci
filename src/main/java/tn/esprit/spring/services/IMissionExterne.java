package tn.esprit.spring.services;

import java.util.List;

import tn.esprit.spring.entities.MissionExterne;

public interface IMissionExterne {
	
	
	
	
	
	List<MissionExterne> retrieveAllMissionExterne(); 
	MissionExterne addMissionExterne(MissionExterne m);
	void deleteMissionExterne(int id);
	MissionExterne updateMissionExterne(MissionExterne u);
	MissionExterne retrieveMissionExterne(int id);

	
	
	
	
	

}
