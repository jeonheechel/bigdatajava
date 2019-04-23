package 배열;

public class 배열연습1 {

	public static void main(String[] args) {
						//1번째        2번째        3번째
		String[] names = {"김길동","홍길동","박길동"};//자바에서는 이렇게 쓴다
		System.out.println(names);//주소값이 나온다
		System.out.println(names[0]);
		//위치값을 가지고 배열에 들어있는 값들을 구분
		//위치값=index(인덱스)  , 0부터시작
		System.out.println(names[2]);//마지막것만 찍은것
		
		System.out.println(names.length);//읽기전용 고칠수 없다 개수가 저장되는곳
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);//한바퀴씩 돌아가면서 한개씩 출력한다
		}
		
	}

}
