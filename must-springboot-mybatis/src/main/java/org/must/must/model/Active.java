/*******************************************************************************
 * Project Key : MÜST869759
 * Create on 2021年5月24日 下午2:55:11
 * Copyright (c) 2021.中華音樂著作權協會版權所有. 
 * 注意：本內容僅限於中華音樂著作權協會內部傳閱，禁止外洩以及用於其他商業目的
 ******************************************************************************/
package org.must.must.model;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Builder;
import lombok.Data;

/**
 * <P>TODO</P>
 * @version $Id$
 * @user xxx  2021年5月24日 下午2:55:11
 */
@Data
@Builder
public class Active implements Serializable{
	/**
	 * TODO
	 */
	private static final long serialVersionUID = 1L;
	private int actId;
	private String actSubject;
	private String actType;
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss.SSSZ")//頁面寫入DB時的格式化   
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyyMMdd", timezone = "GMT+8")//DB導出道頁面時json格式化
	private Date createDate;
}
