package com.jin.Ex02;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class Map01 extends Mapper<LongWritable, Text, Text, IntWritable>{
//      @Override 오타를 방지하기 위해서라도 꼭 오버라이드를 써라
//      public void map(Text key, Text value, Context output) {
//    	  
//      }
      @Override
      public void map(LongWritable key, Text value, Context output) 
    		  throws IOException, InterruptedException {
    	 AirlineParser ap = new AirlineParser(value);
    	 
    	 if(ap.getDistance()>0) {
    		 output.write(new Text("Distance All"),
    				 new IntWritable(ap.getDistance()));
    		 output.getCounter(DistanceCount.nomZeroCnt).increment(1);
    	 }else if(ap.getDistance()==0) {
    		
    		 output.getCounter(DistanceCount.zeroCnt).increment(1);
    	 }
      }

      
      
   }
   
   
   
   
   

	




