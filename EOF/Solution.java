import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        List<String> inputs = new ArrayList<String>();

        while(scanner.hasNext()){
            inputs.add(scanner.nextLine());
        }

        for(int i=0;i<inputs.size();i++){
            System.out.println(i+1 + " " +inputs.get(i));

        }
    }
}