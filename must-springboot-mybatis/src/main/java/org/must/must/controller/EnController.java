/*******************************************************************************
 * Project Key : MÜST869759
 * Create on 2020年12月18日 下午4:52:46
 * Copyright (c) 2021.中華音樂著作權協會版權所有. 
 * 注意：本內容僅限於中華音樂著作權協會內部傳閱，禁止外洩以及用於其他商業目的
 ******************************************************************************/
package org.must.must.controller;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.apache.http.protocol.HTTP;
import org.must.must.aop.logAspect;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import lombok.extern.slf4j.Slf4j;

/**
 * <P>TODO</P>
 * @version $Id$
 * @user xxx  2020年12月18日 下午4:52:46
 */

@Controller
@Slf4j
@RequestMapping(value = "must")
public class EnController {
	
	@GetMapping("index")// 带上 “/” 是绝对路径，不带  “/” 是相对路径。这个"/" 其实起到连接作用， 如果只是单纯的一个地址，写不写 “/” 都可以。
	public String index(HttpServletRequest request) {		
		log.info("測試log");
		return "en/index";
	}
}
