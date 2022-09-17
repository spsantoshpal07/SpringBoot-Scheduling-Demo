package com.example.scheduler.schedulerdemo.tasks;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class SchedulerTasks {
    
    private static final Logger logger = LoggerFactory.getLogger(SchedulerTasks.class);
    private static final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");

    // Running after every 5s
    @Scheduled(fixedRate = 5000)
    public void schedulingTasksWithFixedRate() {
        logger.info("Fixed Rate Scheduling :: Execution Time - {}", dateTimeFormatter.format(LocalDateTime.now()));
    }

    // Running after a fixed Delay of 10s
    @Scheduled(fixedDelay = 10000)
    public void schedulingTasksWithFixedDelay() {
        logger.info("Fixed Delay Scheduling :: Execution Time - {}", dateTimeFormatter.format(LocalDateTime.now()));

        try {
            TimeUnit.SECONDS.sleep(10);
        } catch(InterruptedException e) {
            logger.error("Ran into some problem {}", e);
            throw new IllegalStateException(e);
        }
    }

    // Initial Delay of 5s and there after running after every 2s
    @Scheduled(initialDelay = 5000, fixedRate = 2000)
    public void schedulingTasksWithInitialDelay() {
        logger.info("Fixed Delay Scheduling :: Execution Time - {}", dateTimeFormatter.format(LocalDateTime.now()));
    }
}
