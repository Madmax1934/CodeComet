package org.example.multithreading.semaphore;

public class Shared {

    static int count=0;
    static int increment()
    {
        for(int i=0;i<10;i++)
        {
            count++;
        }
        return count;
    }
}
