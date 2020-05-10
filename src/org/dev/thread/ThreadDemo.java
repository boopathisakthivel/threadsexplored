package org.dev.thread;

import org.dev.services.DoMail;
import org.dev.services.DoOrder;
import org.dev.services.StatusChecker;

public class ThreadDemo {
    public static void main(String args[]) {

        DoMail mail = new DoMail();
        DoOrder order = new DoOrder();
        StatusChecker checker = new StatusChecker();

        new Thread(checker).start();
        new Thread(order).start();
        new Thread(mail).start();
    }
}
