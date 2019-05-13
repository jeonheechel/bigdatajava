package java19;

import java.util.HashMap;

public class MapTest2 {

	public static void main(String[] args) {

		HashMap memberlist = new HashMap();
		Member m1 = new Member("kim", 20, '남', "구로구","011");
		Member m2 = new Member("park", 20, '여' ,"종로","011");
		Member m3 = new Member("kim", 20, '남' ,"구로구","011");
		memberlist.put("m100",m1);
		memberlist.put("m200",m2);
		memberlist.put("m300",m3);
		System.out.println(memberlist);
		
		
	}

}
