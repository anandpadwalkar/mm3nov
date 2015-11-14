package com.iitms.rfcampusdata.authentication.daoimpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.iitms.rfcampusdata.authentication.dao.UniversityAndBoardDao;
import com.iitms.rfcampusdata.authentication.entity.UniversityEntity;
@Repository
public class UniversityAndBoardDaoImpl implements UniversityAndBoardDao
{
	private static final Logger logger = LoggerFactory.getLogger(UniversityAndBoardDaoImpl.class);
    @Autowired
    SessionFactory sessionFactory;
    @SuppressWarnings("unchecked")
	@Override
	public boolean addUniversityAndBoard(UniversityEntity entity)
    {
    	this.sessionFactory.getCurrentSession().save(entity);
		
    	return true;	
	
	}
	@Override
	@SuppressWarnings("unchecked")
	public List<UniversityEntity> getUniversityList()
	{
		List<UniversityEntity> list = 
				this.sessionFactory.getCurrentSession()
				.createCriteria(UniversityEntity.class)
				.addOrder(Order.asc("uid"))
				.list();
		logger.info("List of university:"+list);
		return list;
	}
	@Override
	public boolean updateUniversity(UniversityEntity entity) 
    {
		   
          Session session= this.sessionFactory.getCurrentSession();
          UniversityEntity universityEntity=(UniversityEntity)session.get(UniversityEntity.class,entity.getUid());   
          logger.info("universityEntity : " + universityEntity);
		  universityEntity.setUnivCode(entity.getUnivCode());
		  universityEntity.setUnivName(entity.getUnivName());
		  universityEntity.setActive(entity.getActive());
		  session.update(universityEntity);
          return true;
	}	
	

}
