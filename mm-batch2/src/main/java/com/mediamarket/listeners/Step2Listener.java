package com.mediamarket.listeners;
import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.StepExecutionListener;
import org.springframework.beans.factory.annotation.Autowired;

import com.mediamarket.Mail;

public class Step2Listener implements StepExecutionListener {
	
	@Autowired
	Mail mail ;

	@Override
	public void beforeStep(StepExecution stepExecution) {
		System.out.println("StepExecutionListener - beforeStep");
	}

	@Override
	public ExitStatus afterStep(StepExecution stepExecution) {
		mail.sendMail("baravp", "test"+stepExecution.getExitStatus()+"/n"+
	"fine:"+stepExecution.getEndTime());
		return stepExecution.getExitStatus();
	}

	public Mail getMail() {
		return mail;
	}

	public void setMail(Mail mail) {
		this.mail = mail;
	}

}