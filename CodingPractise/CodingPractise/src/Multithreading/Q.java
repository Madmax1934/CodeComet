package Multithreading;

public class Q {

    int num;
    boolean valueset = false;
    public synchronized void put(int num)
    {
        while(valueset)
        {
            try{wait();}catch (Exception e){}
        }
        this.num=num;
        System.out.println("Put:"+num);
        valueset=true;
        notify();
    }
    public synchronized void get()
    {
        while(!valueset)
        {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Get:"+num);
        valueset=false;
        notify();
    }
}
