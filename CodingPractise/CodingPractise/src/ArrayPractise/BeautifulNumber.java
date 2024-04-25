package ArrayPractise;

public class BeautifulNumber {
    public static void main(String[] args) {
        int n = 19;
        int sum = 0,rem=0;
        while(sum!=1){
        do {
            rem=(n % 10);
            sum += rem*rem;
            n = n / 10;
        } while (n > 0);
        System.out.println(sum);
        n = sum;
        sum = 0;
    }
        if(sum==1)
            System.out.println("Beautiful number");

    }
}
