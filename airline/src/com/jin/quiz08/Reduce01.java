package com.jin.quiz08;

import java.io.IOException;
import java.util.Iterator;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapred.MapReduceBase;
import org.apache.hadoop.mapred.OutputCollector;
import org.apache.hadoop.mapred.Reducer;
import org.apache.hadoop.mapred.Reporter;

public class Reduce01 extends MapReduceBase
implements Reducer<Text, IntWritable, Text, Text>{

	private Text getTotalCnt(Iterator<IntWritable> values) {
		int delayCnt= 0; 
		int totalCnt= 0;
		int sum= 0;
		
		while(values.hasNext()) {
			totalCnt++;
			
			int delayTime = values.next().get();
			if(delayTime > AirlineParser.NONDELAY) {
				delayCnt++;
			 sum += delayTime;
			}
		}
		//if(delayCnt==0 || totalCnt ==0)
			if(delayCnt * totalCnt ==0)
			return new  Text("sum : 0 ,avg : 0, delayrate : 0");
		
		return new Text(
				String.format("sum : %d ,avg : %.2f, delayrate:%.2f",
				sum,(float)sum/(float)delayCnt, (float)delayCnt/(float)totalCnt*100.0)
				);
	}
	
	
	
	@Override
	public void reduce(Text key, Iterator<IntWritable> values, 
			OutputCollector<Text, Text> output, Reporter arg3)
			throws IOException {
		
		output.collect(
			key, 
			getTotalCnt(values)
		);
	}


}
