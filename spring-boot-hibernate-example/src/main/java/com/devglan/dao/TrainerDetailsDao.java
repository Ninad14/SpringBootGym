package com.devglan.dao;

import java.util.List;

import com.devglan.model.TrainerDetails;

public interface TrainerDetailsDao {

	List<TrainerDetails> getListOfTrainers();
	TrainerDetails saveTrainerDetails(TrainerDetails trainerDetails);
	TrainerDetails getTrainerByName(String trainerName);
	TrainerDetails getTrainerByMobileNo(String mobileNo);
}
