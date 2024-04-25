package Practisedproblems;

import java.util.ArrayList;

public class FibonacciSeries {

    public static void main(String[] args) {
        int n = 7;
        int a = 1, b = 1;
        //System.out.println(fibonacci(a, b, n));
        System.out.println(nthfibonacci(n));

    }

    private static int nthfibonacci(int n) {
        int m=n;
        int x=1,y=1;
        return fib(m,x,y);
    }

    private static int fib(int m, int x, int y) {
        int z = 0;
        if(m>2) {
            z = x + y;
            x = y;
            y = z;
            m--;
            return fib(m, x, y);
        }else{
            return z;
        }
    }

    private static ArrayList fibonacci(int a, int b, int n) {
        ArrayList<Integer> ali=new ArrayList<>();
        int c=0;
        while(n!=0)
        {
        c = a + b;
        ali.add(c);
        a = b;
        b = c;
        n--;
    }
        return ali;
}
}
