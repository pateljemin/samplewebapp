package com.quartz;

import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

/**
 * Created By : Jemin
 * Date       : 4/21/17
 * Time       : 10:51 AM
 */
public class QurtzScheduler {

    public static void main(String[] args) throws SchedulerException {

        //Create JOB
        JobDetail jobDetail = JobBuilder.newJob(QuartzJob.class).withIdentity("Sample").build();

        //Create Trigger
        Trigger trigger = QuartzTrigger.getTrigger("sample", 3, 3);

        //Scheduler
        Scheduler scheduler = new StdSchedulerFactory().getScheduler();
        scheduler.start();
        scheduler.scheduleJob(jobDetail, trigger);
    }
}
