package com.devglan.service;

import java.util.List;

import com.devglan.model.MemberDetails;

public interface MemberDetailsService {

	MemberDetails saveMemberDetails(MemberDetails memberDetails);
	List<MemberDetails> getListOfMembers();
}
