import java.io.*;
import java.util.*;


public class Solution {
    public static void main(String[] args) {
        String s = "He is a very very good boy, isn't he?\n";
        int count = 0;
        String[] tokens = s.trim().split("[\\s!,?._'@]+");

        for(String t : tokens){
            if(t.isEmpty()) count++;
        }

        System.out.println(tokens.length-count);

        for(String t : tokens){
            if(!t.isEmpty()) System.out.println(t);
        }
    }
}
