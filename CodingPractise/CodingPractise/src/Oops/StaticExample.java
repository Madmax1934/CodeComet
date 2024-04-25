package Oops;

public class StaticExample {
    private static int count =0;

    public StaticExample(){
        count++;
    }

    public static int getCount() {
        return count;
    }

    public static void main(String[] args) {
        System.out.println("Initial value of count= "+count);
        StaticExample se=new StaticExample();
        System.out.println("count = "+count);
    }
}
