package com.jin.quiz07;

import java.io.IOException;
import java.util.Iterator;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapred.MapReduceBase;
import org.apache.hadoop.mapred.OutputCollector;
import org.apache.hadoop.mapred.Reducer;
import org.apache.hadoop.mapred.Reporter;

public class Reduce01 extends MapReduceBase
implements Reducer<Text, IntWritable, Text, IntWritable>{

	private IntWritable getTotalCnt(Iterator<IntWritable> values) {
		int cnt=0;
		
		while(values.hasNext()) {
			cnt +=values.next().get();
		}
		return new IntWritable(cnt);
	}
	
	/*
	 * private Text getDays(int dayValue) { Text key = new Text();
	 * 
	 * switch(dayValue) { case 0 : key.set("1 ~ 10");break; case 1 :
	 * key.set("11 ~ 20");break; case 2 : key.set("21 ~ 31");break; } return key; }
	 */
	
	@Override
	public void reduce(Text key, Iterator<IntWritable> values, 
			OutputCollector<Text, IntWritable> output, Reporter arg3)
			throws IOException {
		
		output.collect(
			key, 
			getTotalCnt(values)
		);
	}


}
