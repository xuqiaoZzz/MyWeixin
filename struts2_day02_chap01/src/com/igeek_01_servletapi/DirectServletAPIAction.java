package com.igeek_01_servletapi;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class DirectServletAPIAction extends ActionSupport{
	
	public String execute(){
		//1.获取页面参数
		HttpServletRequest request = ServletActionContext.getRequest();
		String parameter = request.getParameter("name");
		request.setAttribute("msg", parameter);
		return SUCCESS;
		
	}
}
