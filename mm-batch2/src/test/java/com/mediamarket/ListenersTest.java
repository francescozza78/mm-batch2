package com.mediamarket;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.test.JobLauncherTestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = {
//		"classpath:spring/batch/jobs/mm-job.xml",
//		"classpath:spring/batch/config/test-context.xml" })
public class ListenersTest {

//	@Autowired
//	private JobLauncherTestUtils jobLauncherTestUtils;
//
//	@Autowired
//	private Mail mail;
//	
	
	@Test
	public void launchQueryAndWriteXML() throws Exception {
//		 JobExecution jobExecution = jobLauncherTestUtils.launchJob();
////		jobLauncherTestUtils.launchStep("step1");
//		 assertEquals(BatchStatus.COMPLETED, jobExecution.getStatus());
		System.out.println("test executed");
	}
	
}
