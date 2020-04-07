package com.igeek_01_model;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction2 extends ActionSupport{
	
	private UserInfo userInfo;
	
	@Override
	public String execute() throws Exception{
		System.out.println(userInfo.toString());
		return NONE;
		
	}
	public UserInfo getUserInfo() {
		System.out.println("getUserInfo");
		return userInfo;
	}

	public void setUserInfo(UserInfo userInfo) {
		System.out.println("setUserInfo");
		this.userInfo = userInfo;
	}

	
}
