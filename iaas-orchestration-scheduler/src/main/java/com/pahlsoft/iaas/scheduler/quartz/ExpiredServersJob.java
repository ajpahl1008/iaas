package com.pahlsoft.iaas.scheduler.quartz;


import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;
import org.springframework.stereotype.Component;

@Component("expiredServersJob")
public class ExpiredServersJob extends QuartzJobBean {
	private ExpiredServersTask expiredServersTask;
 
	public void setExpiredServersTask(ExpiredServersTask expiredServersTask) {
		this.expiredServersTask = expiredServersTask;
	}
 
	protected void executeInternal(JobExecutionContext context)	throws JobExecutionException {
		expiredServersTask.printMe();
 	}

}
