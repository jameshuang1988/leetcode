package org.must.must.controller;

import java.util.List;
import java.util.Map;

import org.must.must.controller.base.DefaultController;
import org.must.must.model.ManageUser;
import org.must.must.model.api.ManageUserModel;
import org.must.must.model.api.ManageUserModel.ManageUserModelBuilder;
import org.must.must.service.ManageUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@Api(tags = "Manage user資料")
public class ManageUserController extends DefaultController {
	@Autowired
	private ManageUserService manageUserService;

	@RequestMapping("/manageUser")
	public String getManageUser() {
		List<ManageUser> managerUsers = manageUserService.getUserList();
		managerUsers.forEach(value -> System.out.println(String.format("後臺登入帳號密碼 %s,%s", value.getUserId(), value.getUserPassword())));

		return "test/vueTest";
	}

	@GetMapping("/api/manageUser")
	@ApiOperation(value = "查找所有資料")
	public ManageUserModel apiManageUser() {
		List<ManageUser> managerUsers = manageUserService.getUserList();
		ManageUserModel manageUserModel = ManageUserModel.builder()
				.data(managerUsers)
				.message("SUCCESS")
				.status("0")
				.build();
		return manageUserModel;
	}

	@GetMapping("/api/ManageUser/{userid}")
	@ApiOperation(value = "依照ID查找資料")
	public ManageUserModel apiGetManageUserByid(@PathVariable("userid") String userId) {
		List<ManageUser> managerUsers = manageUserService.getUserByUserId(userId);
		ManageUserModel manageUserModel = ManageUserModel.builder()
				.data(managerUsers)
				.message("SUCCESS")
				.status("0")
				.build();
		return manageUserModel;
	}

	@GetMapping("/api/ManageUserByUserId")
	public ManageUserModel apiGetManageUserByUserId(
			@ApiParam(name = "", value = "使用者帳戶", required = true) @RequestParam(value = "userid", required = true) String userId) {
		List<ManageUser> managerUsers = manageUserService.getUserByUserId(userId);
		ManageUserModel manageUserModel = ManageUserModel.builder()
				.data(managerUsers)
				.message("SUCCESS")
				.status("0")
				.build();
		return manageUserModel;
	}
	

	@PostMapping("/api/search")
	public ManageUserModel apiSearchByUserId(ManageUserModel user) {
		System.out.println("進入api search   userid="+user.getUserId());
		List<ManageUser> managerUsers = manageUserService.getUserByUserId(user.getUserId());
		ManageUserModel manageUserModel = ManageUserModel.builder()
				.data(managerUsers)
				.message("SUCCESS")
				.status("0")
				.build();
		return manageUserModel;
	}
	
	@PostMapping("/api/search2")
	public ManageUserModel apiSearchByUserId2(@RequestParam Map<String, Object> contact,String[] divide) {
		System.out.println("進入api search   userid="+contact);
		for (String divides : divide) {
	        // 資料處理
			log.info("測試資料上傳4:"+divides);
	    }
		List<ManageUser> managerUsers = manageUserService.getUserList();
		ManageUserModel manageUserModel = ManageUserModel.builder()
				.data(managerUsers)
				.userId(contact.get("userId").toString())
				.message("SUCCESS")
				.status("0")
				.build();
		return manageUserModel;
	}

}
