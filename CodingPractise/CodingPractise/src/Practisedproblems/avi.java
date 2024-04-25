package Practisedproblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class avi {
    public static void main(String[] args) {
        String s = "prpptppr";
        int rpct=0;
        int prct=0;
        String updatedstr = s;
        while(updatedstr.contains("pr")||updatedstr.contains("rp"))
        {
            if(updatedstr.contains("pr")) {
                prct+=1;
                int index = updatedstr.indexOf("pr");
                System.out.println(index);
                updatedstr = updatedstr.substring(0, index) + updatedstr.substring(index+2);
                System.out.println(updatedstr);
            }
            if(updatedstr.contains("rp")) {
                rpct+=1;
                int index = updatedstr.indexOf("rp");
                updatedstr = updatedstr.substring(0, index) + updatedstr.substring(index+2);
                System.out.println(updatedstr);
            }
        }
        System.out.println("res: "+(prct*7 + rpct*7));

    }

}
