package com.iitms.rfcampusdomain.authentication.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.iitms.rfcampusdata.authentication.dao.RoleBaseMenu;
import com.iitms.rfcampusdata.authentication.entity.RoleMenuAllocation;
import com.iitms.rfcampusdata.authentication.entity.RoleMenuResponse;
import com.iitms.rfcampusdomain.authentication.service.MenuService;

@Service
@Transactional
public class MenuServiceImpl implements MenuService
{
	@Autowired
   private 	RoleBaseMenu roleBaseMenu;

	@Override
	public List<RoleMenuAllocation> getMenuOfRole(int roleId) {
		return roleBaseMenu.loadMenu(roleId);
	}

	@Override
	public List<RoleMenuResponse> getMenuList(int moduleId) {
		return roleBaseMenu.getMenuList(moduleId);
	}

}
