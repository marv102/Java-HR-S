import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numLines = scanner.nextInt();
        List<List<Integer>> numbers = new ArrayList<>();

        for(int i=0; i<numLines;i++){
            int n = scanner.nextInt();
            List<Integer> tempList = new ArrayList<>();

            for(int j=0; j<n; j++){
                int tempNumber = scanner.nextInt();
                tempList.add(tempNumber);
            }

            numbers.add(tempList);
        }


        int numQueries = scanner.nextInt();
        for(int i=0; i<numQueries;i++){
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            try{
                System.out.println(numbers.get(x-1).get(y-1));
            }catch(Exception e){
                System.out.println("ERROR!");
            }

        }
    }
}
