package com.result;

import com.opensymphony.xwork2.ActionSupport;

public class ResultType2Action extends ActionSupport{

	@Override
	public String execute() throws Exception {
		System.out.println("result type 2");
		return SUCCESS;
	}
}
