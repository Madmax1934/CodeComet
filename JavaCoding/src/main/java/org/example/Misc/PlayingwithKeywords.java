package org.example.Misc;

public class PlayingwithKeywords {

    public static int x=10;

    private final int y=5;


    public static int multiplication()
    {
        return 5*5;
    }

    public static int multiplication(int x)
    {
        return x*x;
    }
    public void method1() //static members can only access static variables/methods
                                 //but non-static members can access static vars/methods
    {
        int z=x+y;
        System.out.println(z);
    }
}

