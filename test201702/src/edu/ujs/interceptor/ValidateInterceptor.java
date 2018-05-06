package edu.ujs.interceptor;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class ValidateInterceptor extends AbstractInterceptor {

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		Object o = invocation.getInvocationContext().getSession().get("user");
		if(o !=null)
			return invocation.invoke();
		else
		return "login";
	}

}
