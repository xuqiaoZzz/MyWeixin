package com.igeek_01_model;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction1 extends ActionSupport{
	
	//Action��Ϊmodel��ͨ����Ա�������Ժ�setter�������ղ������з�װ����ʽһ��
	public String execute() throws Exception{
		System.out.println(name);
		System.out.println(passworld);
		
		UserInfo user=new UserInfo();
		user.setName(name);
		user.setPassworld(passworld);
		
		System.out.println(user.toString());
		return NONE;
		
	}
	
	private String name;
	private String passworld;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassworld() {
		return passworld;
	}
	public void setPassworld(String passworld) {
		this.passworld = passworld;
	}
	
	@Override
	public String toString() {
		return "LoginAction1 [name=" + name + ", passworld=" + passworld + "]";
	}
	
}
