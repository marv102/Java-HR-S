import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> queries = new ArrayList<>();

        Integer queriesAmount = sc.nextInt();
        sc.nextLine();

        for(int i=0 ; i<=queriesAmount-1; i++ ){
            String query = sc.nextLine();
            queries.add(query);
        }

        for(String q : queries){
            String[] params = q.split(" ");
            String output = "";

            for(int i=0; i<=Integer.parseInt(params[2])-1; i++){
                Integer serie = Integer.parseInt(params[0]);
                for(int j=0; j <= i; j++){
                    serie += (int) Math.pow(2,j) * Integer.parseInt(params[1]);
                }
                output+=serie+" ";
            }

            System.out.println(output);
        }
    }
}
