package com.jin.quiz4;

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
	public void map(LongWritable key, Text value, OutputCollector<Text, IntWritable> output, Reporter arg3)
			throws IOException {
		
		String [] num = value.toString().split(",");
		
		
		
		output.collect(new Text(), new IntWritable(1));
		//output.collect(new Text(airData[3]), new IntWritable(1));
		
	}

}
