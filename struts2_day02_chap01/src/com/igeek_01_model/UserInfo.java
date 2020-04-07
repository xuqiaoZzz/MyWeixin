package com.igeek_01_model;

public class UserInfo {
	private String name;
	private String passworld;
	
	public UserInfo(){
		System.out.println("UserInfo构造方法被调用");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("setUsername....");
		this.name = name;
	}
	public String getPassworld() {
		return passworld;
	}
	public void setPassworld(String passworld) {
		System.out.println("setPassworld....");
		this.passworld = passworld;
	}
	
	@Override
	public String toString() {
		return "UserInfo [name=" + name + ", passworld=" + passworld + "]";
	}
	
	
}
