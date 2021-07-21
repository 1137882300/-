package com.zhong.task;

import org.quartz.InterruptableJob;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.UnableToInterruptJobException;

/**
 * @author zzh
 * @version 1.0
 * @date 2021/6/24 13:51
 */
public class Demo implements InterruptableJob {
	@Override
	public void interrupt() throws UnableToInterruptJobException {

	}

	@Override
	public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {

	}
}
