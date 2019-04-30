package 생성자;

public class 가족 {
	public static void main(String[] args) {
		System.out.println("상품명 product    예금주 name    예금액 money");
		통장 cash = new 통장("청약저축","김아무개",500);
		통장 cash1 = new 통장("내비상금","이아무개",30);
		통장 cash2 = new 통장("자유적금","박아무개",100);
		System.out.println(cash);
		System.out.println(cash1);
		System.out.println(cash2);
		
		System.out.println("------------------------------");
		System.out.println("내비상금에는 "+cash1.money+"만원이 들어있어요");
		System.out.println("박아무개의 통장 에는 "+cash2.money+"만원이 들어있어요");
		System.out.println("------------------------------");
		System.out.println("전체예금은 "+(cash.money+cash1.money+cash2.money)+"만원입니다");
	
	}
}
