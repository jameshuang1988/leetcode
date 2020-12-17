package org.must.must.controller;

import java.util.List;

import org.must.must.model.ManageUser;
import org.must.must.model.api.ManageUserModel;
import org.must.must.service.ManageUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiParam;

@RestController
@Api( tags = "Manage User")
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
public class ManageUserController {
	@Autowired
	private ManageUserService manageUserService;

	@RequestMapping("/manageUser")
	public String getManageUser() {
		List<ManageUser> managerUsers = manageUserService.getUserList();
		managerUsers.forEach(value -> System.out.println(String.format("後臺登入帳號密碼 %s,%s", value.getUserId(), value.getUserPassword())));

		return "test/vueTest";
	}

	@GetMapping("/api/manageUser")
	public ManageUserModel apiManageUser() {
		List<ManageUser> managerUsers = manageUserService.getUserList();
		ManageUserModel manageUserModel = new ManageUserModel();
		manageUserModel.setData(managerUsers);
		manageUserModel.setMessage("SUCCESS");
		manageUserModel.setStatus("0");
		return manageUserModel;
	}

	@GetMapping("/api/ManageUser/{userid}")
	public ManageUserModel apiGetManageUserByid(@PathVariable("userid") String userId) {
		List<ManageUser> managerUsers = manageUserService.getUserByUserId(userId);
		ManageUserModel manageUserModel = new ManageUserModel();
		manageUserModel.setData(managerUsers);
		manageUserModel.setMessage("SUCCESS");
		manageUserModel.setStatus("0");
		return manageUserModel;
	}

	@GetMapping("/api/ManageUserByUserId")
	public ManageUserModel apiGetManageUserByUserId(
			@ApiParam(name = "", value = "使用者帳戶", required = true) @RequestParam(value = "userid", required = true) String userId) {
		List<ManageUser> managerUsers = manageUserService.getUserByUserId(userId);
		ManageUserModel manageUserModel = new ManageUserModel();
		manageUserModel.setData(managerUsers);
		manageUserModel.setMessage("SUCCESS");
		manageUserModel.setStatus("0");
		return manageUserModel;
	}

}
