package com.devglan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.devglan.model.FeesDetails;
import com.devglan.service.FeesDetailsService;

@RestController
@RequestMapping(path="/FeesDetails")
public class FeesDetailsController {

	public FeesDetailsController() {
		// TODO Auto-generated constructor stub
	}
	
	@Autowired
	FeesDetailsService feesDetailsService;
	
	@RequestMapping(path="/submitFees" , method = RequestMethod.POST)
	public FeesDetails submitFees(@RequestBody FeesDetails feesdetails) {
		return feesDetailsService.saveFeesDetails(feesdetails);
	}

	@RequestMapping(path="/getFeesByMobileNo/{mobileNo}", method = RequestMethod.GET)
	public List<FeesDetails> getFeesDetailsByMobileNo(@PathVariable("mobileNo") String mobileNumber) {
		return feesDetailsService.getFeesDetailsByMobileNo(mobileNumber);
	} 
	
	
}
