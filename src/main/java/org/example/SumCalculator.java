package org.example;

public class SumCalculator {
    public static int sum (int n){
        int result=n;
        if (n<=0) {
            throw new IllegalArgumentException("\"n\" must be 1 or higher");
        }
            for (int i = 1; i < n; i++) {
                System.out.println(result);
                result+=i;
            }

        return result;
    }
}
