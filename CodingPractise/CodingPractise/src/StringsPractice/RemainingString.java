package StringsPractice;

public class RemainingString {
    public static void main(String[] args) {
        String S="iii";
        char ch = 'i';
        int count = 3;
        System.out.println(printString(S,ch,count));

    }
    static String printString(String S, char ch, int count) {
        // code here
        int t =0;
        StringBuffer sb = new StringBuffer(S);
        int index = 0;
        while(count>0) {
            index = sb.indexOf(String.valueOf(ch))+t;
            sb.deleteCharAt(sb.indexOf(String.valueOf(ch)));
            count--;
            t++;
        }
       return sb.isEmpty()?"Empty string":S.substring(index+1);

    }
}
