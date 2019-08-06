package com.jin.Ex03;

import org.apache.hadoop.io.Text;

public class AirlineParser {

   private int month;
   private int WeatherDelay;
   
   
   
   final int CANCELLED = 1;
   final int NONAIRFLIGHT = 0;
   final static int SUSPENSIONOFAIRLINNE= -1;
   final static int NONDELAY= 0;
   
   public AirlineParser() {
      
   }
   
   private int getDigitFromStr(String str, int defaultDigit){
      if("NA".equalsIgnoreCase(str)) return defaultDigit;
      //else else가 없어도 위에 if에 해당하면 return하며 종료되기 때문에
         return Integer.parseInt(str);
      
   }
   
   public AirlineParser(Text value) {
      String[] airData = value.toString().split(",");
      
      
      month = Integer.parseInt(airData[1]);
    
      //WeatherDelay = getDigitFromStr(airData[25], NONDELAY);//na를 처리하는것
      WeatherDelay = getDigitFromStr(airData[25], NONDELAY);//na를 처리하는것
   }

public int getMonth() {
	return month;
}

public int getWeatherDelay() {
	return WeatherDelay;
}

  

   

   
   
   
}