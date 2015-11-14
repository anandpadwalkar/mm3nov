package com.iitms.rfcampusdata.authentication.dao;

import java.util.List;

public interface RoleLinksAllotmentDao {

	public List<Integer> getAllocatedMenuIds(int roleId);
	public boolean allotMenus(int roleId, String menuIds);
	public boolean updateAllotedMenus(int roleId, String menuIds);
}
