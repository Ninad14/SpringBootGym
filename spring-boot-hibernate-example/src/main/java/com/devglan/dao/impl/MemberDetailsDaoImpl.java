package com.devglan.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import com.devglan.dao.MemberDetailsDao;
import com.devglan.model.MemberDetails;


@Component
@Transactional
public class MemberDetailsDaoImpl implements MemberDetailsDao{

	public MemberDetailsDaoImpl() {

	}

	@Autowired
	SessionFactory sessionFactory;
	
	

	@Override
	public MemberDetails saveMemberDetails(MemberDetails memberDetails) {
		Transaction tr = null;
		try {
			Session s = sessionFactory.openSession();
			tr = s.beginTransaction();
			s.saveOrUpdate(memberDetails);
			tr.commit();
			s.flush();
			s.close();
		} catch (HibernateException e) {
			tr.rollback();
			e.printStackTrace();
		}
		return memberDetails;
	}


	@Override
	@SuppressWarnings("unchecked")
	public List<MemberDetails> getListOfAllMembers() {
		Criteria criteria = null;
		Session sessGetListOfMembers = sessionFactory.getCurrentSession();
		criteria = sessGetListOfMembers.createCriteria(MemberDetails.class);
		return criteria.list();
	}


	@Override
	public MemberDetails getMemberDetailsByMobileNo(String MobileNo) {
		Session sessMemberByMobile = sessionFactory.getCurrentSession();
		Criteria criteria = sessMemberByMobile.createCriteria(MemberDetails.class);
		
		return (MemberDetails) criteria.add(Restrictions.eq("mobileNumber",MobileNo)).uniqueResult();
	}

	
}
