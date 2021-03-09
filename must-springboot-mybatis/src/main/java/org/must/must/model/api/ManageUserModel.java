package org.must.must.model.api;

import java.io.Serializable;
import java.util.List;

import org.must.must.model.ManageUser;

import lombok.Builder;
import lombok.Data;
@Data
@Builder
public class ManageUserModel implements Serializable {
	/**
	 * TODO
	 */
	private static final long serialVersionUID = 7630976759662424586L;
	private String userId;
	private String status;
	private List<ManageUser> data;
	private String message;

}
