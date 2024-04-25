package org.example.multithreading;

import javax.sound.sampled.FloatControl;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class Worker {

    static Object lock1 = new Object();
    static Object lock2 = new Object();
    static List<Integer> list1 = new ArrayList<>();
    static List<Integer> list2 = new ArrayList<>();
    public static void stageOne() throws InterruptedException {
        synchronized (lock1) {
            Thread.sleep(1);
            list1.add(new Random().nextInt(100));
        }
    }

    private static void stageTwo() throws InterruptedException {
        synchronized (lock2) {
            Thread.sleep(1);
            list2.add(new Random().nextInt(100));
        }
    }
    public static void process() throws InterruptedException {
        for(int i=0;i<1000;i++) {
            stageOne();
            stageTwo();
        }
    }



    public static void main(String[] args) throws InterruptedException {
        Long start = System.currentTimeMillis();
        System.out.println("started at "+ start);
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    process();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    process();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        t1.start();
        t2.start();

        t1.join();
        t2.join();

        Long end = System.currentTimeMillis();
        System.out.println("Ended at "+end);
        System.out.println("Total time= "+(end-start));
        System.out.println("List1 size= "+list1.size()+" List2 size = "+list2.size());
    }
}
