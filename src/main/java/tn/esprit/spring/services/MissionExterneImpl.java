package tn.esprit.spring.services;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.Mission;
import tn.esprit.spring.entities.MissionExterne;
import tn.esprit.spring.repository.MissionExterneRepository;


@Service
public class MissionExterneImpl implements IMissionExterne{

	@Autowired
	MissionExterneRepository missionExterneRepository;

	private static final Logger l = LogManager.getLogger(MissionServiceImpl.class);

	
	
	@Override
	public List<MissionExterne> retrieveAllMissionExterne() {
		List<MissionExterne> missionExterne = null;
		try {

			l.info("In retrieveAllMissionExterne() : ");
			missionExterne = (List<MissionExterne>) missionExterneRepository.findAll();
			for (MissionExterne missionsssss : missionExterne) {
				l.debug("user +++ : " + missionsssss);
			}
			l.info("Out of retrieveAllMissionExterne() : ");
		} catch (Exception e) {
			l.error("Error in retrieveAllMission() : " + e);
		}

		return missionExterne;

	}

	@Override
	public MissionExterne addMissionExterne(MissionExterne m) {
		return missionExterneRepository.save(m);

	}

	@Override
	public void deleteMissionExterne(int id) {
		missionExterneRepository.deleteById(id);

	}

	@Override
	public MissionExterne updateMissionExterne(MissionExterne m) {
		return missionExterneRepository.save(m);

	}

	@Override
	public MissionExterne retrieveMissionExterne(int id) {
		l.info("in  retrieveMissionExterne id = " + id);
		MissionExterne m =  missionExterneRepository.findById(id).orElse(null);
		//int i = 1/0; 
		//Mission m =  MissionRepository.findById(id).get(); 
		l.info("user returned : " + m);
		return m;

	}

	
	
	
}
