package com.jin.quiz2;

import java.io.IOException;
import java.util.Iterator;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapred.MapReduceBase;
import org.apache.hadoop.mapred.OutputCollector;
import org.apache.hadoop.mapred.Reducer;
import org.apache.hadoop.mapred.Reporter;

public class Reduce01 extends MapReduceBase implements Reducer<Text, IntWritable, Text, IntWritable>{
	   @Override
	   public void reduce(Text key, Iterator<IntWritable> value, OutputCollector<Text, IntWritable> output, Reporter arg3)
	         throws IOException {
	      int cnt=0;   
	      
	      while(value.hasNext() )
	            cnt += value.next().get();
	      
	      output.collect(key,new IntWritable(cnt));
	      
	      
	   }
	    
	}
