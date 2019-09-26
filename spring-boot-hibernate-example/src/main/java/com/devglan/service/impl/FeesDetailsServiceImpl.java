package com.devglan.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devglan.dao.FeesDetailsDao;
import com.devglan.model.FeesDetails;
import com.devglan.service.FeesDetailsService;



@Service
public class FeesDetailsServiceImpl implements FeesDetailsService{

	public FeesDetailsServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	
	@Autowired
	FeesDetailsDao feesDetailsDao;

	@Override
	public FeesDetails saveFeesDetails(FeesDetails feesDetails) {
		return feesDetailsDao.submitFees(feesDetails);
		 
	}

	@Override
	public List<FeesDetails> getFeesDetailsByMobileNo(String mobileNumber) {
		
		
		return feesDetailsDao.getMemberFeesDetails(mobileNumber);
	}

	
	
}
