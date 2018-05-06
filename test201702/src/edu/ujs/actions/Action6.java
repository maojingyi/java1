package edu.ujs.actions;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import edu.ujs.model.User;

public class Action6 extends ActionSupport implements ModelDriven<User> {

	private User user = new User();
	@Override
	public User getModel() {
		// TODO Auto-generated method stub
		return user;
	}
	
	public String func1() {
		System.out.println(user.getUsername()+user.getPassword());
		if (user.getUsername().equalsIgnoreCase("zhangsan")
				&& user.getPassword().equalsIgnoreCase("123456"))
			return "success";
		else
			return "fail";
	}
	
	

}
