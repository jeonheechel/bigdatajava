package com.itbank.mvc07;

public class LgTv implements Tv{


@Override
public void powerOn() {
	// TODO Auto-generated method stub
	System.out.println("lgTV를 켜다");
}

@Override
public void powerOff() {
	// TODO Auto-generated method stub
	System.out.println("lgTV를 끄다");
}

@Override
public void VolumeUp() {
	// TODO Auto-generated method stub
	System.out.println("lgTV를 볼륨업");
}

@Override
public void VolumeDown() {
	// TODO Auto-generated method stub
	System.out.println("lgTV를 볼륨다운");
}
}
