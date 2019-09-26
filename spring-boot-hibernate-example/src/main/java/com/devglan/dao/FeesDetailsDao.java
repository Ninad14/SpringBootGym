package com.devglan.dao;

import java.util.List;

import com.devglan.model.FeesDetails;

public interface FeesDetailsDao {

	FeesDetails submitFees(FeesDetails feesdetails);

	List<FeesDetails> getMemberFeesDetails(String mobileNumber);
}
