package com.devglan.service;

import java.util.List;

import com.devglan.model.FeesDetails;

public interface FeesDetailsService {

	
	FeesDetails saveFeesDetails(FeesDetails feesDetails);
	List<FeesDetails> getFeesDetailsByMobileNo(String mobileNumber);
	
	
}
