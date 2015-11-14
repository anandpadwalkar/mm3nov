package com.iitms.rfcampusdomain.authentication.service;

import java.util.List;

import com.iitms.rfcampusdata.authentication.entity.UniversityEntity;

public interface UniversityAndBoardService
{
	public boolean addUniversity(UniversityEntity entity);
	
	public List<UniversityEntity> getAllUniversity();
	public boolean updateUniversity(UniversityEntity entity);
}
