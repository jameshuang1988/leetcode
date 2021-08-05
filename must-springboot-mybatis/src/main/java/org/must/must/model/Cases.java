/*******************************************************************************
 * Project Key : MÜST869759
 * Create on 2021年7月8日 下午2:57:40
 * Copyright (c) 2021.中華音樂著作權協會版權所有. 
 * 注意：本內容僅限於中華音樂著作權協會內部傳閱，禁止外洩以及用於其他商業目的
 ******************************************************************************/
package org.must.must.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Builder;
import lombok.Data;



@Data
@Builder
public class Cases implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyyMMdd", timezone = "GMT+8")//DB導出道頁面時json格式化
	private String CASE_NO;
	private String USER_NO;
	private String case_type;
	private String case_class;
	private String case_uname;
	private String CASE_SNAME;
	private String CASE_CDATE;
	private String CASE_REASON;
	private String CASE_SDATE;
	private String CASE_NOTE;
	private String CASE_KDATE;
	private String CASE_CNAME;
	
}
