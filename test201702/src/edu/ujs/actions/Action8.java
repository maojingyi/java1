package edu.ujs.actions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import edu.ujs.model.User;

public class Action8 extends ActionSupport implements ModelDriven<User>,
		ApplicationAware, SessionAware, RequestAware {
	private User user = new User();
	private Map application;
	private Map session;
	private Map request;
	private List list = new ArrayList();
	@Override
	public User getModel() {
		// TODO Auto-generated method stub
		return user;
	}
	
	public List getList() {
		return list;
	}

	public void setList(List list) {
		this.list = list;
	}

	public String func1() {
		System.out.println(user.getUsername()+user.getPassword());
		list.add("beijing");
		list.add("shanghai");
		list.add("guangzhou");
		
		
		
		request.put("list", list);
		
		if (user.getUsername().equalsIgnoreCase("zhangsan")
				&& user.getPassword().equalsIgnoreCase("123456")){
			session.put("user", user);
			return "success";
		}
			
		else
			return "fail";
	}

	@Override
	public void setRequest(Map<String, Object> arg0) {
		request = arg0;
		
	}

	@Override
	public void setSession(Map<String, Object> arg0) {
		session = arg0;
		
	}

	@Override
	public void setApplication(Map<String, Object> arg0) {
		application = arg0;
		
	}

}
