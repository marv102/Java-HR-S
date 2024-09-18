import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution{
    public static void main(String[] args){
        String reg = "<(.+)>([^<]+)<\\/\\1>";
        Pattern pattern = Pattern.compile(reg);

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String line = in.nextLine();
            boolean isMatch = false;
            Matcher matcher = pattern.matcher(line);

            while(matcher.find()){
                System.out.println(matcher.group(2));
                isMatch = true;
            }
            if(!isMatch){
                System.out.println("None");
            }
            testCases--;
        }
    }
}



