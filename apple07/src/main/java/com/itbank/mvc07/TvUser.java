package com.itbank.mvc07;

public class TvUser {
	
	public static void main(String[] args) {
		FactoryBean facotory = new FactoryBean();//업캐스팅을 해서 사용횟수를 확줄인다
		Tv tv = (Tv)FactoryBean.getBean(args[0]);
		tv.powerOn();
		tv.powerOff();
		tv.VolumeUp();
		tv.VolumeDown();
		System.out.println();
		//결합도를 낮추는 코드를 만들어라!
//		LgTv lg = new LgTv();
//		lg.channel();
//		lg.volume();
//		lg.screen();
//		lg.connect();
	}

}
