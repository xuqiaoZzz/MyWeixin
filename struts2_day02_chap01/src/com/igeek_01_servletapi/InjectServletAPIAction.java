package com.igeek_01_servletapi;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;

import com.opensymphony.xwork2.ActionSupport;

public class InjectServletAPIAction extends ActionSupport implements ServletRequestAware {
	
	private HttpServletRequest request;
	
	public String execute() throws Exception{
		String parameter = request.getParameter("name");
		System.out.println(parameter);
		return NONE;
		
	}
	
	@Override
	public void setServletRequest(HttpServletRequest request) {
		this.request=request;
	}

}
