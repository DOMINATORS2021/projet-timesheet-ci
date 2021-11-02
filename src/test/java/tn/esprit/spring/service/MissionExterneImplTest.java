package tn.esprit.spring.service;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import tn.esprit.spring.entities.Role;
import tn.esprit.spring.entities.Mission;
import tn.esprit.spring.entities.MissionExterne;
import tn.esprit.spring.services.IMissionExterne;
import tn.esprit.spring.services.IMissionService;
import tn.esprit.spring.services.IUserService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MissionExterneImplTest {

	@Autowired
	IMissionExterne ms;

	@Test
	public void testRetrieveAllMission() {
		List<MissionExterne> listMissionExterne = ms.retrieveAllMissionExterne();
		// if there are 7 users in DB :
		Assert.assertEquals(15, listMissionExterne.size());
	}

	@Test
	public void testRetrieveMission() {
		MissionExterne MissionRetrieved = ms.retrieveMissionExterne(9);
		Assert.assertEquals(1L, MissionRetrieved.getId());
	}
	
	
	
	
	@Test
	public void testAddlistMissionExterne() throws ParseException {
		MissionExterne m = new MissionExterne("benjannet", "M-externe-addedd-by-youssef", "youssef.benjannet@esprit.tn", 120);
		MissionExterne MissionAdded = ms.addMissionExterne(m);
		Assert.assertEquals(m.getId(), MissionAdded.getId());
	}

	@Test
	public void testModifyMission() throws ParseException {
		MissionExterne m = new MissionExterne(6,"benjannet", "M-externe-Modified-by-youssef", "youssef.benjannet@esprit.tn", 150);
		MissionExterne MissionUpdated = ms.updateMissionExterne(m);
		Assert.assertEquals(m.getId(), MissionUpdated.getId());
	}

	@Test
	public void testDeleteMission() {
		ms.deleteMissionExterne(7);
		Assert.assertNull(ms.retrieveMissionExterne(1));
	}

}
