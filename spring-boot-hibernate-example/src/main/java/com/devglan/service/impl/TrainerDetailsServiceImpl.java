package com.devglan.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devglan.dao.TrainerDetailsDao;
import com.devglan.dao.impl.TrianerDetailsDaoImpl;
import com.devglan.model.TrainerDetails;
import com.devglan.service.TrainerDetailsService;

@Service
public class TrainerDetailsServiceImpl implements TrainerDetailsService{

		
	@Autowired
	TrainerDetailsDao trainerDetailsDao;

	@Override
	public List<TrainerDetails> getListOfTrainers() {
		return trainerDetailsDao.getListOfTrainers();
	}

	@Override
	public TrainerDetails savetrainerDetails(TrainerDetails trainerDetails) {
		return trainerDetailsDao.saveTrainerDetails(trainerDetails);
	}

	@Override
	public TrainerDetails getTrainerByName(String trainerName) {
		return trainerDetailsDao.getTrainerByName(trainerName);
	}

	@Override
	public TrainerDetails getTrainerByMobileNo(String mobileNo) {
		return trainerDetailsDao.getTrainerByMobileNo(mobileNo);
	}

}
