package test;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class TimerTest {

    public static void main(String[] args) {
//        new Timer("testTimer").schedule(new TimerTask() {
//            @Override
//            public void run() {
//                System.out.println("TimerTask");
//            }
//        },1000,2000);
//    }
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(10);
        scheduledExecutorService.scheduleAtFixedRate(new Runnable() {
            public void run() {
                System.out.println("schduleTask");
            }
        },1,1, TimeUnit.SECONDS);
    }
}
