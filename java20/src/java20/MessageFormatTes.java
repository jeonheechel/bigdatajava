package java20;

import java.text.ChoiceFormat;

public class MessageFormatTes {
	
	 public static void main(String[] args) {
	        double[] jumsu = {0, 60, 70, 80, 90};
	        String[] grade = {"가", "양", "미", "우", "수"};
	        ChoiceFormat cf = new ChoiceFormat(jumsu, grade);
	        int meJumsu = 88;
	        System.out.println(cf.format(meJumsu));
	    

}
}
