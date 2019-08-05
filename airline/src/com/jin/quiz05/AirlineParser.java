package com.jin.quiz05;

import org.apache.hadoop.io.Text;

public class AirlineParser {
	private int year;
	private int menth;
	private int dayOfWeek;
	private int cancelled;
	
	final int CANCELLED = 1 ;
	public AirlineParser() {	}
	public AirlineParser(Text value) {	
		String [] airData = value.toString().split(",");
		year = Integer.parseInt(airData[0]);
		menth = Integer.parseInt(airData[1]);
		dayOfWeek = Integer.parseInt(airData[3]);
		cancelled = Integer.parseInt(airData[21]);
	}
	
	public int getDayOfWeek() {
		return dayOfWeek;
	}
	public int getYear() {
		return year;
	}
	public int getCancelled() {
		return cancelled;
	}
	public int getMenth() {
		return menth;
	}
}
