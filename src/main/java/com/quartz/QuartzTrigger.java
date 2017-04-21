package com.quartz;

import org.quartz.SimpleScheduleBuilder;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;

/**
 * Created By : Jemin
 * Date       : 4/21/17
 * Time       : 10:47 AM
 */
public class QuartzTrigger {
    public static Trigger getTrigger(String name, int interval, int repeatTimes) {
        return TriggerBuilder.newTrigger().withIdentity(name).withSchedule(SimpleScheduleBuilder.simpleSchedule().withIntervalInSeconds(interval).withRepeatCount(repeatTimes)).build();
    }
}
