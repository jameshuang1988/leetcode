/*******************************************************************************
 * Project Key : MÜST869759
 * Create on 2021年2月2日 下午2:37:49
 * Copyright (c) 2021.中華音樂著作權協會版權所有. 
 * 注意：本內容僅限於中華音樂著作權協會內部傳閱，禁止外洩以及用於其他商業目的
 ******************************************************************************/
package org.must.must.controller.overseaSocieties;

import javax.servlet.http.HttpServletRequest;

import org.must.must.controller.base.DefaultController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.slf4j.Slf4j;

/**
 * <P>TODO</P>
 * @version $Id$
 * @user xxx  2021年2月1日 下午2:37:49
 */

@Controller
@Slf4j
@RequestMapping(value = "must")
public class OverseaSocietiesController extends DefaultController{
	
	@GetMapping("oversea_societies")
	public String index(HttpServletRequest request) {
		log.info("進入oversea_societies Controller");
		return "mustEn/oversea_societies";
	}	
}
