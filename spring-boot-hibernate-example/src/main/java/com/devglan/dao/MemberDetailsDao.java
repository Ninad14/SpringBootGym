package com.devglan.dao;

import java.util.List;

import com.devglan.model.MemberDetails;

public interface MemberDetailsDao {
	
	MemberDetails saveMemberDetails(MemberDetails memberDetails);
	List<MemberDetails> getListOfAllMembers();
	MemberDetails getMemberDetailsByMobileNo(String MobileNo);
}
