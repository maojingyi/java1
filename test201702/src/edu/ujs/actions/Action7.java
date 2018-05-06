package edu.ujs.actions;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import edu.ujs.model.User;

public class Action7 extends ActionSupport implements ModelDriven<User> {
	
	private User user = new User();
	private Map application;
	private Map session;
	private Map request;
	
	@Override
	public User getModel() {
		// TODO Auto-generated method stub
		return user;
	}
	
	public String func1() {
		System.out.println(user.getUsername()+user.getPassword());
		application = (Map)ActionContext.getContext().getApplication();
		session = (Map)ActionContext.getContext().getSession();
		request = (Map)ActionContext.getContext().get("request");
		
		request.put("name", user.getUsername());
		request.put("pw", user.getPassword());
		
		if (user.getUsername().equalsIgnoreCase("zhangsan")
				&& user.getPassword().equalsIgnoreCase("123456"))
			return "success";
		else
			return "fail";
	}

}
