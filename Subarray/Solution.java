import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }

        int negativeSubArrays = 0;

        for(int j=0;j<n;j++){
            for(int k=0;k<n-j;k++){
                int sumSubArray = 0;
                for(int l=j; l<j+k+1;l++){
                    sumSubArray += a[l];
                }
                if(sumSubArray < 0) negativeSubArrays++;
            }
        }

        System.out.println(negativeSubArrays);
    }
}