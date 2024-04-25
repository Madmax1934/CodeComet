package StringsPractice;

public class Find1stRepeatedchar {
    public static void main(String[] args) {
        String str = "evjxpnqgmvfjl";
        System.out.println(firstRepChar(str));
    }

    public static String firstRepChar(String s)
    {
        // code here
        int min = s.length();
        int count = 0;
        int charind = 0;
        for(int i=0;i<s.length();i++)
        {
            int ind = s.substring(i+1).indexOf(s.charAt(i));

            if(ind!=-1) ind =ind+i;
            if(ind!=-1 && ind<min)
            {
                min = ind;
                charind=i;
                count++;
            }
            if(Math.abs(i-min)==1)
                break;
        }
       return count>0?String.valueOf(s.charAt(charind)):String.valueOf(-1);
    }
}
