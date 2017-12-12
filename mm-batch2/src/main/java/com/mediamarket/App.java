package com.mediamarket;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		
//		Logger l = Logger.getLogger("App");
		
		org.apache.log4j.Logger l = org.apache.log4j.Logger.getLogger(App.class);

		String[] springConfig  = 
			{	
				"spring/batch/jobs/mm-job.xml" 
			};
		
		l.debug("spring-config="+springConfig);
		
		ApplicationContext context = 
				new ClassPathXmlApplicationContext(springConfig);
		
		l.info("----------------------------------loading context");
		JobLauncher jobLauncher = (JobLauncher) context.getBean("jobLauncher");
		Job job = (Job) context.getBean("updateWMSJOB");
		l.info("----------------------------------context loaded");
		try {
			l.info("start job execution : " + job.getName());
			
			JobExecution execution = jobLauncher.run(job, new JobParameters());
			l.info("Exit Status : " + execution.getStatus());
			l.info("----------------------------------");
		} catch (Exception e) {
			l.error(e.getMessage());
			e.printStackTrace();
		}
		l.info("----------------------------------DONE");
		System.out.println("Done");

	}
}
