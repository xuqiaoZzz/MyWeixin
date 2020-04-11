package com.igeek.download;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
//12第一次修改
public class DownloadAction extends ActionSupport{

	@Override
	public String execute() throws Exception {
		
		String path = "d://";
		String filename="你好.txt";
		//下载需要两头一流
		//contentType:文件类型
		String contentType = ServletActionContext.getServletContext().getMimeType(filename);
		//inputStream:流
		InputStream inputStream = new FileInputStream(new File(path+filename));
		
		//如果下载的文件命中含有中文，咋们就进行中文编码
		String agent = ServletActionContext.getRequest().getHeader("user-agent");
		filename = FileUtils.encodeDownloadFilename(filename, agent);
		
		
		//contentDisposition:设置文件的打开方式，和打开的文件的名字
		String contentDisposition = "attachment;filename="+filename;
		
		
		//将两头一流放入值栈中
		ActionContext.getContext().put("contentType", contentType);
		ActionContext.getContext().put("contentDisposition", contentDisposition);
		ActionContext.getContext().put("inputStream", inputStream);
		
		return SUCCESS;
		
	}
}
