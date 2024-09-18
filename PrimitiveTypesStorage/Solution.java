import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> input = new ArrayList<>();

        int queries = sc.nextInt();
        sc.nextLine();

        for (int i=1; i<=queries; i++){
            String line = sc.nextLine();
            input.add(line);
        }

        int byteMin = (int) -(Math.pow(2.0,8.0) / 2.0);
        int shortMin = (int) -(Math.pow(2.0,16.0)/ 2.0);
        int intMin = (int) -(Math.pow(2.0,32.0) / 2.0);
        int byteMax = (int) ((Math.pow(2.0,8.0) / 2.0) - 1.0);
        int shortMax = (int) ((Math.pow(2.0,16.0) / 2.0) - 1.0);
        int intMax = (int) ((Math.pow(2.0,32.0) / 2.0) - 1.0);

        for(String element : input){
            try{
                Long value = Long.parseLong(element);

                String output = "* long";

                if( value>=intMin && value<=intMax){
                    output = "* int \n" + output;
                }

                if( value>=shortMin && value<=shortMax){
                    output = "* short \n" + output;
                }

                if( value>=byteMin && value<=byteMax) {
                    output = "* byte \n" + output;
                }

                System.out.println(element + " can be fitted in:\n" + output);

            }catch (NumberFormatException numberFormatException){
                System.out.println(element + " can't be fitted anywhere.");
            }
        }
    }

    public static void mainn(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> input = new ArrayList<>();

        int queries = sc.nextInt();
        sc.nextLine();

        for (int i=1; i<=queries; i++){
            String line = sc.nextLine();
            input.add(line);
        }

        for(String element : input){
            try{

                Long value = Long.parseLong(element);
                System.out.print(element + " can be fitted in:\n");
                System.out.print(value>=Byte.MIN_VALUE && value<=Byte.MAX_VALUE ? "* byte \n" : "");
                System.out.print(value>=Short.MIN_VALUE && value<=Short.MAX_VALUE ? "* short \n" : "");
                System.out.print(value>=Integer.MIN_VALUE && value<=Integer.MAX_VALUE ? "* int \n" : "");
                System.out.println("* long");

            }catch (NumberFormatException numberFormatException){
                System.out.println(element + " can't be fitted anywhere.");
            }
        }
    }
}