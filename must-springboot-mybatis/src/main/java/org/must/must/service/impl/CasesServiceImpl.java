/*******************************************************************************
 * Project Key : MÜST869759
 * Create on 2021年5月24日 下午3:09:20
 * Copyright (c) 2021.中華音樂著作權協會版權所有. 
 * 注意：本內容僅限於中華音樂著作權協會內部傳閱，禁止外洩以及用於其他商業目的
 ******************************************************************************/
package org.must.must.service.impl;

import java.util.List;

import org.must.must.mapper.CasesMapper;
import org.must.must.model.Cases;
import org.must.must.service.CasesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <P>TODO</P>
 * @version $Id$
 * @user xxx  2021年6月24日 下午3:09:20
 */
@Service
public class CasesServiceImpl implements CasesService{

	@Autowired
	private CasesMapper CasesMapper;
	
	/**
	 * @see org.must.must.service.CasesService#getAllCase()
	 */
	@Override
	public List<Cases> getAllCase() {
		return CasesMapper.getAllCase();
	}

	/**
	 * @see org.must.must.service.CasesService#getCaseByCase()
	 */
	@Override
	public List<Cases> getCaseByCase(String Id) {
		return CasesMapper.getCaseByCase(Id);
	}

	/**
	 * @see org.must.must.service.CasesService#getCaseByCaseNo(java.lang.String)
	 */
	@Override
	public List<Cases> getCaseByCaseNo(String CASE_NO) {
		return CasesMapper.getCaseByCaseNo(CASE_NO);
	}


}
