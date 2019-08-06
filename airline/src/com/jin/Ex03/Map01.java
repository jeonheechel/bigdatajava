package com.jin.Ex03;

import java.io.IOException;


import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

import com.jin.Ex03.DistanceCount;

public class Map01 extends Mapper<LongWritable, Text, Text, IntWritable>{
//      @Override 오타를 방지하기 위해서라도 꼭 오버라이드를 써라
//      public void map(Text key, Text value, Context output) {
//    	  
//      }
	
      @Override
      public void map(LongWritable key, Text value, Context output) 
    		  throws IOException, InterruptedException {
    	 AirlineParser ap = new AirlineParser(value);
    	 
    	 //이렇게 한줄로 가능하다
    	if(ap.getWeatherDelay() > 0) {
    		output.getCounter(DistanceCount.values()[ap.getMonth()-1]).increment(ap.getWeatherDelay());
    	}
    	 
    	 
//    	 if(ap.getMonth()==1) {
//    		 output.write(new Text("Distance All"),
//    				 new IntWritable(ap.getMonth()));
//    		 output.getCounter(DistanceCount.january).increment(ap.getWeatherDelay());
//    	 }else if(ap.getMonth()==2) {
//    		 output.getCounter(DistanceCount.february).increment(ap.getWeatherDelay());
//    	 }else if(ap.getMonth()==3) {
//    		 output.getCounter(DistanceCount.march).increment(ap.getWeatherDelay());
//    	 }else if(ap.getMonth()==4) {
//    		 output.getCounter(DistanceCount.april).increment(ap.getWeatherDelay());
//    	 }else if(ap.getMonth()==5) {
//    		 output.getCounter(DistanceCount.may).increment(ap.getWeatherDelay());
//    	 }else if(ap.getMonth()==6) {
//    		 output.getCounter(DistanceCount.june).increment(ap.getWeatherDelay());
//    	 }else if(ap.getMonth()==7) {
//    		 output.getCounter(DistanceCount.july).increment(ap.getWeatherDelay());
//    	 }else if(ap.getMonth()==8) {
//    		 output.getCounter(DistanceCount.august).increment(ap.getWeatherDelay());
//    	 }else if(ap.getMonth()==9) {
//    		 output.getCounter(DistanceCount.september).increment(ap.getWeatherDelay());
//    	 }else if(ap.getMonth()==10) {
//    		 output.getCounter(DistanceCount.october).increment(ap.getWeatherDelay());
//    	 }else if(ap.getMonth()==11) {
//    		 output.getCounter(DistanceCount.november).increment(ap.getWeatherDelay());
//    	 }else if(ap.getMonth()==12) {
//    		 output.getCounter(DistanceCount.december).increment(ap.getWeatherDelay());
//    	 }
    	 
    	 
      }

      
      
   }
   
   
   
   
   

	




