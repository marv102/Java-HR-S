import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {
        Calendar calendar = Calendar.getInstance();

        calendar.set(year, month-1, day);

        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        String[] days = {"SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY",
                "FRIDAY", "SATURDAY"};

        return days[dayOfWeek-1];
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        String res = Result.findDay(8, 5, 2015);
        System.out.println(res);
    }
}
