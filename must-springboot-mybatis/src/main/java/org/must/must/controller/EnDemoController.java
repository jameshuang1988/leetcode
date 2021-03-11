/*******************************************************************************
 * Project Key : MÜST869759
 * Create on 2020年12月18日 下午4:52:46
 * Copyright (c) 2021.中華音樂著作權協會版權所有. 
 * 注意：本內容僅限於中華音樂著作權協會內部傳閱，禁止外洩以及用於其他商業目的
 ******************************************************************************/
package org.must.must.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.must.must.model.Contact;
//import org.must.must.aop.logAspect;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import lombok.extern.slf4j.Slf4j;

/**
 * <P>TODO</P>
 * @version $Id$
 * @user xxx  2020年12月18日 下午4:52:46
 */

@Controller
@Slf4j
@RequestMapping(value = "must")
public class EnDemoController {
	
	@GetMapping("index")// 带上 “/” 是绝对路径，不带  “/” 是相对路径。这个"/" 其实起到连接作用， 如果只是单纯的一个地址，写不写 “/” 都可以。
	public String index(HttpServletRequest request) {		
		log.info("測試log");
		return "en/indexDemo";
	}
	@PostMapping("index")
	public String test(HttpServletRequest request) {		
		log.info("測試資料上傳");
		System.out.println("=======GET Process=======");
        Map<String,String[]> requestMsg = request.getParameterMap();
//        Enumeration<String> requestHeader = request.getHeaderNames();
//        System.out.println("------- header -------");
//        while(requestHeader.hasMoreElements()){
//            String headerKey=requestHeader.nextElement().toString();
//            //所有Header值
//
//            System.out.println("headerKey="+headerKey+";value="+request.getHeader(headerKey));
//        }
        System.out.println("------- parameter -------");
        for(String key :requestMsg.keySet())
        {
            for(int i=0;i<requestMsg.get(key).length;i++)
            {
                //所有請求参数值
                System.out.println("key="+key+";value="+requestMsg.get(key)[i].toString());
            }
        }
		return "en/index";
	}
	@PostMapping("index2")
	public String test2(@RequestParam Map<String, Object> contact,HttpServletRequest request) {	
		log.info("測試資料上傳2:"+contact);
		request.setAttribute("contact", contact);
		return "en/blank";
	}
	
	@PostMapping("index3")
	public String test3(Contact contact) {	
		log.info("測試資料上傳3:"+contact.getName());
		return "en/blank";
	}
	
	
	
		
}

