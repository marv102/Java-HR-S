import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        List<Integer> numbers = new ArrayList<Integer>(n);

        for(int i=0; i<n;i++){
            int tempInt = scanner.nextInt();
            numbers.add(tempInt);
        }

        int numQueries = scanner.nextInt();
        scanner.nextLine();

        for(int j=0; j<numQueries; j++){
            String action = scanner.nextLine();

            if(action.equals("Insert")){
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                numbers.add(x,y);
                if(scanner.hasNextLine()) scanner.nextLine();
            }
            if(action.equals("Delete")){
                int z = scanner.nextInt();
                numbers.remove(z);
                if(scanner.hasNextLine()) scanner.nextLine();
            }
        }
        System.out.print(numbers.toString().replaceAll("[\\[,\\]]",""));
    }
}
