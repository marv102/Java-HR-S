import java.util.*;

public class Solution {

    private static HashSet<Integer> visitedNodes;

    public static boolean canWin(int leap, int[] game) {
        visitedNodes = new HashSet<Integer>();
        return DFS(leap, game, 0) ? true : false;
    }

    public static boolean DFS(int leap, int[] game, int currentPos){
        //Base Cases
        if(currentPos >= game.length){
            return true;
        } else if(currentPos < 0 || visitedNodes.contains(currentPos)){
            return false;
        } else if(game[currentPos]==1){
            return false;
        }

        //Avoid infinite cycles
        visitedNodes.add(currentPos);

        //Recursive Cases
        return DFS(leap, game, currentPos+1) || DFS(leap,game,currentPos+leap)
                || DFS(leap, game, currentPos-1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}
