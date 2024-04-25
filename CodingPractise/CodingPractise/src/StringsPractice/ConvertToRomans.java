package StringsPractice;

public class ConvertToRomans {
    public static void main(String[] args) {
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        int num=29;
        StringBuilder result = new StringBuilder();

        for(int i=0;i< values.length;i++)
        {
            while(num>=values[i])
            {
                num-=values[i];
                result.append(symbols[i]);
            }
        }
        System.out.println(result.toString());
    }
}
