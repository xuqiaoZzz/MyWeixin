package com.result;

import com.opensymphony.xwork2.ActionSupport;

public class GlobalResultAction extends ActionSupport{
	@Override
	public String execute() throws Exception {
		System.out.println("ȫ�ֽ����");
		return SUCCESS;
	}
}
