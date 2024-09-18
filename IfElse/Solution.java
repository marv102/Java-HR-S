import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new               InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();

        String print = N%2 != 0 ? "Weird" : N%2 == 0 && N >= 2 && N <= 5 ? "Not Weird" : N%2 == 0 && N >= 6 && N <= 20 ? "Weird" : N%2 == 0 && N >= 20 ? "Not Weird" : "";
        System.out.println(print);


    }
}

