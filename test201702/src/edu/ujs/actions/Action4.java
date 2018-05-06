package edu.ujs.actions;

import com.opensymphony.xwork2.ActionSupport;

public class Action4 extends ActionSupport {

	private String username;
	private String password;

	public String func1() {
		 System.out.println(username+password);
		if (username.equalsIgnoreCase("zhangsan")
				&& password.equalsIgnoreCase("123456"))
			return "success";
		else
			return "fail";
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
