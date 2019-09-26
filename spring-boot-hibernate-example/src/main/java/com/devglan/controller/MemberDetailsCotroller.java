package com.devglan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.devglan.model.MemberDetails;
import com.devglan.service.MemberDetailsService;

@RestController
@RequestMapping(path="/MemberDetails")
public class MemberDetailsCotroller {

	public MemberDetailsCotroller() {
		// TODO Auto-generated constructor stub
	}
	
	@Autowired
	MemberDetailsService memberDetailsService;
	
	@RequestMapping(path="/saveMemberDetails", method = RequestMethod.POST)
	public MemberDetails saveMemberDetails(@RequestBody MemberDetails memberDetails) {
		return memberDetailsService.saveMemberDetails(memberDetails);
	}
	
	@RequestMapping(path="/getListOfMembers", method = RequestMethod.GET)
	public List<MemberDetails> getListOfMembers(){
		return memberDetailsService.getListOfMembers();
	}
	
	
	
	
}
