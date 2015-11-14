package com.iitms.rfcampusdata.authentication.dao;

import java.util.List;

import com.iitms.rfcampusdata.authentication.entity.MenuMasterEntity;

public interface MenuCreationDao {

    public List<MenuMasterEntity> getMainMainById(int moduleId, int parentMenuId);

    public boolean addMainMenuCreation(MenuMasterEntity menuMasterEntity);

    public boolean updateMainMenuCreation(MenuMasterEntity menuMasterEntity);
}
