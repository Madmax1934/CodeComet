package StringsPractice;

public class Rotatetwoplaces {
    public static void main(String[] args) {
        String s1 = "fsbcnuvqhffbsaqxwp";
        String s2 = "wpfsbcnuvqhffbsaqx";

        StringBuilder sb = new StringBuilder(s1);
        StringBuilder sbb = new StringBuilder(s1);
        if(s1.length()<=2)
        {
            System.out.println(true);
        }

        if(rotateAnticlockwise(sb,s1).equals(s2) || rotateclockwise(sbb,s1).equals(s2))
        {

            System.out.println(true);
        }
        else{
            System.out.println(false);
        }

    }

    private static String rotateclockwise(StringBuilder sb, String str1) {
        sb.insert(0,str1.substring(str1.length()-2));
        sb.delete(sb.length()-2,sb.length());
        return (sb.toString());
    }

    private static String rotateAnticlockwise(StringBuilder sb, String str1) {
        sb.append(str1.substring(0,2));
        sb.delete(0,2);
        return sb.toString();
    }
}
