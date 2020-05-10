package org.dev.executor;

import org.dev.services.DoMail;
import org.dev.services.DoOrder;
import org.dev.services.StatusChecker;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedPoolExecutorSubmit {
    public static void main(String args[]) {

        DoMail mail = new DoMail();
        DoOrder order = new DoOrder();
        StatusChecker checker = new StatusChecker();

        ExecutorService executorService = Executors.newFixedThreadPool(10);
        executorService.submit(checker);
        executorService.submit(order);
        executorService.submit(mail);
    }
}
