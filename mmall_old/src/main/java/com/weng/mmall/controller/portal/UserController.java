package com.weng.mmall.controller.portal;


import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.weng.mmall.service.IUserService;

@Controller
@RequestMapping("user")
public class UserController {
	@Autowired
    private IUserService iUserService;
	
	@Autowired
	private MessageSource msgSource;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class); 
	
//    @RequestMapping(value = "login", method = RequestMethod.POST)
    @GetMapping("login")
    public String login(){
    	String username = "admin";
    	String password ="427338237BD929443EC5D48E24FD2B1A";
    	
    	// messageの設定、取得の学び
    	LOGGER.debug("msg1: {}", msgSource.getMessage("msg1", null, Locale.CHINESE));
    	
        return iUserService.login(username, password);
    }
}
