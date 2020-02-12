package edu.bit.board.interceptor;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import edu.bit.board.vo.UserVO;

public class BoardInterceptor extends HandlerInterceptorAdapter {
	
	@Override
	public boolean preHandle(HttpServletRequest req, HttpServletResponse res, Object handler) throws IOException {
		System.out.println("preHandle 실행");
		
		HttpSession session = req.getSession();
		UserVO member = (UserVO) session.getAttribute("member");
		
		if(member == null) {
			//로그인이 안 되어 있는 상태임으로 로그인 폼으로 다시 돌려보냄(redirect)
			res.sendRedirect(req.getContextPath());		
			return false; // 더이상 컨트롤러 요청으로 가지 않도록 false로 반환함
		}
		//preHandle의 return은 컨트롤러 요청 uri로 가도 되냐 안 되냐를 허가하는 의미
		//따라서 true로 하면 컨트롤러 uri로 가게 됨
		return true;
	}
	
	@Override
	public void postHandle(
			HttpServletRequest req, 
			HttpServletResponse res, 
			Object handler,
			ModelAndView modelAndView
			)throws Exception{
		
		super.postHandle(req, res, handler, modelAndView);
		System.out.println("postHandle 실행");

	}
	
}
