package com.itbank.mvc08;

public class SuperCar implements Car {

	Window window;//윈도우 생성
	String color;
	int speed;
	Door door;
	
	public SuperCar(Window window, String color, int speed, Door door) {
		this.window = window;
		this.color = color;
		this.speed = speed;
		this.door = door;
		
	}

	public SuperCar() {
		
	}
	
	public void setWindow(Window window) {//객체성성후 셋메서드 로 가져온것
		this.window = window;
	}
	public void setDoor(Door door) {//객체성성후 셋메서드로 파라미터 가져온것
		this.door = door;
	}
	
	public void setColor(String color) {
		this.color = color;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public SuperCar(Window window) {//파라미터 있는 생성자
		this.window = window;//스포츠카 객체성성시 윈도우 주소가 있어야 한다
		//매개변수로 받아온것
	}
	public SuperCar(Door door) {//파라미터 있는 생성자로 파라미터 가져온것
		this.door = door;//스포츠카 객체성성시 윈도우 주소가 있어야 한다
		//매개변수로 받아온것
	}
	
	@Override
	public void open() {
		// TODO Auto-generated method stub
		System.out.print("super");
		window.open();
		door.open();
		System.out.println("차색은"+color);
		System.out.println("차속도는"+speed);
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		System.out.print("super");
		window.close();
		door.close();
	}

}
