import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();
        int largestSum = -63;

        for (int i = 0; i < 6; i++) {
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arrRowItems = new ArrayList<>();

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowTempItems[j]);
                arrRowItems.add(arrItem);
            }

            arr.add(arrRowItems);
        }

        for(int i=0; i<4;i++){
            for(int j=0; j<4;j++){
                int sum = 0;

                for(int t=0;t<3;t++){
                    sum += arr.get(i).get(j+t);
                };

                for(int t=0;t<3;t++){
                    sum += arr.get(i+2).get(j+t);
                };

                sum += arr.get(i+1).get(j+1);

                if(sum>largestSum) largestSum = sum;
            }
        }

        System.out.println(largestSum);
        bufferedReader.close();
    }
}
