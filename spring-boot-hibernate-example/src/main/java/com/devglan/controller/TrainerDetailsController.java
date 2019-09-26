package com.devglan.controller;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.devglan.model.TrainerDetails;
import com.devglan.service.TrainerDetailsService;

@RestController
@RequestMapping(path="/TrainerDetails")
public class TrainerDetailsController {

	public TrainerDetailsController() {
		// TODO Auto-generated constructor stub
	}

	@Autowired
	TrainerDetailsService trainerDetailsService;
	
	@RequestMapping(path="/listtrainers" , method = RequestMethod.GET)
	public List<TrainerDetails> getListOfTrainer(){
		
		return trainerDetailsService.getListOfTrainers();
	}
	
	@RequestMapping(path="/saveTrainerDetails" , method = RequestMethod.POST)
	public TrainerDetails saveTrainerDetails(@RequestBody TrainerDetails trainerDetails)
	{	
		trainerDetailsService.savetrainerDetails(trainerDetails);
		return trainerDetails;
	}
	
	@RequestMapping(path="/getTrainerDetailsByName/{trainerName}" , method = RequestMethod.GET)
	public TrainerDetails getTrainerDetailsByName(@PathVariable("trainerName") String trainerName)
	{
		return trainerDetailsService.getTrainerByName(trainerName);
	}
	
	
	@RequestMapping(path="/getTrainerDetailsByMobileNo/{trainerMobileNo}" , method = RequestMethod.GET)
	public TrainerDetails getTrainerDetailsByMobileNo(@PathVariable("trainerMobileNo") String trainerMobileNo)
	{
		return trainerDetailsService.getTrainerByMobileNo(trainerMobileNo);
	}
}
