package com.quartz;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 * Created By : Jemin
 * Date       : 4/21/17
 * Time       : 10:46 AM
 */
public class QuartzJob implements Job {

    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        System.out.printf("Hello World");
    }
}
