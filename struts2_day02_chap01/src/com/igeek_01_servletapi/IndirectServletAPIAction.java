package com.igeek_01_servletapi;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * ͨ������ϵķ�ʽ��Ӳ���ServletAPI
 * @author �����
 *
 */
public class IndirectServletAPIAction extends ActionSupport{

	public String execute() throws Exception{
		ActionContext actionContext=ActionContext.getContext();
		//��ȡҳ��Ĳ�����Ϣ
		Map<String, Object> parameters = actionContext.getParameters();
		String[] value = (String[])parameters.get("name");
		System.out.println(value[0]);
		return NONE;
	}
}
