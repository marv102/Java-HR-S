import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        boolean ret = isAnagram("anagram", "marganaa");
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }

    static boolean isAnagram(String a, String b) {
        String A = a.toLowerCase();
        String B = b.toLowerCase();

        int[] chars = new int[26];

        for(char c : A.toCharArray()){
            chars[c - 'a']++;
        }

        for(char c : B.toCharArray()){
            chars[c - 'a']--;
        }

        for(int c : chars){
            if(c != 0){
                return false;
            }
        }

        return true;

    }
}
