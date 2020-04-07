package com.igeek_01_model;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class LoginAction3 extends ActionSupport implements ModelDriven<UserInfo>{
	
	private UserInfo userInfo=new UserInfo();
	
	private String name;
	
	public String execute() throws Exception{
		System.out.println(userInfo.toString());
		return SUCCESS;
		
	}
	@Override
	public UserInfo getModel() {
		System.out.println("getModel...");
		return userInfo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
