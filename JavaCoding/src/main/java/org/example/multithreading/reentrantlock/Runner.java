package org.example.multithreading.reentrantlock;

import java.util.Scanner;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Runner {
    /*
    As the name says, ReentrantLock allows threads to enter into the lock on a resource more than once.
    When the thread first enters into the lock, a hold count is set to one. Before unlocking the thread can
    re-enter into lock again and every time hold count is incremented by one. For every unlocks request, hold
    count is decremented by one and when hold count is 0, the resource is unlocked.
     */
    private ReentrantLock lock = new ReentrantLock();
    Condition condition= lock.newCondition();
    private int count =0;
    private void increment()
    {
        for(int i=0;i<1000;i++)
          count++;
    }

    public void firstProcess() throws InterruptedException {
        lock.lock();
        Thread.sleep(1000);
        System.out.println("Process1 acquired the lock..");

        System.out.println("Waiting...");
        System.out.println(Thread.currentThread().getName()+": "+lock.isLocked());
        condition.wait();
        System.out.println("Woken up...");

        increment();
        lock.unlock();
    }

    public void secondProcess() throws InterruptedException {
        Thread.sleep(1000);
        lock.lock();

        System.out.println("Enter the return key...");
        new Scanner(System.in).nextLine();
        System.out.println("Return key pressed!!!");
        condition.signal();

        increment();
        lock.unlock();

    }

    public void finished()
    {
        System.out.println("Count is "+count);
    }
}
