package StringsPractice;

import java.util.Arrays;

public class K_Anagramsornot {
    public static void main(String[] args) {
        String s1 = "wurkbxkgkfmlzofn", s2="mczujslxzvhecrpy";
        int k=10    ;

        boolean res = areKanagrams(s1,s2,k);
        System.out.println(res);
    }

    private static boolean areKanagrams(String s1, String s2, int k) {

        if(s1.length()!=s2.length())
            return false;
        char[] sarr1 = s1.toCharArray();
        char[] sarr2 = s2.toCharArray();
        Arrays.sort(sarr1);
        System.out.println(sarr1);
        Arrays.sort(sarr2);
        System.out.println(sarr2);
        for(int i=0;i<s1.length();i++)
        {
                if(k>0)
                {
                    if(sarr1[i]!=sarr2[i])
                    {
                        sarr1[i]=sarr2[i];
                        k--;
                    }
                }
                else{
                    break;
                }

        }
        String mods1 = new String(sarr1); // Convert char array to string
        String mods2 = new String(sarr2);

        return mods1.equals(mods2);
    }
}
