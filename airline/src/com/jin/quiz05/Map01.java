package com.jin.quiz05;

import java.io.IOException;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapred.MapReduceBase;
import org.apache.hadoop.mapred.Mapper;
import org.apache.hadoop.mapred.OutputCollector;
import org.apache.hadoop.mapred.Reporter;

public class Map01 extends MapReduceBase
implements Mapper<LongWritable, Text, Text, IntWritable>{

	@Override
	public void map(LongWritable key, Text value, 
			OutputCollector<Text, IntWritable> output, Reporter arg3)
			throws IOException {
		AirlineParser ap = new AirlineParser(value);
		if(ap.getCancelled() == ap.CANCELLED) {
			String yearmenth = String.format("%d년 %02d월",ap.getYear(),ap.getMenth());
			
			
			output.collect(
					new Text(new Text(yearmenth) ), 
					new IntWritable(1));
		}
		
				
	}

}
