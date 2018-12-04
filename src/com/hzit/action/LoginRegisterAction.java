package com.hzit.action;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.StrutsStatics;

import com.hzit.entity.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class LoginRegisterAction extends ActionSupport implements ModelDriven<User>,StrutsStatics {

	private User user = new User();

	@Override
	public User getModel() {
		return user;
	}

	public String login() {
		System.out.println(user);
		if ("admin".equals(user.getUname()) && "admin".equals(user.getPassword())) {
			ActionContext act = ActionContext.getContext();
			Map<String, Object> app = act.getApplication();
			Integer counter = (Integer) app.get("counter");
			counter = counter == null ? 1 : counter + 1;
			app.put("counter", counter);
//			act.setApplication(app);
			((HttpServletRequest) act.get(HTTP_REQUEST)).setAttribute("user", user);
			System.out.println("counter" + counter);
			return "login_success";
		}
		return "login_failure";
	}

}
