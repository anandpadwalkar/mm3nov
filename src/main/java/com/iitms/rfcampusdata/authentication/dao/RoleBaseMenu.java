package com.iitms.rfcampusdata.authentication.dao;

import java.util.List;

import com.iitms.rfcampusdata.authentication.entity.RoleMenuAllocation;
import com.iitms.rfcampusdata.authentication.entity.RoleMenuResponse;

public interface RoleBaseMenu {
	public List<RoleMenuAllocation> loadMenu(int id);
	public List<RoleMenuResponse> getMenuList(int moduleId);
}
