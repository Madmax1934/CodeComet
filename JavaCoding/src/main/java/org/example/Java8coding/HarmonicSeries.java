package org.example.Java8coding;

public class HarmonicSeries {
    public static void main(String[] args) {
        int n=10;
        float sum=0;
        float fractionedsum = 1;
        for(int i=1;i<=n;i++)
        {
            fractionedsum = 1/(float)i;
            sum+=fractionedsum;

        }
        System.out.println("Harmonic series sum="+sum);
    }

}
