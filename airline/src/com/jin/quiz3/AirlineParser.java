package com.jin.quiz3;

import org.apache.hadoop.io.Text;

public class AirlineParser {
	private int year;
	private String menth;
	
	public AirlineParser() {
		
		
	}
	public AirlineParser(Text value) {
		String [] airData = value.toString().split(",");
		year = Integer.parseInt(airData[0]);
		menth = airData[1];
		
	}
	public int getYear() {
		return year;
	}
	public String getMenth() {
		return menth;
	}
	
	

}
