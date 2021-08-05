/*******************************************************************************
 * Project Key : MÜST869759
 * Create on 2021年5月24日 下午3:07:09
 * Copyright (c) 2021.中華音樂著作權協會版權所有. 
 * 注意：本內容僅限於中華音樂著作權協會內部傳閱，禁止外洩以及用於其他商業目的
 ******************************************************************************/
package org.must.must.controller;

import java.util.List;

import org.must.must.model.Active;
import org.must.must.model.ManageUser;
import org.must.must.model.api.ActiveModel;
import org.must.must.model.api.ManageUserModel;
import org.must.must.service.ActiveService;
import org.must.must.service.ManageUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;

/**
 * <P>TODO</P>
 * @version $Id$
 * @user xxx  2021年5月24日 下午3:07:09
 */
@RestController
@Slf4j
@Api(tags = "Active資料")
public class ActiveController {
	@Autowired
	private ActiveService activeService;
	
	@RequestMapping("/active")
	public ModelAndView index() {
		ModelAndView view = new ModelAndView();
		view.setViewName("en/Active");
		return view;
	}

	
	
	@GetMapping("/api/active")
	@ApiOperation(value = "查找所有Active資料")
	public ActiveModel apiActive() {
		System.out.println("進入activeController!!!");
		List<Active> active = activeService.getAllActive();
		System.out.println("xml搜尋:"+active);
		ActiveModel activeModel = ActiveModel.builder()
				.data(active)
				.message("SUCCESS")
				.status("0")
				.build();
		return activeModel;
	}
	
	
	
	
//	@GetMapping("/api/activeById/{actId}")
//	@ApiOperation(value = "根據ID查找Active資料") 
//	public ActiveModel apiActiveById2(@PathVariable("actId")String Id) {//如在執行sql語句時你有時並不希望讓變量進行處理，而是直接賦值執行，這時就要用到(${ａ})了，在使用時還要這樣賦值 @Param(value="a") String a。
//		System.out.println("進入activeController!" + Id); 
//		List<Active> active = activeService.getActiveById(Id); 
//		System.out.println("xml搜尋:"+active); 
//		ActiveModel activeModel	= ActiveModel.builder() 
//				.data(active) 
//				.message("SUCCESS") 
//				.status("0") 
//				.build(); 
//		return 	activeModel; 
//	}
	
	//url需丟參數，例：http://127.0.0.1/api/activeById?userId=12，這樣才會取到１２
	@GetMapping("/api/activeById")
	@ApiOperation(value = "根據查找Active資料") 
	public ActiveModel apiActiveById(@RequestParam(value="userId")String Id) {
	System.out.println("進入activeController!"); 
	List<Active> active = activeService.getActiveById(Id); 
	System.out.println("xml搜尋:"+active); 
	ActiveModel activeModel	= ActiveModel.builder() 
			.data(active) 
			.message("SUCCESS") 
			.status("0") 
			.build(); 
	return 	activeModel; 
	}
	

	//url的參數直接加在網址上，例：http://127.0.0.1/api/activeById/12
	@GetMapping("/api/activeById/{userId}")
	@ApiOperation(value = "根據ID查找Active資料") 
	public ActiveModel apiActiveById1(@PathVariable("userId")String Id) {//如在執行sql語句時你有時並不希望讓變量進行處理，而是直接賦值執行，這時就要用到(${ａ})了，在使用時還要這樣賦值 @Param(value="a") String a。
		System.out.println("進入activeController!" + Id); 
		List<Active> active = activeService.getActiveById(Id); 
		System.out.println("xml搜尋:"+active); 
		ActiveModel activeModel	= ActiveModel.builder() 
				.data(active) 
				.message("SUCCESS") 
				.status("0") 
				.build(); 
		return 	activeModel; 
	}
	
	
}
