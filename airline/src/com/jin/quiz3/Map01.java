package com.jin.quiz3;

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
		
		//String [] airData = value.toString().split(",");
		AirlineParser ap = new AirlineParser(value);
		String yearMenth = String.format("%d년 %02d월",ap.getYear(),Integer.parseInt(ap.getMenth()));//ap.menth가 string이기때문에 Integer.parseInt()로 감싸줘야 한다
		//2008년 10월								 
		
		/*
		 * // 10 // 123 yearMenth = String.format("%5d", 10); yearMenth =
		 * String.format("%5d", 123);
		 * 
		 * //00010 //00123 yearMenth = String.format("%5d", 10); yearMenth =
		 * String.format("%5d", 123);
		 */
		
		
		//output.collect(new Text(airData[0]+"년 "+airData[1]+"월"), new IntWritable(1));
		output.collect(new Text(yearMenth), new IntWritable(1));
		
	}

}
