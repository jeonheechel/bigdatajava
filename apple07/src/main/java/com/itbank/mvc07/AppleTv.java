package com.itbank.mvc07;

public class AppleTv implements Tv {
	public void powerOn() {
		System.out.println("애플TV를 켜다");
	}
	public void powerOff() {
		System.out.println("애플TV를 끄다");
	}
	public void VolumeUp() {
		System.out.println("애플TV 볼륨 업!");
	}
	public void VolumeDown() {
		System.out.println("애플TV 볼륨 다운!");
	}
}
