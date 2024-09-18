import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> strings = new ArrayList<>();
        List<Integer> integers = new ArrayList<>();

        while(sc.hasNextLine()){
            String line = sc.nextLine();

            if(line.isEmpty()) { break; }

            String[] lines = line.split(" ");
            strings.add(lines[0]);
            integers.add(Integer.parseInt(lines[1]));
        }

        System.out.println("================================");
        for(int i=0; i<=strings.size()-1;i++){
            System.out.printf("%-15s%03d", strings.toArray()[i], integers.toArray()[i]);
            System.out.println("");
        }
        System.out.println("================================");

    }
}
