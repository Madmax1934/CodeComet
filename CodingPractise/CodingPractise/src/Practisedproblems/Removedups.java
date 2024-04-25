package Practisedproblems;

import java.util.HashMap;
import java.util.Map;

public class Removedups {
    public static void main(String[] args) {

     MyThread newThread = new MyThread();
     newThread.start();

    }
    static class MyThread extends Thread
    {
        @Override
        public void run() {
            for(int i=1;i<5;i++)
                System.out.println(i*=5);
        }
        //System.out.println("Thread fnished executing");
    }
}
