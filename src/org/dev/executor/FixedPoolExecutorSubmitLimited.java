package org.dev.executor;

import org.dev.services.*;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedPoolExecutorSubmitLimited {
    public static void main(String args[]) {

        DoMail mail = new DoMail();
        DoOrderLimited orderLimited = new DoOrderLimited();
        StatusCheckerLimited checkerLimited = new StatusCheckerLimited();

        ExecutorService executorService = Executors.newFixedThreadPool(10);

        for(int idx=0; idx<10; idx++) {
            executorService.submit(checkerLimited);
            executorService.submit(orderLimited);
            executorService.submit(mail);
        }
    }
}
