package com.jin.Ex03;

import org.apache.hadoop.conf.Configured;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.lib.input.FileInputFormat;
import org.apache.hadoop.mapreduce.lib.input.TextInputFormat;
import org.apache.hadoop.mapreduce.lib.output.FileOutputFormat;
import org.apache.hadoop.mapreduce.lib.output.TextOutputFormat;
import org.apache.hadoop.util.Tool;
import org.apache.hadoop.util.ToolRunner;



public class Ex01Main extends Configured
implements Tool{
	   public static void main(String[] args) throws Exception {
	      System.exit( ToolRunner.run(new Ex01Main(), args));
	   }

	   @Override
	   public int run(String[] arg0) throws Exception {
	      Job conf = Job.getInstance(getConf(), "ArrDep");
	      //mapreduce에 있는 Job을 활용, name을 위에서 정하기 때문에 하위의 것이 필요없음
	      
	      //conf.setJobName("delay test");
	      
	      //출력 형식 지정
	      conf.setOutputKeyClass(Text.class);
	      conf.setOutputValueClass(IntWritable.class);
	      
	      /*//Map01, Reduce01과는 달리 Map과 Reduce 출력 형식이 달라져서 Map 출력형식 지정이필요하다
	      
	      //Map 출력 형식 지정
	      conf.setMapOutputKeyClass(IntWritable.class);
	      conf.setMapOutputValueClass(IntWritable.class);*/
	      
	      //Map Reduce
	      conf.setMapperClass(Map01.class);
	      //conf.setReducerClass(Reduce01.class);
	      
	      //입출력 형식 지정
	      conf.setInputFormatClass(TextInputFormat.class);
	      conf.setOutputFormatClass(TextOutputFormat.class);
	      
	      //입출력 경로 지정
	      FileInputFormat.setInputPaths(conf, new Path(arg0[0]));
	      FileOutputFormat.setOutputPath(conf, new Path(arg0[1]));
	      
	      //실행
	      //JobClient.runJob(conf);
	      conf.waitForCompletion(true);
	      
	      for(DistanceCount di : DistanceCount.values())
	    	  System.out.println(
	    			  di + " : " +
	    	  conf.getCounters().findCounter(di).getValue()
	    			  );
	      
//	      long january =conf.getCounters().findCounter(DistanceCount.january).getValue();
//	      long february = conf.getCounters().findCounter(DistanceCount.february).getValue();
//	      long march =conf.getCounters().findCounter(DistanceCount.march).getValue();
//	      long april = conf.getCounters().findCounter(DistanceCount.april).getValue();
//	      long may =conf.getCounters().findCounter(DistanceCount.may).getValue();
//	      long june = conf.getCounters().findCounter(DistanceCount.june).getValue();
//	      long july =conf.getCounters().findCounter(DistanceCount.july).getValue();
//	      long august = conf.getCounters().findCounter(DistanceCount.august).getValue();
//	      long september =conf.getCounters().findCounter(DistanceCount.september).getValue();
//	      long october = conf.getCounters().findCounter(DistanceCount.october).getValue();
//	      long november =conf.getCounters().findCounter(DistanceCount.november).getValue();
//	      long december = conf.getCounters().findCounter(DistanceCount.december).getValue();
//	      
//	      System.out.println("january : "+january);
//	      System.out.println("february : "+february);
//	      System.out.println("march : "+march);
//	      System.out.println("april : "+april);
//	      System.out.println("may : "+may);
//	      System.out.println("june : "+june);
//	      System.out.println("july : "+july);
//	      System.out.println("august : "+august);
//	      System.out.println("september : "+september);
//	      System.out.println("october : "+october);
//	      System.out.println("november : "+november);
//	      System.out.println("december : "+december);

	      return 0;
	   }
	   
	   
	}