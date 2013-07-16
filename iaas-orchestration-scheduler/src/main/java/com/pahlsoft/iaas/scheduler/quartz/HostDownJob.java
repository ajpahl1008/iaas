package com.pahlsoft.iaas.scheduler.quartz;


import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;
import org.springframework.stereotype.Component;

@Component("hostDownJob")
public class HostDownJob extends QuartzJobBean {
	private HostDownTask hostDownTask;
 
	public void setHostDownTask(HostDownTask hostDownTask) {
		this.hostDownTask = hostDownTask;
	}

	protected void executeInternal(JobExecutionContext context)	throws JobExecutionException {
 		hostDownTask.executeTask();
 	}


}
