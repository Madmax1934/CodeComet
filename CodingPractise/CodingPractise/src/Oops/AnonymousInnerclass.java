package Oops;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

abstract class Abc{
    public abstract void show();

}
public class AnonymousInnerclass {
    public static void main(String[] args) {
        Abc obj = new Abc(){
            public void show()
            {
                System.out.println("In class Abc new show");
            }
        };
        obj.show();

        ArrayList<String> al = (ArrayList<String>) Arrays.asList("apple","ball","cat");
        Comparator<String> cmp = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }

        };

    }
}
