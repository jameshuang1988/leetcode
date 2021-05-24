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
import org.springframework.web.bind.annotation.RestController;

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
	
	@GetMapping("/api/active")
	@ApiOperation(value = "查找所有Active資料")
	public ActiveModel apiActive() {
		System.out.println("進入activeController!");
		List<Active> active = activeService.getAllActive();
		System.out.println("xml搜尋:"+active);
		ActiveModel activeModel = ActiveModel.builder()
				.data(active)
				.message("SUCCESS")
				.status("0")
				.build();
		return activeModel;
	}
	
	/*
	 * @GetMapping("/api/activeById")
	 * @ApiOperation(value = "根據查找Active資料") public ActiveModel apiActiveById(String Id) {
	 * System.out.println("進入activeController!"); List<Active> active =
	 * activeService.getActiveById(Id); System.out.println("xml搜尋:"+active); ActiveModel activeModel
	 * = ActiveModel.builder() .data(active) .message("SUCCESS") .status("0") .build(); return
	 * activeModel; }
	 */
	
}
