package com.jin.quiz04;

import java.io.IOException;
import java.util.Iterator;

import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapred.MapReduceBase;
import org.apache.hadoop.mapred.OutputCollector;
import org.apache.hadoop.mapred.Reducer;
import org.apache.hadoop.mapred.Reporter;

public class Reduce02 extends MapReduceBase
implements Reducer<IntWritable, IntWritable, Text, IntWritable>{

	private IntWritable getTotalCnt(Iterator<IntWritable> values) {
		int cnt=0;
		
		while(values.hasNext()) {
			cnt +=values.next().get();
		}
		return new IntWritable(cnt);
	}
	private Text getWeek(int idx) {
		Text week = new Text();
		if(idx==1)	week.set("월요일");
		else if(idx==2)	week.set("화요일");
		else if(idx==3)	week.set("수요일");
		else if(idx==4)	week.set("목요일");
		else if(idx==5)	week.set("금요일");
		else if(idx==6)	week.set("토요일");
		else if(idx==7)	week.set("일요일");
		
		return week;
	}
	@Override
	public void reduce(IntWritable key, Iterator<IntWritable> values, 
			OutputCollector<Text, IntWritable> output, Reporter arg3)
			throws IOException {
		
		output.collect(
			getWeek(key.get()), 
			getTotalCnt(values)
		);
	}
}
