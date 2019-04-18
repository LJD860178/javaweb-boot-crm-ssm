package cn.gdcp.core.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.gdcp.core.po.User;
import cn.gdcp.core.service.UserService;

@Controller
public class UserController {
	@Autowired
    private UserService userService;
	@RequestMapping(value = "/login.action" , method = RequestMethod.POST)
	public String login(User user ,  Model model , HttpSession session) {
		User user_ = userService.findUser(user.getUser_code() , user.getUser_password());
		if(user!=null) {
			session.setAttribute("USER_SESSION", user_);
			return "customer"; 
		}
		model.addAttribute("msg", "’À∫≈ªÚ√‹¬Î¥ÌŒÛ, «Î÷ÿ–¬ ‰»Î");
		return "login";
	}

	@RequestMapping(value="/toCustomer.action")
	public String toCustomer() {
		return "customer";
	}
	
	@RequestMapping(value="/logout.action")
	public String logout(HttpServletRequest request) {
		request.getSession().invalidate();
		return "redirect:login.action";
	}
	
	@RequestMapping(value="login.action")
	public String toLogin() {
		return "login";
	}
}
