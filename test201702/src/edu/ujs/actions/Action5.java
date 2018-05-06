package edu.ujs.actions;

import com.opensymphony.xwork2.ActionSupport;

import edu.ujs.model.User;

public class Action5 extends ActionSupport {
	
	private User user;
	
	public String func1() {
        System.out.println(user.getUsername()+user.getPassword());
		if (user.getUsername().equalsIgnoreCase("zhangsan")
				&& user.getPassword().equalsIgnoreCase("123456"))
			return "success";
		else
			return "fail";
	}

	public void setUser(User user) {
		this.user = user;
	}

	public User getUser() {
		return user;
	}
	

	
}
