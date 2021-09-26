package com.weng.mmall.common;

import org.springframework.core.convert.converter.Converter;

import com.weng.mmall.pojo.User;
/**
 * 为了验证<mvc:annotation-driven conversion-service="conversionService" />
 * @author weng xiaozhi
 *
 */
public class StringToUserConvert implements Converter<String, User> {
 
	@Override
	public User convert(String arg0) {
		User user = new User();
//		if(arg0!=null){
//			String[] split = arg0.split(":");
//			user.setUserName(split[0]);
//			user.setPassword(split[1]);
//			user.setRealName(split[2]);
//		}
		return user;
	}
	
}
