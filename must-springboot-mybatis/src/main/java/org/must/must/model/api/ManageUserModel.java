package org.must.must.model.api;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.must.must.model.ManageUser;

public class ManageUserModel implements Serializable {
	/**
	 * TODO
	 */
	private static final long serialVersionUID = 7630976759662424586L;
	private String userId;
	private String status;
	private ArrayList<ManageUser> data;
	private String message;
	
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public ArrayList<ManageUser> getData() {
		return data;
	}

	public void setData(List<ManageUser> managerUsers) {
		this.data = (ArrayList<ManageUser>) managerUsers;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
