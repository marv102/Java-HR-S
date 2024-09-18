import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B="";
        int lastIndex = A.length()-1;

        for(int i=lastIndex; i>=0; i--){
            B += A.charAt(i);
        }

        if(A.compareTo(B)==0) System.out.println("Yes");
        else System.out.println("No");


    }
}



