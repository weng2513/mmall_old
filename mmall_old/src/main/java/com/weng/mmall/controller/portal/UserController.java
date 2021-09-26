package com.weng.mmall.controller.portal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.weng.mmall.service.IUserService;

@Controller
@RequestMapping("user")
public class UserController {
	@Autowired
    private IUserService iUserService;
	
//    @RequestMapping(value = "login", method = RequestMethod.POST)
    @GetMapping("login")
    public String login(){
    	String username = "admin";
    	String password ="427338237BD929443EC5D48E24FD2B1A";
        return iUserService.login(username, password);
    }
}
