package tn.esprit.spring.services;

import java.util.List;

import tn.esprit.spring.entities.MissionExterne;

public interface IMissionExterne {

	List<MissionExterne> retrieveAllMissionExterne();

	MissionExterne addMissionExterne(MissionExterne m);

	void deleteMissionExterne(int id);

	MissionExterne updateMissionExterne(MissionExterne m);

	MissionExterne retrieveMissionExterne(int id);

}
