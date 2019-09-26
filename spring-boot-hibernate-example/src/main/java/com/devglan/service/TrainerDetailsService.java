package com.devglan.service;

import java.util.List;

import com.devglan.model.TrainerDetails;

public interface TrainerDetailsService {

	List<TrainerDetails> getListOfTrainers();
	TrainerDetails savetrainerDetails(TrainerDetails trainerDetails);
	TrainerDetails getTrainerByName(String trainerName);
	TrainerDetails getTrainerByMobileNo(String mobileNo);
}
