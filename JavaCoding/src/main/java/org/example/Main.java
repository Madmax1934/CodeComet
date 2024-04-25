package org.example;

import org.example.Misc.Immutableclass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
        System.out.println("Printing list using java 8");
        List<Integer> mylist = Arrays.asList(1,2,3,4,5);
        mylist.stream().forEach(System.out::println);

        HashMap<String, String> hm = new HashMap<>();
        hm.put("1","first");
        hm.put("2","second");

        Immutableclass immutableclass = new Immutableclass(1, "abcd");
        Immutableclass immutableclass1 = new Immutableclass(2, "pqr");
        Immutableclass immutableclass2 = new Immutableclass(3, "xyz");
        System.out.println("Immutable class details are: ");
        System.out.println(immutableclass.getId()+", "+immutableclass.getName());
        Immutableclass immutableclass3 = new Immutableclass(4, "xyz");
        Immutableclass immutableclass4 = new Immutableclass(5, "lmn");
        System.out.println("Immutable class details are: ");
        System.out.println(immutableclass.getId()+", "+immutableclass.getName());
    }
}