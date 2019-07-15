package com.itbank.mvc07;

public class BananaTv implements Tv {
	public void powerOn() {
		System.out.println("바나나TV를 켜다");
	}
	public void powerOff() {
		System.out.println("바나나TV를 끄다");
	}
	public void VolumeUp() {
		System.out.println("바나나TV 볼륨 업!");
	}
	public void VolumeDown() {
		System.out.println("바나나TV 볼륨 다운!");
	}
}
