package ArrayPractise;

import java.util.Arrays;

public class Arrequals {
    public static void main(String[] args) {
        int a[]={0,1,32,4,15};
        int b[]={32,1,15,4,0};
        int c[] = Arrays.stream(a).map(Arrequals::calcsumofdigits).toArray();
        Arrays.sort(a);
        Arrays.sort(b);
        System.out.println(Arrays.equals(a,b));
        Arrays.stream(c).forEach(System.out::print);
    }

    private static int calcsumofdigits(int i) {
        int sum = 0;
        while(i>0) {
            sum += i % 10;
            i /= 10;
        }
        return sum;
    }
}
