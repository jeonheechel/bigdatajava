package com.itbank.mvc11;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class AspectClass {
	
	public void login() {
		System.out.println("====로그인!!====");
	}
	public void login2() {
		System.out.println("====보안이 강화된 로그인!!====");
	}
	public void logout() {
		System.out.println("====로그아웃!!====");
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
		System.out.println("around Before =======");
		pjp.proceed();//잡아주는 객체가 필요함
		System.out.println("around After =======");
	}

}
