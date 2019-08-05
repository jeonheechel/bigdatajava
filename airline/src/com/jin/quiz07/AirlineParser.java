package com.jin.quiz07;

import org.apache.hadoop.io.Text;

public class AirlineParser {
	private int year;
	private int month;
	private int dayOfWeek;
	private int cancelled;
	private int dayofMonth;
	private String UniqueCarrier;
	private int CarrierDelay;
	
	final int CANCELLED = 1;
	final int NONAIRFLIGHT = 0;
	final static int SUSPENSIONOFAIRLINNE = -1;
	
	public AirlineParser() {	}
	public AirlineParser(Text value) {	
		String [] airData = value.toString().split(",");
		year = Integer.parseInt(airData[0]);
		month = Integer.parseInt(airData[1]);
		dayofMonth = Integer.parseInt(airData[2]);
		dayOfWeek = Integer.parseInt(airData[3]);
		cancelled = Integer.parseInt(airData[21]);
		UniqueCarrier = airData[8];
		
		
		if("NA".equalsIgnoreCase(airData[24]))
		//if("NA".equals(airData[24].toUpperCase())) 
			CarrierDelay = SUSPENSIONOFAIRLINNE;
		
		else
			CarrierDelay = Integer.parseInt(airData[24]);
	}
	
	public String getUniqueCarrier() {
		return UniqueCarrier;
	}
	public int getCarrierDelay() {
		return CarrierDelay;
	}
	public int getDayofMonth() {
		return dayofMonth;
	}
	public int getCANCELLED() {
		return CANCELLED;
	}
	public int getCancelled() {
		return cancelled;
	}
	public int getDayOfWeek() {
		return dayOfWeek;
	}
	public int getYear() {
		return year;
	}
	public int getMonth() {
		return month;
	}
}

