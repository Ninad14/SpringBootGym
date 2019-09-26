package com.devglan.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.devglan.dao.TrainerDetailsDao;
import com.devglan.model.TrainerDetails;

@Component
@Transactional
public class TrianerDetailsDaoImpl implements TrainerDetailsDao{

	public TrianerDetailsDaoImpl() {
		// TODO Auto-generated constructor stub
	}

	@Autowired
	SessionFactory sessionFactory;

	public List<TrainerDetails> getListOfTrainers(){

		Criteria criteria = null;
		try {
			Session sessGetTrainer = sessionFactory.getCurrentSession();
			criteria = sessGetTrainer.createCriteria(TrainerDetails.class);
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return criteria.list();

	}

	@Override
	public TrainerDetails saveTrainerDetails(TrainerDetails trainerDetails) {
		Transaction tr =null;
		try {
			Session s = sessionFactory.openSession();
			tr =s.beginTransaction();
			s.saveOrUpdate(trainerDetails);
			tr.commit();
			s.flush();
			s.close();	
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		return trainerDetails;
	}

	@Override
	public TrainerDetails getTrainerByName(String trainerName) {
		Criteria criteria = null;
		TrainerDetails trainerDetails = null;
		try {
			Session sessGetTrainer = sessionFactory.getCurrentSession();
			criteria = sessGetTrainer.createCriteria(TrainerDetails.class);
			Criterion name = Restrictions.eq("trainerName", trainerName);
			criteria.add(name);
			trainerDetails = (TrainerDetails)criteria.uniqueResult();
		} catch (HibernateException e) {
			
			e.printStackTrace();
		}
		return trainerDetails;
	}

	@Override
	public TrainerDetails getTrainerByMobileNo(String mobileNo) {
		Criteria criteria = null;
		TrainerDetails trainerDetails = null;
		try {
			Session sessGetTrainer = sessionFactory.getCurrentSession();
			criteria = sessGetTrainer.createCriteria(TrainerDetails.class);
			Criterion ctrMobileNo = Restrictions.eq("trainerMobileNumber", mobileNo);
			criteria.add(ctrMobileNo);
			trainerDetails = (TrainerDetails)criteria.uniqueResult();
		} catch (HibernateException e) {
			
			e.printStackTrace();
		}
		return trainerDetails;
	}

}
