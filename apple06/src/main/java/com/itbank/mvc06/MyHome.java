package com.itbank.mvc06;



public class MyHome {
	  static Door woodDoor;//철제문이 됫든 나무문이 되었든  무엇이 되었든 위에있는 부모로 업캐스팅 시켜놓은것이다 
	  //꼭 의존성이 낮은 코드로 만들어야 한다! 상솓 단계가있어야 지만 가능하다
	public static void main(String[] args) {
		woodDoor =  new 빨간나무문();
		woodDoor.open();
		woodDoor.close();
		woodDoor.key();
		woodDoor.made();
		
	}

}
