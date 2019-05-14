package java20;

import java.text.DecimalFormat;


public class DecimalFormatTes {
	
	public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,##0.0");
        DecimalFormat df2 = new DecimalFormat("#,##0.#");
        System.out.println(df.format(-12345.4567));
        System.out.println(df.format(1234567.4567));
        System.out.println(df.format(1234567));
        System.out.println(df2.format(1234567));
    }

}
