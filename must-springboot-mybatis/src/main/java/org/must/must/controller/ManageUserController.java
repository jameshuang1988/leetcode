package org.must.must.controller;

import java.util.List;

import org.must.must.model.ManageUser;
import org.must.must.service.ManageUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ManageUserController {
	@Autowired
	private ManageUserService manageUserService;
	
	@RequestMapping("/manageUser")
    public String indexJson() {
        List<ManageUser> managerUsers = manageUserService.getUserList();
        managerUsers.forEach(
        		value ->System.out.println(String.format("後臺登入帳號密碼 %s,%s", value.getUserId(), value.getUserPassword()))
        );

        return "test/vueTest";
    }
}
