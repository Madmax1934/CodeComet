package Multithreading;

public class ThreadDemo2 {
    public static void main(String[] args) throws InterruptedException {
        Thread th1 = new Thread(()->
        {
            for(int i=1;i<5;i++)
            {
                System.out.println(Thread.currentThread()+" = "+i+" is executing..");
            }
            try{
                Thread.sleep(1000);
            }
            catch (Exception e){
                e.printStackTrace();
            }
        });
        Thread th2 = new Thread(()->
        {
            for(int i=6;i<10;i++)
            {
                System.out.println(Thread.currentThread()+" = "+i+" is executing..");
            }
            try{
                Thread.sleep(1000);
            }
            catch (Exception e){
                e.printStackTrace();
            }
        });
        th1.start();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        th2.start();
        th1.join();
        th2.join();


    }
}
