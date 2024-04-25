package org.example.Java8coding.Java8;

interface Parser{
    String parse(String s);
        }

class Converter{

    public String convert(String s) {
        if(s.length()<=3)
            s= s.toUpperCase();
        else
            s=s.toLowerCase();
        return s;
    }
}

class MyPrinter{
    public void print(String str, Parser p)
    {
        str = p.parse(str);
        System.out.println(str);
    }
}
public class MethodReference {
    public static void main(String[] args) {
        Converter cobj = new Converter();
        String str = "Sur";
        MyPrinter mp = new MyPrinter();
        mp.print(str,(cobj::convert));

    }
}
