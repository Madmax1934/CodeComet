package Java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class C1 {


    public static void main(String[] args) {
        C1 cobj = new C1();
//        I1 obj = ()->
//            {
//                System.out.println("show method");
//            };

//        I1.staticmethod();
//        cobj.test();
//        cobj.show();

        List<String> arrlist = Arrays.asList("poonam","Vicky","Sachin");

        HashMap<String, Integer> hm = arrlist.stream().collect(Collectors.toMap(Function.identity(),String::length,(e1,e2)->e1,HashMap::new));

        Collections.sort(arrlist,String::compareToIgnoreCase);
        //foreach loop
        arrlist.forEach(System.out::println);

    }

}
