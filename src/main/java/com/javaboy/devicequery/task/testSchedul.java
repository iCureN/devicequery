package com.javaboy.devicequery.task;


import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author shenxt
 */
@Component
public class testSchedul {

    int i=1;
//    @Scheduled(cron = "${cron.timer}")
    public void test(){
        System.out.println(i++);
    }

}
