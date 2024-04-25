package org.example.multithreading;

public class ExceptionThrowingTest {
    public static void main(String[] args) {
        Thread t = new Thread(new Runnable() {
            public void run() {
                try {
                    int a = 0;
                    int b = 1;
                    int c = b / a;
                }catch(Exception e) {
                    System.out.println("Caught Exception");
                }
            }
        });
        t.start();
    }

}
