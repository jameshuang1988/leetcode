package org.must.must.service;

import java.util.List;

import org.must.must.model.ManageUser;

public interface ManageUserService {
	List<ManageUser> getUserList();
	List<ManageUser> getUserByUserId(String userId);
}
