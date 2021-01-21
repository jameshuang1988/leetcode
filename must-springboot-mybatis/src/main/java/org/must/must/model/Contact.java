/*******************************************************************************
 * Project Key : MÜST869759
 * Create on 2021年1月18日 下午6:47:43
 * Copyright (c) 2021.中華音樂著作權協會版權所有. 
 * 注意：本內容僅限於中華音樂著作權協會內部傳閱，禁止外洩以及用於其他商業目的
 ******************************************************************************/
package org.must.must.model;

/**
 * <P>TODO</P>
 * @version $Id$
 * @user xxx  2021年1月18日 下午6:47:43
 */
public class Contact {

	/**
	 * TODO
	 */
	private String name;
	private String email;
	private String subject;
	private String message;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
}
