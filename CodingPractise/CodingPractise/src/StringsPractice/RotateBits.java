package StringsPractice;

import javax.print.DocFlavor;
import java.util.ArrayList;

public class RotateBits {
    public static void main(String[] args) {
        int n = 28, d=2;
        System.out.println(rotateBits(n,d));
    }

    private static ArrayList<Integer> rotateBits(int N, int D) {
        ArrayList<Integer> al = new ArrayList<>();
        StringBuffer sb = new StringBuffer();
        int temp = N;
        while(temp>0)
        {
            sb.append(temp%2);
            temp/=2;
        }
        int zeroeslength = 16-sb.length();
        while(zeroeslength!=0)
        {
            sb.append("0");
            zeroeslength--;
        }
        sb.reverse();
        StringBuffer sb1 = afterleftrotate(sb,D);
        al.add(binarytodigit(sb1.toString()));
        StringBuffer sb2 = afterrightrotate(sb,D);
       al.add(binarytodigit(sb2.toString()));
        return al;
    }

    private static Integer binarytodigit(String sb1) {
        String[] strArray = sb1.split(",");
        int sum = 0;
        for(int i=strArray.length-1,j=0;i>=0;i--,j++)
        {
            int power =(int) Math.pow(2,j);
            int digit = Integer.parseInt(strArray[i]);
            sum+=(digit*power);
        }
        return sum;
    }

    private static StringBuffer afterrightrotate(StringBuffer sb, int d) {
        sb.insert(0,sb.substring(sb.length()-d));
        sb.delete(sb.length()-2,sb.length());
        return sb;
    }

    private static StringBuffer afterleftrotate(StringBuffer sb, int d) {
        sb.append(sb.substring(0,d));
        sb.delete(0,d);
        return sb;
    }
}
