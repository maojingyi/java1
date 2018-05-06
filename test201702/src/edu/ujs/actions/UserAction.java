package edu.ujs.actions;

import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport implements RequestAware,SessionAware {
	private Map request;
    private Map session;
	@Override
	public void setRequest(Map<String, Object> arg0) {
		request = arg0;
				
	}
	@Override
	public void setSession(Map<String, Object> arg0) {
		session = arg0;
		
	}
	
	public String add(){
		System.out.println("why not");
		request.put("content", "add a new user.");
		return "success";
	}
	public String show(){
		System.out.println("why not");
		request.put("content", "show all users.");
		return "success";
	}
}
