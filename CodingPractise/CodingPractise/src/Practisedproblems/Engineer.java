package Practisedproblems;

import java.util.ArrayList;

public class Engineer{
     public static void main(String[] args) {
          String s = "abppprrr";
          int rpct=0;
          int prct=0;
//
          while(s.contains("pr")||s.contains("rp")) {
               for (int i = 0; i < s.length() - 1; i++) {
                    if (s.charAt(i) == 'r' && s.charAt(i + 1) == 'p') {
                         rpct++;
                         s = s.substring(0, i) + s.substring(i + 2);
                    }
                    if (s.charAt(i) == 'p' && s.charAt(i + 1) == 'r') {
                         prct++;
                         s = s.substring(0, i) + s.substring(i + 2);
                    }
                    System.out.println(s);
               }
          }
          System.out.println("res: "+((prct*5)+(rpct*4)));

     }
}
