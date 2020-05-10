package org.dev.executor;

import org.dev.services.DoMail;
import org.dev.services.DoOrder;
import org.dev.services.StatusChecker;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultipleFixedPoolExecutorSubmit {
    public static void main(String args[]) {

        DoMail mail = new DoMail();
        DoOrder order = new DoOrder();
        StatusChecker checker = new StatusChecker();

        ExecutorService checkerExecutorService = Executors.newFixedThreadPool(10);
        checkerExecutorService.submit(checker);

        ExecutorService orderExecutorService = Executors.newFixedThreadPool(10);
        orderExecutorService.submit(order);

        ExecutorService emailExecutorService = Executors.newFixedThreadPool(10);
        emailExecutorService.submit(mail);
    }
}
