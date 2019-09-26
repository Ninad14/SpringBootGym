package com.devglan.dao.impl;


import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.devglan.dao.FeesDetailsDao;
import com.devglan.dao.MemberDetailsDao;
import com.devglan.model.FeesDetails;
import com.devglan.model.MemberDetails;

@Component
@Transactional
public class FeesDetailsDaoImpl implements FeesDetailsDao
{

	public FeesDetailsDaoImpl() {
		// TODO Auto-generated constructor stub
	}
	
	@Autowired
	SessionFactory sessionFactory;
	
	@Autowired
	MemberDetailsDao memberDetailsDao;

	@Override
	public FeesDetails submitFees(FeesDetails feesdetails) {
		Transaction tr = null;
		try {
			Session s = sessionFactory.openSession();
			tr = s.beginTransaction();
			s.saveOrUpdate(feesdetails);
			tr.commit();
			s.flush();
			s.close();
		} catch (HibernateException e) {
			tr.rollback();
			e.printStackTrace();
		}
		return feesdetails;
	}


	@Override
	public List<FeesDetails> getMemberFeesDetails(String mobileNumber) {
		MemberDetails memberDetails = memberDetailsDao.getMemberDetailsByMobileNo(mobileNumber);
		
		Session sessForfees = sessionFactory.getCurrentSession();
		Criteria feesCriteria = sessForfees.createCriteria(FeesDetails.class);
		
		return feesCriteria.add(Restrictions.eq("memberDetails", memberDetails)).list();
	}

}
