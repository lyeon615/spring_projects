package edu.bit.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LogAop {
	
	@Pointcut("within(edu.bit.aop.*)")
	private void publicM() { }
	
	@Around("publicM()")
	public Object loggerAop(ProceedingJoinPoint joinPoint) throws Throwable {
	
		String signatureStr = joinPoint.getSignature().toString();
		System.out.println(signatureStr + " is start");
		
		long st = System.currentTimeMillis();
		
		try {
			Object obj = joinPoint.proceed();
			return obj;
		}finally {
			long et = System.currentTimeMillis();
			
			System.out.println(signatureStr + "is finished");
			System.out.println(signatureStr + " 걸린 시간 : " + (et-st));
		}
	}
}
