package com.jin.Ex01;

import com.jin.Ex03.DistanceCount;

public class TestEnum {
	
	 public static void main(String[] args) {
		System.out.println(DistanceCount.april);
		System.out.println(DistanceCount.values()[0]);
		
		for(DistanceCount di : DistanceCount.values())
			System.out.println(di + "  ");
	}

}
