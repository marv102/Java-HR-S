import java.util.Locale;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        Integer myInt = sc.nextInt();
        sc.nextLine();
        Double myDouble = sc.nextDouble();
        sc.nextLine();

        String myString = sc.nextLine();



        System.out.println("String: " + myString);
        System.out.println("Double: " + myDouble);
        System.out.println("Int: " + myInt);
    }
}
