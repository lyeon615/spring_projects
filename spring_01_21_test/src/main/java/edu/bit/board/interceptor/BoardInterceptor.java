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
		System.out.println("preHandle ����");
		
		HttpSession session = req.getSession();
		UserVO member = (UserVO) session.getAttribute("member");
		
		if(member == null) {
			//�α����� �� �Ǿ� �ִ� ���������� �α��� ������ �ٽ� ��������(redirect)
			res.sendRedirect(req.getContextPath());		
			return false; // ���̻� ��Ʈ�ѷ� ��û���� ���� �ʵ��� false�� ��ȯ��
		}
		//preHandle�� return�� ��Ʈ�ѷ� ��û uri�� ���� �ǳ� �� �ǳĸ� �㰡�ϴ� �ǹ�
		//���� true�� �ϸ� ��Ʈ�ѷ� uri�� ���� ��
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
		System.out.println("postHandle ����");

	}
	
}
