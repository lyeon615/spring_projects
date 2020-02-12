package edu.bit.ex;

import java.security.Principal;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@RequestMapping(value = "/login/loginForm", method = RequestMethod.GET)
	public String loginForm() {
		
		return "login/loginForm2";
	}
	
	@RequestMapping(value = "/user/userHome", method = RequestMethod.GET)
	public String userHome() {
		
		return "user/userHome";
	}
	
	@RequestMapping(value = "/admin/adminHome", method = RequestMethod.GET)
	public String adminHome() {
		
		return "admin/adminHome";
	}
	
	@RequestMapping(value = "/login/accessDenied", method = RequestMethod.GET)
	public String accessDenied() {
		
		return "login/accessDenied";
	}
	
	@RequestMapping(value = "/loginInfo", method = RequestMethod.GET)
	public String loginInfo(Principal principal, Model model) {
		//1.Controller�� ���Ͽ� Pincipal��ü�� �������� ���
		String user_id = principal.getName();
		System.out.println("���� ���̵�:" + user_id   );

		//2.SpringContextHolder�� ���Ͽ� �������� ���
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		user_id = auth.getName();
		System.out.println("���� ���̵�:" + user_id   );

        //3.User Ŭ������ ��ȯ �Ͽ� �������� ���
        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        user_id = user.getUsername();
		System.out.println("���� ���̵�:" + user_id   );

		return "home";
	}
}
