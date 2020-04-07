package com.igeek_01_servletapi;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 通过解耦合的方式间接操作ServletAPI
 * @author 鸡哥的
 *
 */
public class IndirectServletAPIAction extends ActionSupport{

	public String execute() throws Exception{
		ActionContext actionContext=ActionContext.getContext();
		//获取页面的参数信息
		Map<String, Object> parameters = actionContext.getParameters();
		String[] value = (String[])parameters.get("name");
		System.out.println(value[0]);
		return NONE;
	}
}
