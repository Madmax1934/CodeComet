package StringsPractice;

public class LongestCommonprefix {
    public static void main(String[] args) {
        String str[] ={"geeksforgeeks", "geeks", "geek",
                "geezer"};
        String prefix = str[0];
        for(int i=1;i<str.length;i++)
        {
            while(str[i].indexOf(prefix)!=0)
            {
                prefix = prefix.substring(0,prefix.length()-1);
                if(prefix.isEmpty())
                {
                    System.out.println("");
                }
            }
        }
        System.out.println(prefix);
    }

}