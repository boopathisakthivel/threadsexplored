package org.dev.services;

public class StatusCheckerLimited implements Runnable {
    @Override
    public void run() {
        for(int idx=0; idx<10000; idx++) {
            try {
                System.out.println("StatusCheckerLimited::" + Thread.currentThread().getName());
                // Thread.sleep(1000L);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
