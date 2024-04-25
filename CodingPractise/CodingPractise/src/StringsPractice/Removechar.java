package StringsPractice;

public class Removechar {
    public static void main(String[] args) {
        String s1 = "occurrence";
        String s2 = "car";

        System.out.println(removeChars(s1,s2));
    }

    private static String removeChars(String string1, String string2) {
        for(int i=0;i<string2.length();i++)
        {
            string1 = string1.replaceAll(String.valueOf(string2.charAt(i)),"");
        }
        return string1;
    }
}
