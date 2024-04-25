package org.example.Misc;

import java.util.Iterator;
import java.util.List;

public class Sample {
    public static void main(String[] args) {
        List<String> stringList = List.of("catac","tomato","xyz");

        //Iterator itr = stringList.iterator();

        Customiterator<String> customiterator = new Customiterator<>(stringList);

        while(customiterator.hasNext())
        {
            StringBuffer sb = new StringBuffer(String.valueOf(customiterator.next()));
            if(sb.reverse().equals(customiterator.next()))
            {
                System.out.println(customiterator.next());
            }

        }
    }
}
