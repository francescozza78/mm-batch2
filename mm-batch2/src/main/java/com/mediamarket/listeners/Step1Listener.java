package com.mediamarket.listeners;
import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.StepExecutionListener;

import com.mediamarket.Mail;

public class Step1Listener implements StepExecutionListener {
	
	public Mail mail ;

	@Override
	public void beforeStep(StepExecution stepExecution) {
		System.out.println("StepExecutionListener - beforeStep");
	}

	@Override
	public ExitStatus afterStep(StepExecution stepExecution) {
//		if(stepExecution.getReadCount()==0){
//			
//			stepExecution.addFailureException(new Throwable("Nessun record estratto : nessun dato valido per essere aggiornato"));
//		}
		
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