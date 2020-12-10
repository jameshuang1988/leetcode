package org.must.must.util;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.fastjson.JSONObject;


public class WebSocketUtil {

	private static final Logger log = LoggerFactory.getLogger(WebSocketUtil.class);
	public static final String SECRETARY_HEADER_URL = "";
	public static final String CUSTOMER_HEADER_URL = "";

	/**
	 * 
	 * 發送webSocket訊息至指定觀察者名單(群體通知)
	 * 
	 * @user James 2020年9月4日 
	 */
	public static void notifySubject(String hostName, String type, JSONObject content, String subjectName)
			throws IOException {

		JSONObject data = new JSONObject();
		data.put("type", type);
		data.put("content", content);
		data.put("subjectName", subjectName);
		Map<String, Object> header = new HashMap<>();
		header.put("Content-Type", "application/x-www-form-urlencoded");

		String url = "http://" + hostName + "/webSocket/notifySubject";
//		log.info("通知webSocket專案url:[{}],參數:[{}]", url, data.toString());

		RequestUtil.doPost(url, data.toString(), header);

	}

	/**
	 * 
	 * 通知單一用戶
	 * 
	 * @user James 202018年9月4日
	 */
	public static void notifyAccount(String hostName, String type, JSONObject content, String subjectName,
			String account) throws IOException {

		JSONObject data = new JSONObject();
		data.put("account", account);
		data.put("type", type);
		data.put("content", content);
		data.put("subjectName", subjectName);

		Map<String, Object> header = new HashMap<>();
		header.put("Content-Type", "application/x-www-form-urlencoded");

		String url = "http://" + hostName + "/webSocket/notifySingleAccount";
		log.info("通知webSocket專案url:[{}],參數:[{}]", url, data.toString());

		RequestUtil.doPost(url, data.toString(), header);

	}

}
