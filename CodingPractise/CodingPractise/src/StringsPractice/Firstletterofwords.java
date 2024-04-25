package StringsPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Firstletterofwords {
    public static void main(String[] args) {
        String b = "G100ee250ks";
        String a = "eek";
        String S = "This is 1907 and 554";
        String[] ch = S.split(" ");
        long result= 0l;
        for(int i=0;i<ch.length;i++)
        {

            if(ch[i].matches("[0-9]+")){
                result=Long.parseLong(ch[i]);
                System.out.println(result);

            }
        }
        Pattern integerPattern = Pattern.compile("-?\\d+");
        Matcher matcher = integerPattern.matcher(b);

        List<String> integerList = new ArrayList<>();
        while (matcher.find()) {
            integerList.add(matcher.group());
        }

        //System.out.println();
    }
}
