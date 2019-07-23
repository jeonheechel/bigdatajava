package com.itbank.flower;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.util.StopWatch;

public class AspectClass  {

	public void hi() {
		System.out.println("welcome");
	}
	
	public void returnCall(JoinPoint jp, Object returnObj) {
		System.out.println("리턴 값이있어용~======");
		System.out.println((String)returnObj);
		Object[] args = jp.getArgs();
		System.out.println("물건명"+args[0]);
		System.out.println("물건가격"+args[1]);
	}
	
	public void errorCall() {
		System.out.println("에러 발생 에러 발생~~======");
	}
	
	public void aroundCall(ProceedingJoinPoint pjp) throws Throwable {
		StopWatch watch = new StopWatch();
		System.out.println("around Before =======");
		watch.start();
		pjp.proceed();//잡아주는 객체가 필요함
		System.out.println("around After =======");
		watch.stop();
		String method = pjp.getSignature().getName();
		System.out.println(method +" 메소드 수행시간 " + watch.getTotalTimeMillis()+"초");
		
	}
	
	
	
	

}
