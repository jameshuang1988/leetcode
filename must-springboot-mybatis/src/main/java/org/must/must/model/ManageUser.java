package org.must.must.model;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ManageUser implements Serializable{
	/**
	 * TODO
	 */
	private static final long serialVersionUID = -4798403544212475872L;
	private String userId;
	private String userPassword;
	private String userType;
	private String userStatus;
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss.SSSZ")//頁面寫入DB時的格式化   
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyyMMdd", timezone = "GMT+8")//DB導出道頁面時json格式化
	private Date createDate;
	
	
}
