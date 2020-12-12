package org.must.must.service.impl;

import java.util.List;

import org.must.must.mapper.ManageUserMapper;
import org.must.must.model.ManageUser;
import org.must.must.service.ManageUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ManageUserServiceImpl implements ManageUserService {

	// TODO Auto-generated method stub
	@Autowired
	ManageUserMapper ManageUserMapper;

	@Override
	public List<ManageUser> getUserList() {		  
		return ManageUserMapper.getAll();	    
	}

}
