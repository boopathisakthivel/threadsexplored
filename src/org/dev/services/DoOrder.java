package org.dev.services;

public class DoOrder implements Runnable {
    @Override
    public void run() {
        while(true) {
            try {
                System.out.println("DoOrder::" + Thread.currentThread().getName());
                // Thread.sleep(1000L);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
