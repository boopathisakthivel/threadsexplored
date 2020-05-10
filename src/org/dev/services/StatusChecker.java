package org.dev.services;

public class StatusChecker implements Runnable {
    @Override
    public void run() {
        while(true) {
            try {
                System.out.println("StatusChecker::" + Thread.currentThread().getName());
                // Thread.sleep(1000L);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
