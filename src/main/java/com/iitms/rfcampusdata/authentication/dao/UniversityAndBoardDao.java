package com.iitms.rfcampusdata.authentication.dao;

import java.util.List;

import com.iitms.rfcampusdata.authentication.entity.UniversityEntity;

public interface UniversityAndBoardDao 
{
     public boolean addUniversityAndBoard(UniversityEntity entity);
     public List<UniversityEntity> getUniversityList();
     public boolean updateUniversity(UniversityEntity entity);
}
