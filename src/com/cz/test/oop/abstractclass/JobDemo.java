package com.cz.test.oop.abstractclass;

public class JobDemo {
	
	public static void main(String[] args){
		
		AbstractJob job1=new JavaCoding();
		
		job1.doJob();
		
		String jobName=job1.getJobName();
		
		System.out.println("job name1="+jobName);
		
		
		AbstractJob job2=new BuildHouse();
		
		job2.doJob();
		String jobName2=job2.getJobName();
		
		System.out.println("job name2="+jobName2);
		
	}

}
