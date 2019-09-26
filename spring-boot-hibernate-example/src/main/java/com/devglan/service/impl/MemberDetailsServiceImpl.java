package com.devglan.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devglan.dao.MemberDetailsDao;
import com.devglan.model.MemberDetails;
import com.devglan.service.MemberDetailsService;

@Service
public class MemberDetailsServiceImpl implements MemberDetailsService{

	public MemberDetailsServiceImpl() {
		
	}
	
	@Autowired
	MemberDetailsDao memberDetailsDao;
	
	@Override
	public MemberDetails saveMemberDetails(MemberDetails memberDetails) {
		return memberDetailsDao.saveMemberDetails(memberDetails);
	}

	@Override
	public List<MemberDetails> getListOfMembers() {
		return memberDetailsDao.getListOfAllMembers();
	}

}
