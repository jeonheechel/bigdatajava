package 인터페이스;

public interface Shop extends Circle, Pay {

	@Override
	 default void size() {
		// TODO Auto-generated method stub
		System.out.println("");
	}

	@Override
	default void 계산하다() {
		// TODO Auto-generated method stub
		System.out.println("");
	}

	@Override
	 default void 반지름을구하다() {
		// TODO Auto-generated method stub
		System.out.println("");
	}

}
