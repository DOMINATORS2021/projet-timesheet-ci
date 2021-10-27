package tn.esprit.spring.services;

import java.util.List;

import javax.transaction.Transactional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.Mission;
import tn.esprit.spring.repository.MissionRepository;

@Service
public class MissionServiceImpl implements IMissionService {

	@Autowired
	MissionRepository MissionRepository;

	private static final Logger l = LogManager.getLogger(MissionServiceImpl.class);

	@Override
	public List<Mission> retrieveAllMission() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Mission addMission(Mission m) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteMission(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Mission updateMission(Mission u) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Mission retrieveMission(int id) {
		// TODO Auto-generated method stub
		return null;
	}
}


