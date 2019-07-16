package com.itbank.mvc08;



public class SportsCar implements Car {
	
	Window window;//윈도우 생성
	String color;
	int speed;
	Door door;
	
	
	
	public SportsCar(Window window, String color, int speed, Door door) {//무조건 context.xml에도 이순서대로 꼭해야 한다 안그러면 오류가난다 꼭!
		this.window = window;
		this.color = color;
		this.speed = speed;
		this.door = door;
	}

	public SportsCar() {//기본 생성자
		
	}
	
	public void setWindow(Window window) {//객체성성후 셋메서드로 파라미터 가져온것
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

	public SportsCar(Window window) {//파라미터 있는 생성자로 파라미터 가져온것
		this.window = window;//스포츠카 객체성성시 윈도우 주소가 있어야 한다
		//매개변수로 받아온것
	}
	public SportsCar(Door door) {//파라미터 있는 생성자로 파라미터 가져온것
		this.door = door;//스포츠카 객체성성시 윈도우 주소가 있어야 한다
		//매개변수로 받아온것
	}
	
	@Override
	public void open() {
		// TODO Auto-generated method stub
		System.out.print("sports");
		window.open();
		door.open();
		System.out.println("차색은"+color);
		System.out.println("차속도는"+speed);
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		System.out.print("sports");
		window.close();
		door.close();
	}

}
