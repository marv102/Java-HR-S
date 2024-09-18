import java.util.*;

public class Solution2 {

    private static HashSet<Integer> visitedNodes;
    private static List<Integer> vis = new ArrayList<>();


    public static boolean canWin(int leap, int[] game) {
        visitedNodes = new HashSet<Integer>();
        return foundWinningPath(leap, game, 0) ? true : false;
    }

    public static boolean foundWinningPath(int leap, int[] game, int currentPos){
        if(currentPos>=game.length){
            return true;
        } else if(currentPos < 0 || visitedNodes.contains(currentPos)){
            return false;
        } else if(game[currentPos]==1){
            return false;
        }

        visitedNodes.add(currentPos);
        if(foundWinningPath(leap,game,currentPos+1)) return true;
        if(foundWinningPath(leap,game,currentPos+leap)) return true;
        if(foundWinningPath(leap,game,currentPos-1)) return true;
        return false;
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