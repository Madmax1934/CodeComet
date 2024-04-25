package org.example.corejavacoding;

public class swap2nos {
    public static void main(String[] args) {
        int a =25,b=26;
//        a=a+b;
//        b=a-b;
//        a=a-b;
        System.out.println("a= "+a+" , "+"b= "+b);

        //we can also use XOR operation to optimize the above logic
        a = a ^ b; // XOR operation to swap values
        b = a ^ b; // XOR operation to get the original value of 'a'
        a = a ^ b; // XOR operation to get the original value of 'b'
        System.out.println("a= "+a+" , "+"b= "+b);
    }
}
