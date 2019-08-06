package com.jin.Ex01;

import org.apache.hadoop.io.Text;

public class AirlineParser {
   private int arrDelay;
   private int depDelay;
   private int cancelled;
   private String UniqueCarrier;
   private int distance;
   
   
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
   
   public int getDistance() {
	return distance;
}

public AirlineParser(Text value) {
      String[] airData = value.toString().split(",");
      
      UniqueCarrier = airData[8];
      
      
      
      
      distance = Integer.parseInt(airData[18]);
   }

   public String getUniqueCarrier() {
      return UniqueCarrier;
   }

   public int getArrDelay() {
      return arrDelay;
   }

   public int getDepDelay() {
      return depDelay;
   }

   public int getCancelled() {
      return cancelled;
   }
   
   

   
   
   
}