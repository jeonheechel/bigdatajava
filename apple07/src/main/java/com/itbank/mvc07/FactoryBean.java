package com.itbank.mvc07;

public class FactoryBean {
	
	public static  Object getBean(String name) {//객체생성된걸 넘긴다 모든것을 넘기기 위해 오브젝트를 리턴한다
		Object bean = null;
		if(name.equals("apple")) {
			bean = new AppleTv();
		}else if(name.equals("banana")) {
			bean = new BananaTv();
		}else if(name.equals("cherry")) {
			bean = new CherryTv();
		}else if(name.equals("lg")) {
			bean = new LgTv();
		}
		return bean;
	}

}
