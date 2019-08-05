package com.jin.quiz06;

import org.apache.hadoop.io.Text;

public class AirlineParser {
	private int year;
	private int month;
	private int dayOfWeek;
	private int cancelled;
	private int dayofMonth;
	
	final int CANCELLED = 1;
	
	public AirlineParser() {	}
	public AirlineParser(Text value) {	
		String [] airData = value.toString().split(",");
		year = Integer.parseInt(airData[0]);
		month = Integer.parseInt(airData[1]);
		dayofMonth = Integer.parseInt(airData[2]);
		dayOfWeek = Integer.parseInt(airData[3]);
		cancelled = Integer.parseInt(airData[21]);
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
