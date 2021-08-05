/*******************************************************************************
 * Project Key : MÜST869759
 * Create on 2021年5月24日 下午2:48:14
 * Copyright (c) 2021.中華音樂著作權協會版權所有. 
 * 注意：本內容僅限於中華音樂著作權協會內部傳閱，禁止外洩以及用於其他商業目的
 ******************************************************************************/
package org.must.must.mapper;

import java.util.List;

import org.must.must.model.Active;
import org.must.must.model.Cases;
import org.springframework.stereotype.Repository;

/**
 * <P>TODO</P>
 * @version $Id$
 * @user xxx  2021年5月24日 下午2:48:14
 */



@Repository
public interface CasesMapper {
	
	List<Cases> getAllCase();	
	List<Cases> getCaseByCase(String Id);
	List<Cases> getCaseByCaseNo(String id);

}
