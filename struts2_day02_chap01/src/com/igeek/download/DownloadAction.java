package com.igeek.download;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class DownloadAction extends ActionSupport{

	@Override
	public String execute() throws Exception {
		
		String path = "d://";
		String filename="���.txt";
		//������Ҫ��ͷһ��
		//contentType:�ļ�����
		String contentType = ServletActionContext.getServletContext().getMimeType(filename);
		//inputStream:��
		InputStream inputStream = new FileInputStream(new File(path+filename));
		
		//������ص��ļ����к������ģ�զ�Ǿͽ������ı���
		String agent = ServletActionContext.getRequest().getHeader("user-agent");
		filename = FileUtils.encodeDownloadFilename(filename, agent);
		
		
		//contentDisposition:�����ļ��Ĵ򿪷�ʽ���ʹ򿪵��ļ�������
		String contentDisposition = "attachment;filename="+filename;
		
		
		//����ͷһ������ֵջ��
		ActionContext.getContext().put("contentType", contentType);
		ActionContext.getContext().put("contentDisposition", contentDisposition);
		ActionContext.getContext().put("inputStream", inputStream);
		
		return SUCCESS;
		
	}
}
