/*******************************************************************************
 * Project Key : MÜST869759
 * Create on 2021年5月24日 下午3:09:20
 * Copyright (c) 2021.中華音樂著作權協會版權所有. 
 * 注意：本內容僅限於中華音樂著作權協會內部傳閱，禁止外洩以及用於其他商業目的
 ******************************************************************************/
package org.must.must.service.impl;

import java.util.List;

import org.must.must.mapper.ActiveMapper;
import org.must.must.model.Active;
import org.must.must.service.ActiveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <P>TODO</P>
 * @version $Id$
 * @user xxx  2021年5月24日 下午3:09:20
 */
@Service
public class ActiveServiceImpl implements ActiveService{

	@Autowired
	private ActiveMapper ActiveMapper;
	
	/**
	 * @see org.must.must.service.ActiveService#getAllActive()
	 */
	@Override
	public List<Active> getAllActive() {
		return ActiveMapper.getAllActive();
	}

	/**
	 * @see org.must.must.service.ActiveService#getActiveById(java.lang.String)
	 */
	@Override
	public List<Active> getActiveById(String Id) {
		return null;
	}

}
