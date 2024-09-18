import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class Solution{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}

class MyRegex{
    public String pattern = "\\b(([0-9]|00[0-9]|[1-9][0-9]|0[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])\\.){3}([0-9]|00[0-9]|[1-9][0-9]|0[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])\\b";
}