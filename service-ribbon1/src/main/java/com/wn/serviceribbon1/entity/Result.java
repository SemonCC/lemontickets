/**
 <p>Title: Result.java</p>  
* <p>Description: </p>  
* <p>Company: www.woniuixy.com</p>  
* @author zhangjian
* @date 2019年7月20日  
 */
package com.wn.serviceribbon1.entity;

import java.util.List;

/**
* @ClassName	Result.java
* <p>Description： 请简单描述这是干什么的</p>  
* @author	zhangjian  
* @version		1.0
* @date 2019年7月20日  
 */
public class Result {
	private String code;
	
	private String message;
	
	private List list;
	
	private Object object;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List getList() {
		return list;
	}

	public void setList(List list) {
		this.list = list;
	}

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}
}
