package org.example.corejavacoding;

//You have two numbers number1 and number2, your job is to check the number of borrow operations needed for
// subtraction of number1 from number2. If the subtraction is not possible then return the string not possible.
public class BorrowNumber {
    public static void main(String[] args) {
        int num1=754;
        int num2=658;

        char[] ch1=String.valueOf(num1).toCharArray();
        char[] ch2=String.valueOf(num2).toCharArray();
        int len = ch1.length<ch2.length? ch1.length : ch2.length;
        int count=0;
        if(ch1.length>= ch2.length)
        {

            for(int i=len-1;i>=0;i--)
            {
                if(ch1[i]<ch2[i])
                {
                  count++;
                  if(i>0)
                    ch1[i-1]= (char) (ch1[i-1]-1);
                }
            }
        }
        else {
            for(int i=len-1;i>=0;i--)
            {
                if(ch2[i]<ch1[i])
                {
                    count++;
                    if(i>0)
                      ch2[i-1]= (char) (ch2[i-1]-1);
                }
            }
        }

        System.out.println("Borrow count is "+count);
    }
}
