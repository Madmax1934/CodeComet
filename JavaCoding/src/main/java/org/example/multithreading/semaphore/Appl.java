package org.example.multithreading.semaphore;

import java.util.concurrent.Semaphore;

public class Appl {
    /*
    A semaphore controls access to a shared resource through the use of a counter. If the counter is greater than zero, then access is allowed.
    If it is zero, then access is denied. What the counter is counting are permits that allow access to the shared resource.
    Thus, to access the resource, a thread must be granted a permit from the semaphore.
========================|
Working of semaphore    |
========================
In general, to use a semaphore, the thread that wants access to the shared resource tries to acquire a permit.

1)If the semaphore’s count is greater than zero, then the thread acquires a permit, which causes the semaphore’s count to be decremented.
2)Otherwise, the thread will be blocked until a permit can be acquired.
3)When the thread no longer needs an access to the shared resource, it releases the permit, which causes the semaphore’s count to be incremented.
4)If there is another thread waiting for a permit, then that thread will acquire a permit at that time.
     */
    public static void main(String[] args) throws InterruptedException {


        Semaphore sem = new Semaphore(1,true);
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    sem.acquire();
                    System.out.println("Thread " + Thread.currentThread().getName() + " has acquired the permit");
                    Shared.increment();
                    sem.release();
                    System.out.println("Thread " + Thread.currentThread().getName() + " has released the permit");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    sem.acquire();
                    System.out.println("Thread " + Thread.currentThread().getName() + " has acquired the permit");
                    System.out.println("count = "+Shared.increment());
                    sem.release();
                    System.out.println("Thread " + Thread.currentThread().getName() + " has released the permit");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        t2.start();
        t1.start();

        t1.join();
        t2.join();

    }
}
