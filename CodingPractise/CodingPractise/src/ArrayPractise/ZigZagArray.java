package ArrayPractise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ZigZagArray {
    public static void main(String[] args) throws FileNotFoundException {
        int n=7;
        int a[]={4, 3, 7, 8, 6, 2, 1};
        //zigzag(a,n);
        try {
            FileInputStream fis = new FileInputStream("/wsapps/popdb/configuration/example-file.txt");
            int byteRead;
            // Read bytes from the file until the end of the file is reached (-1 indicates the end of the file)
            while ((byteRead = fis.read()) != -1) {
                // Process the byte (e.g., print it)
                System.out.print((char) byteRead);
            }
            // Close the FileInputStream when you're done with it
            fis.close();
        }catch (IOException e) {
            e.printStackTrace();
        }

    }


    private static void zigzag(int[] a, int n) {

            for (int i = 1; i < n - 1; i+=2) {
                if (a[i] > a[i - 1] && a[i] > a[i + 1]) {
                    continue;
                } else {
                    //flag = 1;
                    if (a[i] < a[i - 1]) {
                        swapthem(i, i - 1, a);
                    } if (a[i] < a[i + 1]) {
                        swapthem(i, i + 1, a);
                    }
                }
            }


        for(int k:a)
        {
            System.out.print(k+" ");
        }
    }

    private static void swapthem(int i, int i1, int a[]) {
        int temp=0;
        temp = a[i];
        a[i]=a[i1];
        a[i1]=temp;
    }
}
