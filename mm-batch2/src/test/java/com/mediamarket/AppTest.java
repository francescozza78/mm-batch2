package com.mediamarket;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.test.JobLauncherTestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//test  
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = {   
//		"classpath:spring/batch/jobs/mm-job.xml",
//		"classpath:spring/batch/config/test-context.xml" }
//)
public class AppTest {

//	@Autowired
//	private JobLauncherTestUtils jobLauncherTestUtils;
//
//	@Autowired
//	private Mail mail;
	
	
	@Test
	public void launchQueryAndWriteXML() throws Exception {
		System.out.println("test executed");
//		 JobExecution jobExecution = jobLauncherTestUtils.launchJob();
////		jobLauncherTestUtils.launchStep("step1");
//		 assertEquals(BatchStatus.COMPLETED, jobExecution.getStatus());
	}
	
	@Test
	public void sendMailTest(){
		System.out.println("test executed");
//    	mail.sendMail("Yong Mook Kim", "This is text content");
	}
}
