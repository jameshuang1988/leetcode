/*******************************************************************************
 * Project Key : MÜST869759
 * Create on 2021年5月24日 下午2:55:11
 * Copyright (c) 2021.中華音樂著作權協會版權所有. 
 * 注意：本內容僅限於中華音樂著作權協會內部傳閱，禁止外洩以及用於其他商業目的
 ******************************************************************************/
package org.must.must.model.api;

import java.io.Serializable;
import java.util.List;

import org.must.must.model.Cases;

import lombok.Builder;
import lombok.Data;

/**
 * <P>TODO</P>
 * @version $Id$
 * @user xxx  2021年5月24日 下午2:55:11
 */
@Data
@Builder
public class CasesModel implements Serializable{
	/**
	 * TODO
	 */
	private static final long serialVersionUID = 1L;
	private String caseNo;
	private String status;
	private List<Cases> data;
	private String message;
}
