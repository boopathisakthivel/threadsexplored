package org.dev.services;

public class DoMail implements Runnable {
    @Override
    public void run() {
        System.out.println("DoMail::" + Thread.currentThread().getName());
    }
}
