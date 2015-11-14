package com.iitms.rfcampusdata.authentication.daoimpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.iitms.rfcampusdata.authentication.dao.MenuCreationDao;
import com.iitms.rfcampusdata.authentication.entity.MenuMasterEntity;

@Repository
public class MenuCreationDaoImpl implements MenuCreationDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	@SuppressWarnings("unchecked")
	public List<MenuMasterEntity> getMainMainById(int moduleId, int parentMenuId) {
		Session session = this.sessionFactory.getCurrentSession();
		
		ProjectionList projectionList = Projections.projectionList();
		projectionList.add(Projections.property("menuId").as("menuId"));
		projectionList.add(Projections.property("moduleId").as("moduleId"));
		projectionList.add(Projections.property("menuName").as("menuName"));
		projectionList.add(Projections.property("menuLink").as("menuLink"));
		projectionList.add(Projections.property("menuTooltip").as("menuToolTip"));//menuStatus
		projectionList.add(Projections.property("menuStatus").as("active"));
		projectionList.add(Projections.property("menuSerialNumber").as("menuSrno"));
		projectionList.add(Projections.property("parentMenuId").as("parentMenuId"));
		
		Criteria criteria = session.createCriteria(MenuMasterEntity.class);
		List<MenuMasterEntity> menuResponse = (List<MenuMasterEntity>) criteria.setProjection(projectionList)
				.add(Restrictions.eq("moduleId", moduleId))
				.add(Restrictions.eq("parentMenuId", parentMenuId))
				.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP).list();
		
		
		return menuResponse;
		
	}

	@Override
	public boolean addMainMenuCreation(MenuMasterEntity menuMasterEntity) {
	 this.sessionFactory.getCurrentSession().save(menuMasterEntity);
	 return true;
	}
	

	@Override
	public boolean updateMainMenuCreation(MenuMasterEntity menuMasterEntity) {
	 this.sessionFactory.getCurrentSession().update(menuMasterEntity);
	 return true;
	}




	

	

}
