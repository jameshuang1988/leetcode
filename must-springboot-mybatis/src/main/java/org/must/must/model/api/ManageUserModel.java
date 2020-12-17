package org.must.must.model.api;

import java.util.ArrayList;
import java.util.List;

import org.must.must.model.ManageUser;
import org.springframework.context.annotation.Bean;

public class ManageUserModel {
	private String status;
	private ArrayList<ManageUser> data;
	private String message;

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
